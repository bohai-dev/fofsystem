package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.domain.CompanyScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.hibernate.validator.constraints.Length;

import java.util.List;


@Mapper
public interface CompanyScoreMapper {
    int deleteByPrimaryKey(String scoreId);

    int insert(CompanyScore record);

    int insertSelective(CompanyScore record);

    CompanyScore selectByPrimaryKey(String scoreId);

    int updateByPrimaryKeySelective(CompanyScore record);

    int updateByPrimaryKey(CompanyScore record);

    @Select(value="select GLOBAL_SEQ.NEXTVAL from dual")
    String generateId();


    List<CompanyScore> selectByConditions(CompanyScore companyScore);

}