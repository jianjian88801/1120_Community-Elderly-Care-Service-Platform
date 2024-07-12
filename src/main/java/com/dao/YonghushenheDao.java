package com.dao;

import com.entity.YonghushenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghushenheView;

/**
 * 用户信息修改审核 Dao 接口
 *
 * @author 
 */
public interface YonghushenheDao extends BaseMapper<YonghushenheEntity> {

   List<YonghushenheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
