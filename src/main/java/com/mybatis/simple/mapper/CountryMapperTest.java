package com.mybatis.simple.mapper;

import com.mybatis.simple.model.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class CountryMapperTest extends BaseMapperTest {
    @Test
    public  void  testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> selectAll = sqlSession.selectList("com.mybatis.simple.mapper.CountryMapper.selectAll");
            for(Country country:selectAll){
                System.out.printf("%4d%6s%4s\n",country.getId(),country.getCountryname(),country.getCountrycode());
            }
        } finally {
            sqlSession.close();
        }
    }

}
