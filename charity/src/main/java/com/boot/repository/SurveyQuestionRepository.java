package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.SurveyQuestion;

public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, String>{

}
