package com.entity.view;

import com.entity.FuwushenqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 服务申请
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fuwushenqing")
public class FuwushenqingView extends FuwushenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核状态的值
		*/
		private String fuwushenqingYesnoValue;



		//级联表 fuwu
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
				* 服务类型的值
				*/
				private String fuwuValue;
			/**
			* 详情
			*/
			private String fuwuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public FuwushenqingView() {

	}

	public FuwushenqingView(FuwushenqingEntity fuwushenqingEntity) {
		try {
			BeanUtils.copyProperties(this, fuwushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核状态的值
			*/
			public String getFuwushenqingYesnoValue() {
				return fuwushenqingYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setFuwushenqingYesnoValue(String fuwushenqingYesnoValue) {
				this.fuwushenqingYesnoValue = fuwushenqingYesnoValue;
			}







				//级联表的get和set fuwu
					/**
					* 获取： 服务编号
					*/
					public String getFuwuBianhao() {
						return fuwuBianhao;
					}
					/**
					* 设置： 服务编号
					*/
					public void setFuwuBianhao(String fuwuBianhao) {
						this.fuwuBianhao = fuwuBianhao;
					}
					/**
					* 获取： 服务名称
					*/
					public String getFuwuName() {
						return fuwuName;
					}
					/**
					* 设置： 服务名称
					*/
					public void setFuwuName(String fuwuName) {
						this.fuwuName = fuwuName;
					}
					/**
					* 获取： 服务封面
					*/
					public String getFuwuPhoto() {
						return fuwuPhoto;
					}
					/**
					* 设置： 服务封面
					*/
					public void setFuwuPhoto(String fuwuPhoto) {
						this.fuwuPhoto = fuwuPhoto;
					}
					/**
					* 获取： 服务类型
					*/
					public Integer getFuwuTypes() {
						return fuwuTypes;
					}
					/**
					* 设置： 服务类型
					*/
					public void setFuwuTypes(Integer fuwuTypes) {
						this.fuwuTypes = fuwuTypes;
					}


						/**
						* 获取： 服务类型的值
						*/
						public String getFuwuValue() {
							return fuwuValue;
						}
						/**
						* 设置： 服务类型的值
						*/
						public void setFuwuValue(String fuwuValue) {
							this.fuwuValue = fuwuValue;
						}
					/**
					* 获取： 详情
					*/
					public String getFuwuContent() {
						return fuwuContent;
					}
					/**
					* 设置： 详情
					*/
					public void setFuwuContent(String fuwuContent) {
						this.fuwuContent = fuwuContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
