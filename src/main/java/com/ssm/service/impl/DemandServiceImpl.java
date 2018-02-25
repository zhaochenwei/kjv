package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.DemandMapper;
import com.ssm.pojo.Demand;
import com.ssm.service.DemandService;
@Service("userService")
public class DemandServiceImpl implements DemandService {

	@Autowired
	private DemandMapper DemandDAO;
	
	@Override
	public Demand getUserById(int id) {
		return this.DemandDAO.selectByPrimaryKey(id);
	}
	
	
}
