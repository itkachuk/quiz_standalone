package com.lohika.javatc.itkachuk.lesson22;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;

public class QuestionItem {
	
	private String description;
	
	private List<AnswerItem> answerVariants;
	
	private int complexityLevel;	
	
	public QuestionItem() {
	}

	public QuestionItem(String description, List<AnswerItem> answerVariants,
			int complexityLevel) {
		super();
		this.description = description;
		this.answerVariants = answerVariants;
		this.complexityLevel = complexityLevel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElementWrapper(name="answerVariants")
	@XmlElements(			
		@XmlElement(name="answerItem", type=AnswerItem.class)
	)
	public List<AnswerItem> getAnswerVariants() {
		return answerVariants;
	}

	public void setAnswerVariants(List<AnswerItem> answerVariants) {
		this.answerVariants = answerVariants;
	}

	@XmlAttribute
	public int getComplexityLevel() {
		return complexityLevel;
	}

	public void setComplexityLevel(int complexityLevel) {
		this.complexityLevel = complexityLevel;
	}
		
}
