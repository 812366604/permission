package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysNotices;

public interface SysNoticesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysNotices record);

    int insertSelective(SysNotices record);

    SysNotices selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysNotices record);

    int updateByPrimaryKey(SysNotices record);
}