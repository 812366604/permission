package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysArticles;

public interface SysArticlesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysArticles record);

    int insertSelective(SysArticles record);

    SysArticles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysArticles record);

    int updateByPrimaryKey(SysArticles record);
}