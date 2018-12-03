package com.bohai.fofsystem.controller;

import com.bohai.fofsystem.bean.ReturnBody;
import com.bohai.fofsystem.domain.CompanyScore;
import com.bohai.fofsystem.exception.ErrorConstant;
import com.bohai.fofsystem.exception.FofException;
import com.bohai.fofsystem.service.CompanyScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cxy on 2018/12/3
 */
@RestController
@RequestMapping("/companyscore")
public class CompanyScoreController {

    @Autowired
    CompanyScoreService scoreService;

    @PostMapping("/add")
    public ReturnBody<Integer> addCompanyScore(@RequestBody @Valid CompanyScore companyScore){
        ReturnBody<Integer>  returnBody=new ReturnBody<>();

        int result=scoreService.addScore(companyScore);
        returnBody.setData(result);

        return returnBody;
    }

    @PostMapping("/modify")
    public ReturnBody<Integer> modifyCompanyScore(@RequestBody @Valid CompanyScore companyScore) throws FofException{
       if (StringUtils.isEmpty(companyScore.getScoreId())){
           throw new FofException(ErrorConstant.ID_NOT_EXISTS_ERROR);
       }
       ReturnBody<Integer> returnBody=new ReturnBody<>();
       int result=scoreService.modifyScore(companyScore);
       returnBody.setData(result);
       return  returnBody;

    }

    @GetMapping("/delete")
    public ReturnBody<Integer> deleteCompanyScore(@RequestParam("companyScoreId")String scoreId){
       ReturnBody<Integer> returnBody=new ReturnBody<>();

       int result=scoreService.logicDelScore(scoreId);

       returnBody.setData(result);

       return returnBody;

    }

    @PostMapping("/selectbyconditions")
    public ReturnBody<List<CompanyScore>> selectByConditions(@RequestBody CompanyScore conditionsScore){
        ReturnBody<List<CompanyScore>> returnBody=new ReturnBody<>();
        List<CompanyScore> list=scoreService.selectByConditons(conditionsScore);
        returnBody.setData(list);
        return returnBody;
    }
}
