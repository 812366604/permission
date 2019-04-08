package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.RoleAcl;

public interface RoleAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleAcl record);

    int insertSelective(RoleAcl record);

    RoleAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleAcl record);

    int updateByPrimaryKey(RoleAcl record);
}