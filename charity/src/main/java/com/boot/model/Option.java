package com.boot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.boot.model.Option.OptionPK;

@Entity
@Table(name = "survey_question_option")
@IdClass(OptionPK.class)
public class Option {

	public static class OptionPK implements Serializable {
		private int optionid;
		private String questionid;
		private String surveyid;

		public OptionPK() {
		}

		public OptionPK(int optionId, String questionId, String surveyId) {
			this.optionid = optionId;
			this.questionid = questionId;
			this.surveyid = surveyId;
		}

	}

	private String optionvalue;
	@Id
	private int optionid;
	@Id
	private String questionid;
	@Id
	private String surveyid;

	public Option() {
	}

	public Option(String optionvalue) {

		this.optionvalue = optionvalue;

	}

	public String getOptionvalue() {
		return optionvalue;
	}

	public void setOptionvalue(String optionvalue) {
		this.optionvalue = optionvalue;
	}

	public int getOptionid() {
		return optionid;
	}

	public void setOptionid(int optionid) {
		this.optionid = optionid;
	}

	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String questionid) {
		this.questionid = questionid;
	}

	public String getSurveyid() {
		return surveyid;
	}

	public void setSurveyid(String surveyid) {
		this.surveyid = surveyid;
	}
}
