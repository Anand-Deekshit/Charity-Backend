package com.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "survey_master")
public class Survey {
	@Id
	String surveyid;
	String surveyname;
	String surveydesc;
	
	public Survey() {}
	
	public Survey(String surveyId, String surveyName, String surveyDesc) {
		this.surveyid = surveyId;
		this.surveyname = surveyName;
		this.surveydesc = surveyDesc;
	}

	public String getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(String surveyid) {
		this.surveyid = surveyid;
	}

	public String getSurveyname() {
		return surveyname;
	}

	public void setSurveyname(String surveyname) {
		this.surveyname = surveyname;
	}

	public String getSurveydesc() {
		return surveydesc;
	}

	public void setSurveydesc(String surveydesc) {
		this.surveydesc = surveydesc;
	}
	
	}

