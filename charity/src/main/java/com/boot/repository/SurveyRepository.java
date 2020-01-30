package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Survey;

public interface SurveyRepository extends JpaRepository<Survey, String>{
		
}