package com.example.bai07txmanager.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {

    int update( @Param("money") double money, @Param("id") int  id);
}
