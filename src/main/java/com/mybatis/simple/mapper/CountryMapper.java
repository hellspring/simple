package com.mybatis.simple.mapper;

import com.mybatis.simple.model.Country;

import java.util.List;

public interface CountryMapper {
    List<Country> selectAll();
}
