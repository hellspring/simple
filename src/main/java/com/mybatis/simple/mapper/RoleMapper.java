package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysRole;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@CacheNamespaceRef(RoleMapper.class)
public interface RoleMapper {

    //@Select({"select id,role_name,enabled,create_by,create_time from sys_role where id =#{id}"})
    SysRole selectById(Long id);

    int updateByMap(@Param("map") Map<String,Object> map);

    List<SysRole> selectAllRoleAndPrivileges();

    List<SysRole> selectRoleByUserIdChoose(Long userId);
    int updateById(SysRole role);
}
