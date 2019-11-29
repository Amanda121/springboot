package com.macro.mall.mapper;

import com.macro.mall.model.Aa;
import com.macro.mall.model.AaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AaMapper {
    long countByExample(AaExample example);

    int deleteByExample(AaExample example);

    int insert(Aa record);

    int insertSelective(Aa record);

    List<Aa> selectByExample(AaExample example);

    int updateByExampleSelective(@Param("record") Aa record, @Param("example") AaExample example);

    int updateByExample(@Param("record") Aa record, @Param("example") AaExample example);
}