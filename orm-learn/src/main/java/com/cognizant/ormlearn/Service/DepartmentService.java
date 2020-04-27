package com.cognizant.ormlearn.Service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Repository.DepartmentRepository;
import com.cognizant.ormlearn.model.Department;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Transactional
	public Department  getId(int deptId) {
		LOGGER.info("Start");
		return departmentRepository.findById(deptId).get();
	}
	
	@Transactional
	public void save(Department department) {
		LOGGER.info("Start");
		departmentRepository.save(department);
		LOGGER.info("End");
	}

}
