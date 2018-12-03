package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.ProductScoreMapper;
import com.bohai.fofsystem.domain.ProductScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by cxy on 2018/12/3
 */
@Service
public class ProductScoreService {

    @Autowired
    ProductScoreMapper productScoreMapper;

    public int  addProductScore(ProductScore productScore){
        String scoreId=productScoreMapper.generateId();
        productScore.setScoreId(scoreId);
        productScore.setEntryTime(new Date());
        productScore.setIsDelete("0");
        productScore.setUpdateTime(new Date());

        int result=productScoreMapper.insertSelective(productScore);
        return  result;
    }

    public int modifyScore(ProductScore productScore){
        productScore.setUpdateTime(new Date());
        int result=productScoreMapper.updateByPrimaryKeySelective(productScore);

        return result;
    }

    public int logicDelScore(String scoreId){

        ProductScore productScore=new ProductScore();
        productScore.setIsDelete("1");
        productScore.setUpdateTime(new Date());

        return productScoreMapper.updateByPrimaryKeySelective(productScore);

    }


}
