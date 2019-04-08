package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysSuggest;

public interface SysSuggestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysSuggest record);

    int insertSelective(SysSuggest record);

    SysSuggest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysSuggest record);

    int updateByPrimaryKeyWithBLOBs(SysSuggest record);

    int updateByPrimaryKey(SysSuggest record);
}