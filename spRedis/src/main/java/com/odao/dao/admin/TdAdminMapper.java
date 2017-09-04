package com.odao.dao.admin;

import com.odao.model.TdUser;



public interface TdAdminMapper {
	int insert(TdUser record);

	int insertSelective(TdUser record);
}