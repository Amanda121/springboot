package com.macro.mall.service.impl;

import com.macro.mall.mapper.FirstMapper;
import com.macro.mall.model.First;
import com.macro.mall.model.FirstExample;
import com.macro.mall.model.OmsOrderReturnReasonExample;
import com.macro.mall.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//实现类
//实现TestService接口
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private FirstMapper firstMapper;

    @Override
    public List<First> listAll() {
        return firstMapper.selectByExample(new FirstExample());
    }

    @Override
    public int create(First message) {
        int id = message.getId();
        message.setId(id);
        return firstMapper.insert(message);
    }

    @Override
    public int update(Integer id, First message) {
        message.setId(id);
        return firstMapper.updateByPrimaryKey(message);
    }

    @Override
    public int delete(List<Integer> ids) {
        FirstExample example = new FirstExample();
        example.createCriteria().andIdIn(ids);
        return firstMapper.deleteByExample(example);
    }




}
