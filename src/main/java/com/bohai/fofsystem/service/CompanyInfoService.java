package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.CompanyInfoMapper;
import com.bohai.fofsystem.domain.CompanyInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by cxy on 2018/11/29
 */
@Service
public class CompanyInfoService {

    @Autowired
    CompanyInfoMapper companyInfoMapper;



   public int addCompany(CompanyInfo companyInfo){
       String companyId=companyInfoMapper.generateId();
       companyInfo.setCompanyId(companyId);
       companyInfo.setCreatedTime(new Date());
       companyInfo.setCreatedTime(new Date());
       companyInfo.setIsDelete("0");
       return companyInfoMapper.insertSelective(companyInfo);
   }

   public int modifyCompany(CompanyInfo companyInfo){
       companyInfo.setUpdatedTime(new Date());
       return companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
   }

   public int logicDelCompany(String companyId){
      CompanyInfo companyInfo=new CompanyInfo();
      companyInfo.setCompanyId(companyId);
      companyInfo.setIsDelete("1");
      companyInfo.setUpdatedTime(new Date());
      return companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
   }


   public List<CompanyInfo> selectAll(){

       return  companyInfoMapper.selectAll();

   }



}
