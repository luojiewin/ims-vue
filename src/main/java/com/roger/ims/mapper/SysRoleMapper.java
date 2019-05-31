package com.roger.ims.mapper;

import com.roger.ims.dto.Role;
import com.roger.ims.entity.SysRole;
import java.util.List;

public interface SysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbg.generated
     */
    int insert(SysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
     *
     * @mbg.generated
     */
    List<SysRole> selectAll();
    
    /**
     * 查询所有角色信息
     */
    List<Role> selectRole(Role role);
    
    /**
     * 更新角色信息
     */
    int updateRole(SysRole role);
    /**
     * 批量删除角色信息
     */
    
    int deleteRole(List<SysRole> role);
}