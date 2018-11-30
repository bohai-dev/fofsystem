package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.domain.CompanyScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyScoreMapper {
    int deleteByPrimaryKey(String scoreId);

    int insert(CompanyScore record);

    int insertSelective(CompanyScore record);

    CompanyScore selectByPrimaryKey(String scoreId);

    int updateByPrimaryKeySelective(CompanyScore record);

    int updateByPrimaryKey(CompanyScore record);
}