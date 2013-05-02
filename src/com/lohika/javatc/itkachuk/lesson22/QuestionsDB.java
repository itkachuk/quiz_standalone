package com.lohika.javatc.itkachuk.lesson22;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="questionsDB")
public class QuestionsDB {
	
	private List<QuestionItem> questions;

	public QuestionsDB() {		
	}
	
	public QuestionsDB(List<QuestionItem> questions) {
		super();
		this.questions = questions;
	}

	@XmlElementWrapper(name="questions")
	@XmlElements(			
		@XmlElement(name="questionItem", type=QuestionItem.class)
	)
	public List<QuestionItem> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionItem> questions) {
		this.questions = questions;
	}
	
	
}
