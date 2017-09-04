package com.odao.dao.website;

import com.odao.model.TdUser;

public interface TdWebsiteMapper {
	int insert(TdUser record);

	int insertSelective(TdUser record);
}