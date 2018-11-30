package com.bohai.fofsystem.utils;

import java.text.DecimalFormat;
import java.util.UUID;

/**
 * Created by cxy on 2018/11/7
 * 通用工具类
 */
public class CommonUtils {


    /**
     * 根据数字生成指定格式的编号
     * @param num
     * @return
     */
  public static String getShortNo(int num){
      DecimalFormat decimalFormat=new DecimalFormat("00000");
      String str = decimalFormat.format(num);
      System.out.println(str);
      return  str;
  }
    /**
     * 根据数字生成指定格式的编号
     * @param num
     * @return
     */
    public static String getLongNo(int num){
        DecimalFormat decimalFormat=new DecimalFormat("00000");
        String str = decimalFormat.format(num);
        String randomStr=UUID.randomUUID().toString().substring(0,4);
        String number=str+randomStr;
        System.out.println(number);
        return  number;
    }

}


