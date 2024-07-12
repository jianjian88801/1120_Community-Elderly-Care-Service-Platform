package com.dao;

import com.entity.FuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuView;

/**
 * 服务信息 Dao 接口
 *
 * @author 
 */
public interface FuwuDao extends BaseMapper<FuwuEntity> {

   List<FuwuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
