package com.entity.model;

import com.entity.FuwushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 服务申请
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FuwushenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 服务
     */
    private Integer fuwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer fuwushenqingYesnoTypes;


    /**
     * 审核结果
     */
    private String fuwushenqingYesnoText;


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
	 * 获取：服务
	 */
    public Integer getFuwuId() {
        return fuwuId;
    }


    /**
	 * 设置：服务
	 */
    public void setFuwuId(Integer fuwuId) {
        this.fuwuId = fuwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getFuwushenqingYesnoTypes() {
        return fuwushenqingYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setFuwushenqingYesnoTypes(Integer fuwushenqingYesnoTypes) {
        this.fuwushenqingYesnoTypes = fuwushenqingYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getFuwushenqingYesnoText() {
        return fuwushenqingYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setFuwushenqingYesnoText(String fuwushenqingYesnoText) {
        this.fuwushenqingYesnoText = fuwushenqingYesnoText;
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
