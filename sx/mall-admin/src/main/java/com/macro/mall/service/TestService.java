package com.macro.mall.service;

import com.macro.mall.model.First;
import java.util.List;

public interface TestService {

    /**
    * 展示
    */
    List<First> listAll();

    /**
     * 添加
     */
    int create(First message);

    /**
     * 修改
     */
    int update(Integer id, First message);

    /**
     * 批量删除
     */
    int delete(List<Integer> ids);
}
