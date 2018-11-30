package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.domain.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CompanyInfoMapper {
    int deleteByPrimaryKey(String companyId);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);

    @Select(value="select GLOBAL_SEQ.NEXTVAL from dual")
    int generateId();

    @Select("select * from COMPANY_INFO where IS_DELETE='0' ")
    List<CompanyInfo> selectAll();

    List<CompanyInfo> selectByConditions(CompanyInfo companyInfo);
}