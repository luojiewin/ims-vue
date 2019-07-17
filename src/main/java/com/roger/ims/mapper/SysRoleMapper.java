package com.roger.ims.mapper;

import com.roger.ims.dto.Role;
import com.roger.ims.entity.SysRole;
import com.roger.ims.entity.SysUser;

import java.util.List;

public interface SysRoleMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table sys_role
	 *
	 * @mbg.generated
	 */
	int insert(SysRole record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table sys_role
	 *
	 * @mbg.generated
	 */
	List<SysRole> selectAll();

	/**  
	 * @Title: selectRole
	 * @Description: 查询角色
	 * @param role
	 * @return  List<Role>
	 */  
	List<Role> selectRole(Role role);


	/**  
	 * @Title: updateRole
	 * @Description: 更新角色信息
	 * @param role
	 * @return  
	 */  
	int updateRole(SysRole role);


	/**  
	 * @Title: deleteRole
	 * @Description: 批量删除角色信息
	 * @param role
	 * @return  
	 */  
	int deleteRole(List<SysRole> role);
	
	/**  
	 * @Title: getRolesByUser
	 * @Description: 根据用户获取权限
	 * @param user
	 * @return  
	 */  
	List<SysRole> getRolesByUser(SysUser user);
}