package com.zyg.dao;

import com.zyg.domain.Role;

import java.util.List;


public interface IRoleDao {

    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
