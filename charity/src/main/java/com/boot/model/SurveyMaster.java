package com.boot.model;

import java.util.ArrayList;

public class SurveyMaster {
	
	private int surveyId;
	private String surveyName;
	private String surveyDesc;
	private ArrayList<Question> surveyQuestions;
	private ArrayList<Option> surveyOptions;
	
	public SurveyMaster() {}
	
	public SurveyMaster(int surveyId, String surveyName, String surveyDesc, ArrayList<Question> surveyQuestions, ArrayList<Option> surveyOptions) {
		this.surveyId = surveyId;
		this.surveyName = surveyName;
		this.surveyDesc = surveyDesc;
		this.surveyQuestions = surveyQuestions;
		this.surveyOptions = surveyOptions;
	}
	
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}
	public String getSurveyDesc() {
		return surveyDesc;
	}
	public void setSurveyDesc(String surveyDesc) {
		this.surveyDesc = surveyDesc;
	}
	public ArrayList<Question> getSurveyQuestions() {
		return surveyQuestions;
	}
	public void setSurveyQuestions(ArrayList<Question> surveyQuestions) {
		this.surveyQuestions = surveyQuestions;
	}
	public ArrayList<Option> getSurveyOptions() {
		return surveyOptions;
	}
	public void setSurveyOptions(ArrayList<Option> surveyOptions) {
		this.surveyOptions = surveyOptions;
	}
		
}
