package com.entity.model;

import com.entity.YonghushenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户信息修改审核
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghushenheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 用户姓名
     */
    private String yonghushenheName;


    /**
     * 头像
     */
    private String yonghushenhePhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String yonghushenhePhone;


    /**
     * 用户身份证号
     */
    private String yonghushenheIdNumber;


    /**
     * 邮箱
     */
    private String yonghushenheEmail;


    /**
     * 审核状态
     */
    private Integer yonghushenheYesnoTypes;


    /**
     * 审核结果
     */
    private String yonghushenheYesnoText;


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
	 * 获取：用户姓名
	 */
    public String getYonghushenheName() {
        return yonghushenheName;
    }


    /**
	 * 设置：用户姓名
	 */
    public void setYonghushenheName(String yonghushenheName) {
        this.yonghushenheName = yonghushenheName;
    }
    /**
	 * 获取：头像
	 */
    public String getYonghushenhePhoto() {
        return yonghushenhePhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setYonghushenhePhoto(String yonghushenhePhoto) {
        this.yonghushenhePhoto = yonghushenhePhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getYonghushenhePhone() {
        return yonghushenhePhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setYonghushenhePhone(String yonghushenhePhone) {
        this.yonghushenhePhone = yonghushenhePhone;
    }
    /**
	 * 获取：用户身份证号
	 */
    public String getYonghushenheIdNumber() {
        return yonghushenheIdNumber;
    }


    /**
	 * 设置：用户身份证号
	 */
    public void setYonghushenheIdNumber(String yonghushenheIdNumber) {
        this.yonghushenheIdNumber = yonghushenheIdNumber;
    }
    /**
	 * 获取：邮箱
	 */
    public String getYonghushenheEmail() {
        return yonghushenheEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setYonghushenheEmail(String yonghushenheEmail) {
        this.yonghushenheEmail = yonghushenheEmail;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getYonghushenheYesnoTypes() {
        return yonghushenheYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setYonghushenheYesnoTypes(Integer yonghushenheYesnoTypes) {
        this.yonghushenheYesnoTypes = yonghushenheYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getYonghushenheYesnoText() {
        return yonghushenheYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setYonghushenheYesnoText(String yonghushenheYesnoText) {
        this.yonghushenheYesnoText = yonghushenheYesnoText;
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
