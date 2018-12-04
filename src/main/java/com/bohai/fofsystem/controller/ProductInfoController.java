package com.bohai.fofsystem.controller;

import com.bohai.fofsystem.bean.ReturnBody;
import com.bohai.fofsystem.domain.ProductInfo;
import com.bohai.fofsystem.exception.ErrorConstant;
import com.bohai.fofsystem.exception.FofException;
import com.bohai.fofsystem.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cxy on 2018/11/30
 */
@RestController
@RequestMapping("/product")
public class ProductInfoController {

    @Autowired
    ProductInfoService productService;

    @PostMapping("/add")
    public ReturnBody<Integer> addProduct(@RequestBody @Valid ProductInfo productInfo) {
        ReturnBody<Integer> returnBody = new ReturnBody<>();
        int result = productService.add(productInfo);
        returnBody.setData(result);
        return returnBody;
    }

    @PostMapping("/modify")
    public ReturnBody<Integer> modifyProduct(@RequestBody @Valid ProductInfo productInfo) throws FofException {
        if (StringUtils.isEmpty(productInfo.getProductId())) {
            throw new FofException(ErrorConstant.ID_NOT_EXISTS_ERROR);
        }
        ReturnBody<Integer> returnBody = new ReturnBody<>();
        int result = productService.modify(productInfo);
        returnBody.setData(result);
        return returnBody;
    }
    @GetMapping("/delete")
    public ReturnBody<Integer> deleteProduct(@RequestParam("productId")String productId){
        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=productService.logicDel(productId);
        returnBody.setData(result);
        return  returnBody;
    }

    @PostMapping("/selectbyconditions")
    public ReturnBody<List<ProductInfo>> selectByConditions(@RequestBody(required=false) ProductInfo productInfo){

        ReturnBody<List<ProductInfo>> returnBody=new ReturnBody<>();
        List<ProductInfo> list=productService.selectByConditions(productInfo);
        returnBody.setData(list);

        return  returnBody;

    }
}
