package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.domain.ProductScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductScoreMapper {
    int deleteByPrimaryKey(String scoreId);

    int insert(ProductScore record);

    int insertSelective(ProductScore record);

    ProductScore selectByPrimaryKey(String scoreId);

    int updateByPrimaryKeySelective(ProductScore record);

    int updateByPrimaryKey(ProductScore record);

    @Select(value="select GLOBAL_SEQ.NEXTVAL from dual")
    String generateId();
}