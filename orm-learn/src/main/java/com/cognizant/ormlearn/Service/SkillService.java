package com.cognizant.ormlearn.Service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Repository.SkillRepository;
import com.cognizant.ormlearn.model.Skill;

@Service
public class SkillService {
	
	@Autowired
	SkillRepository skillRepository;
	
private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);
	
	@Transactional
	public Skill  getId(int skId) {
		LOGGER.info("Start");
		return skillRepository.findById(skId).get();
	}
	
	@Transactional
	public void save(Skill skill) {
		LOGGER.info("Start");
		skillRepository.save(skill);
		LOGGER.info("End");
	}
}
