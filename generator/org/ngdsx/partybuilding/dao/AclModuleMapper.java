package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.AclModule;

public interface AclModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AclModule record);

    int insertSelective(AclModule record);

    AclModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AclModule record);

    int updateByPrimaryKey(AclModule record);
}