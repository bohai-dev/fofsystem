package com.bohai.fofsystem.controller;

import com.bohai.fofsystem.bean.ReturnBody;
import com.bohai.fofsystem.domain.CompanyInfo;
import com.bohai.fofsystem.exception.ErrorConstant;
import com.bohai.fofsystem.exception.FofException;
import com.bohai.fofsystem.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.access.annotation.Secured;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cxy on 2018/11/29
 */
@RestController
@RequestMapping("/company")
public class CompanyInfoController {

    @Autowired
    CompanyInfoService companyInfoService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ReturnBody<Integer> addCompany(@RequestBody @Valid CompanyInfo companyInfo){
       ReturnBody<Integer> returnBody=new ReturnBody<>();
       int result=companyInfoService.addCompany(companyInfo);
       returnBody.setData(result);
       return returnBody;
    }


    @PostMapping("/modify")
    public ReturnBody<Integer> modifyCompany(@RequestBody @Valid CompanyInfo companyInfo) throws FofException{
        if (StringUtils.isEmpty(companyInfo.getCompanyId())){
            throw new FofException(ErrorConstant.ID_NOT_EXISTS_ERROR);
        }
        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=companyInfoService.modifyCompany(companyInfo);
        returnBody.setData(result);
        return  returnBody;
    }
    @Secured("ADMIN")  //  此方法只允许 ADMIN 角色访问
    @GetMapping("/delete")
    public ReturnBody<Integer> deleteById(@RequestParam("companyId")String companyId){
        ReturnBody<Integer> returnBody=new ReturnBody<>();
        int result=companyInfoService.logicDelCompany(companyId);
        returnBody.setData(result);
        return  returnBody;
    }

    @GetMapping("/selectall")
    public ReturnBody<List<CompanyInfo>> selectAll(){
        ReturnBody returnBody=new ReturnBody();
        List<CompanyInfo> list=companyInfoService.selectAll();
        returnBody.setData(list);
        return returnBody;
    }

    @PostMapping("/selectbyconditions")
    public ReturnBody<List<CompanyInfo>> selectByConditions(@RequestBody CompanyInfo companyInfo){
        ReturnBody<List<CompanyInfo>> returnBody=new ReturnBody<>();
        List<CompanyInfo> list=companyInfoService.selectByConditions(companyInfo);
        returnBody.setData(list);

        return  returnBody;

    }
}
