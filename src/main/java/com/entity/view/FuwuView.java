package com.entity.view;

import com.entity.FuwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 服务信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fuwu")
public class FuwuView extends FuwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 服务类型的值
		*/
		private String fuwuValue;



	public FuwuView() {

	}

	public FuwuView(FuwuEntity fuwuEntity) {
		try {
			BeanUtils.copyProperties(this, fuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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









}
