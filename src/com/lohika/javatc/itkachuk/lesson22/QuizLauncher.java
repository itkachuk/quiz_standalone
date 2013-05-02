package com.lohika.javatc.itkachuk.lesson22;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class QuizLauncher {
	
	public static Object readXmlFile(String fileName, Class targetClass) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(targetClass);
        Unmarshaller unmarshall = context.createUnmarshaller();
        unmarshall.setSchema(null);
        return unmarshall.unmarshal(new File(fileName));
    }
	
	public static void main(String[] args) throws JAXBException {
		
		QuestionsDB questionsDB = (QuestionsDB) readXmlFile("QuestionsDB.xml", QuestionsDB.class);
		List<QuestionItem> questions = questionsDB.getQuestions();
		
		Scanner scanner = new Scanner(System.in);
		int correctCounter = 0;
		
		for (int qi = 0; qi < questions.size(); qi++) {
			QuestionItem question = questions.get(qi);
			List<AnswerItem> answers = question.getAnswerVariants();
			System.out.println("Вопрос №" + (qi+1) + ", уровень сложности " + question.getComplexityLevel());
			System.out.println(question.getDescription());
			for (int ai = 0; ai < answers.size(); ai++) {
				System.out.println((ai+1) + ". " + answers.get(ai).getText());
			}
			System.out.println("Ваш вариант ответа: ");
			int userAnswer = Integer.parseInt(scanner.nextLine());
			if (answers.get(userAnswer-1).isCorrect()) {
				correctCounter++;
				System.out.println("Правильно!\n");
			} else {
				System.out.println("Ошибка!\n");
			}
		}
		
		System.out.println("Ваш результат: " + correctCounter + " из " + questions.size());
			
	}
}
