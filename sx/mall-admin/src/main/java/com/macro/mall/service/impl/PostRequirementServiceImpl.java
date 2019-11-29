package com.macro.mall.service.impl;

import com.macro.mall.dto.PostRequirementWithNameItem;
import com.macro.mall.service.PostRequirementService;
import java.util.List;
import com.macro.mall.dao.PostRequirementDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostRequirementServiceImpl implements PostRequirementService{

    @Autowired
    private PostRequirementDao postRequirementDao;

    @Override
    public List<PostRequirementWithNameItem> listWithName() {

        return postRequirementDao.listWithName();
    }

}
