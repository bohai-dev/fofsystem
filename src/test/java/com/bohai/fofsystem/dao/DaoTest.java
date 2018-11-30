package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.utils.CommonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by cxy on 2018/11/30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {

    @Autowired
    CompanyInfoMapper companyInfoMapper;

    @Test
    public void getIdTest(){
        int generateId=companyInfoMapper.generateId();
        String companyId=CommonUtils.getShortNo(generateId);
        System.out.println(companyId);
    }
}
