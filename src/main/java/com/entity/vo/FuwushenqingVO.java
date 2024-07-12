package com.entity.vo;

import com.entity.FuwushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 服务申请
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fuwushenqing")
public class FuwushenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 服务
     */

    @TableField(value = "fuwu_id")
    private Integer fuwuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 审核状态
     */

    @TableField(value = "fuwushenqing_yesno_types")
    private Integer fuwushenqingYesnoTypes;


    /**
     * 审核结果
     */

    @TableField(value = "fuwushenqing_yesno_text")
    private String fuwushenqingYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：服务
	 */
    public Integer getFuwuId() {
        return fuwuId;
    }


    /**
	 * 获取：服务
	 */

    public void setFuwuId(Integer fuwuId) {
        this.fuwuId = fuwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getFuwushenqingYesnoTypes() {
        return fuwushenqingYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setFuwushenqingYesnoTypes(Integer fuwushenqingYesnoTypes) {
        this.fuwushenqingYesnoTypes = fuwushenqingYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getFuwushenqingYesnoText() {
        return fuwushenqingYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setFuwushenqingYesnoText(String fuwushenqingYesnoText) {
        this.fuwushenqingYesnoText = fuwushenqingYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
