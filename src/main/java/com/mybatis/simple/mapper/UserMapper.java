package com.mybatis.simple.mapper;

import com.mybatis.simple.model.SysRole;
import com.mybatis.simple.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 通过id查询用户
     */

    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Long userId);

    int insert(SysUser sysUser);

    int insert2(SysUser sysUser);

    int updateById(SysUser sysUser);

    int deleteById(Long id);
    int deleteById(SysUser sysUser);

    List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);

    SysUser selectUserAndRoleById(Long id);
    SysUser selectUserAndRoleById2(Long id);
    SysUser selectUserAndRoleByIdSelect(Long id);

    List<SysUser> selectAllUserAndRoles();

    SysUser selectAllUserAndRolesSelect(Long id);

    void selectUserById(SysUser user);

    List<SysUser> selectUserPage(Map<String,Object> params);

    int insertUserAndRoles(@Param("user")SysUser user,@Param("roleIds")String roleIds);

    int deleteUserById(Long id);
}
