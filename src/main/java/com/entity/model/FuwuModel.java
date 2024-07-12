package com.entity.model;

import com.entity.FuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 服务信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FuwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 服务编号
     */
    private String fuwuBianhao;


    /**
     * 服务名称
     */
    private String fuwuName;


    /**
     * 服务封面
     */
    private String fuwuPhoto;


    /**
     * 服务类型
     */
    private Integer fuwuTypes;


    /**
     * 详情
     */
    private String fuwuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：服务编号
	 */
    public String getFuwuBianhao() {
        return fuwuBianhao;
    }


    /**
	 * 设置：服务编号
	 */
    public void setFuwuBianhao(String fuwuBianhao) {
        this.fuwuBianhao = fuwuBianhao;
    }
    /**
	 * 获取：服务名称
	 */
    public String getFuwuName() {
        return fuwuName;
    }


    /**
	 * 设置：服务名称
	 */
    public void setFuwuName(String fuwuName) {
        this.fuwuName = fuwuName;
    }
    /**
	 * 获取：服务封面
	 */
    public String getFuwuPhoto() {
        return fuwuPhoto;
    }


    /**
	 * 设置：服务封面
	 */
    public void setFuwuPhoto(String fuwuPhoto) {
        this.fuwuPhoto = fuwuPhoto;
    }
    /**
	 * 获取：服务类型
	 */
    public Integer getFuwuTypes() {
        return fuwuTypes;
    }


    /**
	 * 设置：服务类型
	 */
    public void setFuwuTypes(Integer fuwuTypes) {
        this.fuwuTypes = fuwuTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getFuwuContent() {
        return fuwuContent;
    }


    /**
	 * 设置：详情
	 */
    public void setFuwuContent(String fuwuContent) {
        this.fuwuContent = fuwuContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
