package com.lohika.javatc.itkachuk.lesson22;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AnswerItem {
	
	private String text;
		
	private boolean ñorrect;

	public AnswerItem() {
	}
	
/*	public AnswerItem(String text, boolean ñorrect) {
		super();
		this.text = text;
		this.ñorrect = ñorrect;
	}*/

	@XmlAttribute(name="correct")
	public boolean isCorrect() {
		return ñorrect;
	}

	public void setCorrect(boolean ñorrect) {
		this.ñorrect = ñorrect;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}		
}
