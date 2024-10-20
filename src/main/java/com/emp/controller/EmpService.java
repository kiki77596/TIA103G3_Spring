package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.EmpDao;
import com.emp.model.EmpVo;

@Service
public class EmpService {

	@Autowired
	private EmpDao eDao;

	public List<EmpVo> getEmps(){
		return eDao.findAll();
	}

	public EmpVo getEmp(Integer id){
		return eDao.findById(id).get();
	}
}
