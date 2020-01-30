package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Question;

public interface QuestionsRepository extends JpaRepository<Question, String>{

}