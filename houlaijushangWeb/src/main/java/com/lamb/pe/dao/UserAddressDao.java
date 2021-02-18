/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.lamb.pe.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.lamb.pe.entity.UserAddress;

/**
 * 用户地址DAO接口
 * @author dizj
 * @version 2021-02-02
 */
@MyBatisDao
public interface UserAddressDao extends CrudDao<UserAddress> {

    void  updateDefault(String userId);

	
}