
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 用户信息修改审核
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/yonghushenhe")
public class YonghushenheController {
    private static final Logger logger = LoggerFactory.getLogger(YonghushenheController.class);

    @Autowired
    private YonghushenheService yonghushenheService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = yonghushenheService.queryPage(params);

        //字典表数据转换
        List<YonghushenheView> list =(List<YonghushenheView>)page.getList();
        for(YonghushenheView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        YonghushenheEntity yonghushenhe = yonghushenheService.selectById(id);
        if(yonghushenhe !=null){
            //entity转view
            YonghushenheView view = new YonghushenheView();
            BeanUtils.copyProperties( yonghushenhe , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(yonghushenhe.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody YonghushenheEntity yonghushenhe, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,yonghushenhe:{}",this.getClass().getName(),yonghushenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            yonghushenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<YonghushenheEntity> queryWrapper = new EntityWrapper<YonghushenheEntity>()
            .eq("yonghu_id", yonghushenhe.getYonghuId())
            .eq("yonghushenhe_name", yonghushenhe.getYonghushenheName())
            .eq("sex_types", yonghushenhe.getSexTypes())
            .eq("yonghushenhe_phone", yonghushenhe.getYonghushenhePhone())
            .eq("yonghushenhe_id_number", yonghushenhe.getYonghushenheIdNumber())
            .eq("yonghushenhe_email", yonghushenhe.getYonghushenheEmail())
            .eq("yonghushenhe_yesno_types", yonghushenhe.getYonghushenheYesnoTypes())
            .eq("yonghushenhe_yesno_text", yonghushenhe.getYonghushenheYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YonghushenheEntity yonghushenheEntity = yonghushenheService.selectOne(queryWrapper);
        if(yonghushenheEntity==null){
            yonghushenhe.setYonghushenheYesnoTypes(1);
            yonghushenhe.setCreateTime(new Date());
            yonghushenheService.insert(yonghushenhe);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody YonghushenheEntity yonghushenhe, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,yonghushenhe:{}",this.getClass().getName(),yonghushenhe.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            yonghushenhe.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<YonghushenheEntity> queryWrapper = new EntityWrapper<YonghushenheEntity>()
            .notIn("id",yonghushenhe.getId())
            .andNew()
            .eq("yonghu_id", yonghushenhe.getYonghuId())
            .eq("yonghushenhe_name", yonghushenhe.getYonghushenheName())
            .eq("sex_types", yonghushenhe.getSexTypes())
            .eq("yonghushenhe_phone", yonghushenhe.getYonghushenhePhone())
            .eq("yonghushenhe_id_number", yonghushenhe.getYonghushenheIdNumber())
            .eq("yonghushenhe_email", yonghushenhe.getYonghushenheEmail())
            .eq("yonghushenhe_yesno_types", yonghushenhe.getYonghushenheYesnoTypes())
            .eq("yonghushenhe_yesno_text", yonghushenhe.getYonghushenheYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        YonghushenheEntity yonghushenheEntity = yonghushenheService.selectOne(queryWrapper);
        if("".equals(yonghushenhe.getYonghushenhePhoto()) || "null".equals(yonghushenhe.getYonghushenhePhoto())){
                yonghushenhe.setYonghushenhePhoto(null);
        }
        if(yonghushenheEntity==null){
            yonghushenheService.updateById(yonghushenhe);//根据id更新
            if(yonghushenhe.getYonghushenheYesnoTypes() == 2){
                YonghuEntity yonghuEntity = yonghuService.selectById(yonghushenhe.getYonghuId());
                yonghuEntity.setYonghuPhoto(yonghushenhe.getYonghushenhePhoto());
                yonghuEntity.setSexTypes(yonghushenhe.getSexTypes());
                yonghuEntity.setYonghuName(yonghushenhe.getYonghushenheName());
                yonghuEntity.setYonghuEmail(yonghushenhe.getYonghushenheEmail());
                yonghuEntity.setYonghuIdNumber(yonghushenhe.getYonghushenheIdNumber());
                yonghuService.updateById(yonghuEntity);
            }
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        yonghushenheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<YonghushenheEntity> yonghushenheList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            YonghushenheEntity yonghushenheEntity = new YonghushenheEntity();
//                            yonghushenheEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            yonghushenheEntity.setYonghushenheName(data.get(0));                    //用户姓名 要改的
//                            yonghushenheEntity.setYonghushenhePhoto("");//照片
//                            yonghushenheEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            yonghushenheEntity.setYonghushenhePhone(data.get(0));                    //联系方式 要改的
//                            yonghushenheEntity.setYonghushenheIdNumber(data.get(0));                    //用户身份证号 要改的
//                            yonghushenheEntity.setYonghushenheEmail(data.get(0));                    //邮箱 要改的
//                            yonghushenheEntity.setYonghushenheYesnoTypes(Integer.valueOf(data.get(0)));   //审核状态 要改的
//                            yonghushenheEntity.setYonghushenheYesnoText(data.get(0));                    //审核结果 要改的
//                            yonghushenheEntity.setCreateTime(date);//时间
                            yonghushenheList.add(yonghushenheEntity);


                            //把要查询是否重复的字段放入map中
                                //联系方式
                                if(seachFields.containsKey("yonghushenhePhone")){
                                    List<String> yonghushenhePhone = seachFields.get("yonghushenhePhone");
                                    yonghushenhePhone.add(data.get(0));//要改的
                                }else{
                                    List<String> yonghushenhePhone = new ArrayList<>();
                                    yonghushenhePhone.add(data.get(0));//要改的
                                    seachFields.put("yonghushenhePhone",yonghushenhePhone);
                                }
                                //用户身份证号
                                if(seachFields.containsKey("yonghushenheIdNumber")){
                                    List<String> yonghushenheIdNumber = seachFields.get("yonghushenheIdNumber");
                                    yonghushenheIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> yonghushenheIdNumber = new ArrayList<>();
                                    yonghushenheIdNumber.add(data.get(0));//要改的
                                    seachFields.put("yonghushenheIdNumber",yonghushenheIdNumber);
                                }
                        }

                        //查询是否重复
                         //联系方式
                        List<YonghushenheEntity> yonghushenheEntities_yonghushenhePhone = yonghushenheService.selectList(new EntityWrapper<YonghushenheEntity>().in("yonghushenhe_phone", seachFields.get("yonghushenhePhone")));
                        if(yonghushenheEntities_yonghushenhePhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YonghushenheEntity s:yonghushenheEntities_yonghushenhePhone){
                                repeatFields.add(s.getYonghushenhePhone());
                            }
                            return R.error(511,"数据库的该表中的 [联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //用户身份证号
                        List<YonghushenheEntity> yonghushenheEntities_yonghushenheIdNumber = yonghushenheService.selectList(new EntityWrapper<YonghushenheEntity>().in("yonghushenhe_id_number", seachFields.get("yonghushenheIdNumber")));
                        if(yonghushenheEntities_yonghushenheIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(YonghushenheEntity s:yonghushenheEntities_yonghushenheIdNumber){
                                repeatFields.add(s.getYonghushenheIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [用户身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        yonghushenheService.insertBatch(yonghushenheList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
