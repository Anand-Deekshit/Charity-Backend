package com.boot.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.Implementation.IdRepoImpl;
import com.boot.model.Option;
import com.boot.model.Question;
import com.boot.model.Survey;
import com.boot.model.SurveyMaster;
import com.boot.model.SurveyQuestion;
import com.boot.repository.IdRepository;
import com.boot.repository.OptionsRepository;
import com.boot.repository.QuestionsRepository;
import com.boot.repository.SurveyQuestionRepository;
import com.boot.repository.SurveyRepository;

@RestController
@RequestMapping("charity/")
public class SurveyController {
	
	@Autowired
	private SurveyRepository surveyRepository;
	@Autowired
	private QuestionsRepository questionsRepository;
	@Autowired
	private IdRepository idRepository;
	@Autowired
	private OptionsRepository optionsRepository;
	@Autowired
	private SurveyQuestionRepository surveyQuestionRepo;
	
	private IdRepoImpl idRepo;
	//@Autowired
	//private OptionsRepository optionsRepository;
	
	@RequestMapping(value = "createsurvey", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public Survey createSurvey(@RequestBody SurveyMaster surveyMaster){
		idRepo = new IdRepoImpl();
		int newId = 0;
		Survey mySurvey = new Survey();
		ArrayList<Question> myQuestions;
		ArrayList<Option> myOptions;
		mySurvey.setSurveyname(surveyMaster.getSurveyName());
		mySurvey.setSurveydesc(surveyMaster.getSurveyDesc());
		myQuestions = surveyMaster.getSurveyQuestions();
		myOptions = surveyMaster.getSurveyOptions();
		mySurvey.setSurveyid("S-"+ (idRepository.getMaxId("surveyid") + 1));
		surveyRepository.save(mySurvey);
		insertQuestions(myQuestions, mySurvey.getSurveyid());
		newId = Integer.parseInt(mySurvey.getSurveyid().split("-")[1]);
		idRepository.updateMaxIds("surveyid", newId);
		//insertOptions(myOptions);
		return mySurvey;
	}	
	
	public void insertQuestions(ArrayList<Question> questions, String surveyId) {
			int newId = 0;
			ArrayList<Option> options;
			SurveyQuestion surveyQuestion;
			for(Question question: questions) {
				surveyQuestion = new SurveyQuestion();
				question.setQuestionid("Q-"+ (idRepository.getMaxId("questionid") + 1));
				options = question.getQuestionOptions();
				questionsRepository.save(question);
				insertOptions(options, question.getQuestionid(), surveyId);
				newId = Integer.parseInt(question.getQuestionid().split("-")[1]);
				idRepository.updateMaxIds("questionid", newId);
				surveyQuestion.setQuestionid(question.getQuestionid());
				surveyQuestion.setSurveyid(surveyId);
				surveyQuestionRepo.save(surveyQuestion);
			}
	}
	
	public void insertOptions(ArrayList<Option> options, String questionId, String surveyId) {
			int optionId = 1;
			for(Option option: options) {
				option.setOptionid(optionId++);
				option.setQuestionid(questionId);
				option.setSurveyid(surveyId);
				optionsRepository.save(option);
			}
		
	}
}
