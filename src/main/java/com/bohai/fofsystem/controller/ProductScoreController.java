package com.bohai.fofsystem.controller;

import com.bohai.fofsystem.bean.ReturnBody;
import com.bohai.fofsystem.domain.ProductScore;
import com.bohai.fofsystem.exception.ErrorConstant;
import com.bohai.fofsystem.exception.FofException;
import com.bohai.fofsystem.service.ProductScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cxy on 2018/12/3
 */
@RestController
@RequestMapping("/productscore/")
public class ProductScoreController {

    @Autowired
    ProductScoreService productScoreService;

    @PostMapping("/add")
    public ReturnBody<Integer> addProductScore(@RequestBody @Valid ProductScore productScore){

        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=productScoreService.addProductScore(productScore);

        returnBody.setData(result);

        return returnBody;
    }


    @PostMapping("/modify")
    public ReturnBody<Integer> modifyProductScore(@RequestBody @Valid ProductScore productScore) throws FofException{

        if (StringUtils.isEmpty(productScore.getScoreId())){
            throw new FofException(ErrorConstant.ID_NOT_EXISTS_ERROR);
        }
        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=productScoreService.modifyScore(productScore);
        returnBody.setData(result);

        return  returnBody;

    }


    @GetMapping("/delete")
    public ReturnBody<Integer> deleteProductScore(@RequestParam("scoreId")String scoreId){
        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=productScoreService.logicDelScore(scoreId);
        returnBody.setData(result);

        return returnBody;
    }

    @PostMapping("/selectbyconditions")
    public ReturnBody<List<ProductScore>> selectByConditions(@RequestBody ProductScore conProScore){
        ReturnBody<List<ProductScore>> returnBody=new ReturnBody<>();
        List<ProductScore> list=productScoreService.selectByConditions(conProScore);
        returnBody.setData(list);
        return returnBody;
    }
}
