package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用户信息修改审核
 *
 * @author 
 * @email
 */
@TableName("yonghushenhe")
public class YonghushenheEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghushenheEntity() {

	}

	public YonghushenheEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 用户姓名
     */
    @TableField(value = "yonghushenhe_name")

    private String yonghushenheName;


    /**
     * 头像
     */
    @TableField(value = "yonghushenhe_photo")

    private String yonghushenhePhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 联系方式
     */
    @TableField(value = "yonghushenhe_phone")

    private String yonghushenhePhone;


    /**
     * 用户身份证号
     */
    @TableField(value = "yonghushenhe_id_number")

    private String yonghushenheIdNumber;


    /**
     * 邮箱
     */
    @TableField(value = "yonghushenhe_email")

    private String yonghushenheEmail;


    /**
     * 审核状态
     */
    @TableField(value = "yonghushenhe_yesno_types")

    private Integer yonghushenheYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "yonghushenhe_yesno_text")

    private String yonghushenheYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：用户姓名
	 */
    public String getYonghushenheName() {
        return yonghushenheName;
    }


    /**
	 * 获取：用户姓名
	 */

    public void setYonghushenheName(String yonghushenheName) {
        this.yonghushenheName = yonghushenheName;
    }
    /**
	 * 设置：头像
	 */
    public String getYonghushenhePhoto() {
        return yonghushenhePhoto;
    }


    /**
	 * 获取：头像
	 */

    public void setYonghushenhePhoto(String yonghushenhePhoto) {
        this.yonghushenhePhoto = yonghushenhePhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYonghushenhePhone() {
        return yonghushenhePhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setYonghushenhePhone(String yonghushenhePhone) {
        this.yonghushenhePhone = yonghushenhePhone;
    }
    /**
	 * 设置：用户身份证号
	 */
    public String getYonghushenheIdNumber() {
        return yonghushenheIdNumber;
    }


    /**
	 * 获取：用户身份证号
	 */

    public void setYonghushenheIdNumber(String yonghushenheIdNumber) {
        this.yonghushenheIdNumber = yonghushenheIdNumber;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYonghushenheEmail() {
        return yonghushenheEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setYonghushenheEmail(String yonghushenheEmail) {
        this.yonghushenheEmail = yonghushenheEmail;
    }
    /**
	 * 设置：审核状态
	 */
    public Integer getYonghushenheYesnoTypes() {
        return yonghushenheYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setYonghushenheYesnoTypes(Integer yonghushenheYesnoTypes) {
        this.yonghushenheYesnoTypes = yonghushenheYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getYonghushenheYesnoText() {
        return yonghushenheYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setYonghushenheYesnoText(String yonghushenheYesnoText) {
        this.yonghushenheYesnoText = yonghushenheYesnoText;
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

    @Override
    public String toString() {
        return "Yonghushenhe{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", yonghushenheName=" + yonghushenheName +
            ", yonghushenhePhoto=" + yonghushenhePhoto +
            ", sexTypes=" + sexTypes +
            ", yonghushenhePhone=" + yonghushenhePhone +
            ", yonghushenheIdNumber=" + yonghushenheIdNumber +
            ", yonghushenheEmail=" + yonghushenheEmail +
            ", yonghushenheYesnoTypes=" + yonghushenheYesnoTypes +
            ", yonghushenheYesnoText=" + yonghushenheYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
