package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 商品自定义Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
    /**
     * 关键字查询
     */
    List<PmsProduct> getProductByKey(PmsProductExample example);

}
