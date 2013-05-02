package com.lohika.javatc.itkachuk.lesson22;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AnswerItem {
	
	private String text;
		
	private boolean �orrect;

	public AnswerItem() {
	}
	
/*	public AnswerItem(String text, boolean �orrect) {
		super();
		this.text = text;
		this.�orrect = �orrect;
	}*/

	@XmlAttribute(name="correct")
	public boolean isCorrect() {
		return �orrect;
	}

	public void setCorrect(boolean �orrect) {
		this.�orrect = �orrect;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}		
}
