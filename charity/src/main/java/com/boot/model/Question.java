package com.boot.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "questions_table")
public class Question {
	@Id
	String questionid;
	int questiontype;
	String question;
	@Transient
	ArrayList<Option> questionOptions;
	
	public Question() {}
	
	public Question(String questionid, int questiontype, String question, ArrayList<Option> questionOptions) {
		this.questionid = questionid;
		this.questiontype = questiontype;
		this.question = question;
		this.questionOptions = questionOptions;
	}
	
	public ArrayList<Option> getQuestionOptions() {
		return questionOptions;
	}

	public void setQuestionOptions(ArrayList<Option> questionOptions) {
		this.questionOptions = questionOptions;
	}

	public int getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(int questiontype) {
		this.questiontype = questiontype;
	}

	public Question(String questionid, String question) {
		this.questionid = questionid;
		this.question = question;
	}
	
	public String getQuestionid() {
		return questionid;
	}

	public void setQuestionid(String string) {
		this.questionid = string;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}



}

