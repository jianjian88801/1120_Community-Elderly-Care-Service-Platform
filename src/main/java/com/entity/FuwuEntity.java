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
 * 服务信息
 *
 * @author 
 * @email
 */
@TableName("fuwu")
public class FuwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuwuEntity() {

	}

	public FuwuEntity(T t) {
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
     * 服务编号
     */
    @TableField(value = "fuwu_bianhao")

    private String fuwuBianhao;


    /**
     * 服务名称
     */
    @TableField(value = "fuwu_name")

    private String fuwuName;


    /**
     * 服务封面
     */
    @TableField(value = "fuwu_photo")

    private String fuwuPhoto;


    /**
     * 服务类型
     */
    @TableField(value = "fuwu_types")

    private Integer fuwuTypes;


    /**
     * 详情
     */
    @TableField(value = "fuwu_content")

    private String fuwuContent;


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
	 * 设置：服务编号
	 */
    public String getFuwuBianhao() {
        return fuwuBianhao;
    }


    /**
	 * 获取：服务编号
	 */

    public void setFuwuBianhao(String fuwuBianhao) {
        this.fuwuBianhao = fuwuBianhao;
    }
    /**
	 * 设置：服务名称
	 */
    public String getFuwuName() {
        return fuwuName;
    }


    /**
	 * 获取：服务名称
	 */

    public void setFuwuName(String fuwuName) {
        this.fuwuName = fuwuName;
    }
    /**
	 * 设置：服务封面
	 */
    public String getFuwuPhoto() {
        return fuwuPhoto;
    }


    /**
	 * 获取：服务封面
	 */

    public void setFuwuPhoto(String fuwuPhoto) {
        this.fuwuPhoto = fuwuPhoto;
    }
    /**
	 * 设置：服务类型
	 */
    public Integer getFuwuTypes() {
        return fuwuTypes;
    }


    /**
	 * 获取：服务类型
	 */

    public void setFuwuTypes(Integer fuwuTypes) {
        this.fuwuTypes = fuwuTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getFuwuContent() {
        return fuwuContent;
    }


    /**
	 * 获取：详情
	 */

    public void setFuwuContent(String fuwuContent) {
        this.fuwuContent = fuwuContent;
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
        return "Fuwu{" +
            "id=" + id +
            ", fuwuBianhao=" + fuwuBianhao +
            ", fuwuName=" + fuwuName +
            ", fuwuPhoto=" + fuwuPhoto +
            ", fuwuTypes=" + fuwuTypes +
            ", fuwuContent=" + fuwuContent +
            ", createTime=" + createTime +
        "}";
    }
}
