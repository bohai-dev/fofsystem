package com.bohai.fofsystem.service;

import com.bohai.fofsystem.dao.ProductInfoMapper;
import com.bohai.fofsystem.domain.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by cxy on 2018/11/29
 */
@Service
public class ProductInfoService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    public int add(ProductInfo productInfo){
      String productId=productInfoMapper.generateId();
      productInfo.setProductId(productId);
      productInfo.setIsDelete("0");
      productInfo.setCreateTime(new Date());
      productInfo.setUpdateTime(new Date());

      return productInfoMapper.insertSelective(productInfo);
    }

    public int modify(ProductInfo productInfo){
        productInfo.setUpdateTime(new Date());
        return productInfoMapper.updateByPrimaryKeySelective(productInfo);
    }

    public int logicDel(String productId){

        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId(productId);
        productInfo.setIsDelete("1");
        productInfo.setUpdateTime(new Date());

        return  productInfoMapper.updateByPrimaryKeySelective(productInfo);


    }

}
