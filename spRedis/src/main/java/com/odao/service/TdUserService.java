package com.odao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odao.dao.admin.TdAdminMapper;
import com.odao.dao.website.TdWebsiteMapper;
import com.odao.model.TdUser;

@Service
public class TdUserService {
	@Autowired
	private TdWebsiteMapper tdWebsiteMapper;

	@Autowired
	private TdAdminMapper tdAdminMapper;

	public int insert(TdUser a, TdUser b) {
		// TODO Auto-generated method stub
		tdAdminMapper.insert(b);
		return tdWebsiteMapper.insert(a);
	}

	public int insertSelective(TdUser a, TdUser b) {
		// TODO Auto-generated method stub
		System.out.println(tdAdminMapper);
		tdAdminMapper.insertSelective(b);
		return tdWebsiteMapper.insertSelective(a);
	}

}