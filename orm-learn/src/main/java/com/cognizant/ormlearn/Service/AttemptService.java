package com.cognizant.ormlearn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Repository.AttemptRepository;
import com.cognizant.ormlearn.model.Attempt;

@Service
public class AttemptService {
	@Autowired
	private AttemptRepository attemptRepository;
	public Attempt getAttempt(int userId, int attemptId) {
		return attemptRepository.getAttempt(userId, attemptId);
	}

}
