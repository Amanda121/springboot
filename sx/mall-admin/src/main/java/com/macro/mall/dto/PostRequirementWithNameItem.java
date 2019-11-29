package com.macro.mall.dto;

import com.macro.mall.model.PmsProductCategory;
import java.util.List;

public class PostRequirementWithNameItem extends PmsProductCategory {
    private List<String> children;


    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

}
