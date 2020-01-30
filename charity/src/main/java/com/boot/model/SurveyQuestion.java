package com.boot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.boot.model.SurveyQuestion.SurveyQuestionPK;

@Entity
@Table(name = "survey_question")
@IdClass(SurveyQuestionPK.class)
public class SurveyQuestion {

	public static class SurveyQuestionPK implements Serializable{

		String surveyid;
		String questionid;

		public SurveyQuestionPK() {
		}

		public SurveyQuestionPK(String surveyid, String questionid) {
			this.surveyid = surveyid;
			this.questionid = questionid;
		}

	}

	@Id
	private String surveyid;
	@Id
	private String questionid;

	public String getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(String surveyid) {
		this.surveyid = surveyid;
	}

	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}
}
