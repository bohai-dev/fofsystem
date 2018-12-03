package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.CompanyScoreMapper;
import com.bohai.fofsystem.domain.CompanyScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by cxy on 2018/11/30
 */
@Service
public class CompanyScoreService {

    @Autowired
    private CompanyScoreMapper scoreMapper;

    public int addScore(CompanyScore companyScore){
       String scoreId=scoreMapper.generateId();
       companyScore.setScoreId(scoreId);
       //设置录入时间
       companyScore.setEntryTime(new Date());
       //设置删除标识
       companyScore.setUpdateTime(new Date());
       companyScore.setIsDelete("0");
       return scoreMapper.insertSelective(companyScore);
    }

    public int modifyScore(CompanyScore companyScore){
        companyScore.setUpdateTime(new Date());

        return scoreMapper.updateByPrimaryKeySelective(companyScore);
    }

    public  int logicDelScore(String scoreId){
        CompanyScore companyScore=new CompanyScore();
        companyScore.setScoreId(scoreId);
        companyScore.setIsDelete("1");
        companyScore.setUpdateTime(new Date());
        return scoreMapper.updateByPrimaryKeySelective(companyScore);
    }

    public List<CompanyScore> selectByConditons(CompanyScore conditionScore){
          List<CompanyScore> list=scoreMapper.selectByConditions(conditionScore);
          return list;
    }






}
