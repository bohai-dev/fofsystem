package com.bohai.fofsystem.dao;

import com.bohai.fofsystem.domain.FofUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FofUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(FofUser record);

    int insertSelective(FofUser record);

    FofUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FofUser record);

    int updateByPrimaryKey(FofUser record);

    @Select("select * from FOF_USER WHERE USER_NAME=#{userName}")
    FofUser selectByUserName(@Param("userName") String userName);
}