package com.SoftwareProject.beuth;

/**
 * Klasse Question enthält alle wichtigen Daten für das Handling der Fragen inkl. der Antworten.
 * @author #peatTeam
 * @version v1.0.1
 */

public class Question {
	private String questionText;
	private String QuestionTypeTitle;
	private String questionTheme;
	private String[] answers;
	private Boolean[] isCorrect;
	
	/**
	 * Konstruktor der Klasse
	 * @param String Theme Thema der Frage
	 * @param String Text Fragetext
	 * @param String sType Fragetyp
	 * @param String[] answerArray Array mit den Antworttexten
	 * @param Boolean[] isCorrectArray Flag, welche Antworten korrekt sind
	 */
	public Question (String Theme, String Text, String sType, String[] answersArray, Boolean[] isCorrectArray){
		questionText = Text;
		questionTheme = Theme;
		QuestionTypeTitle = sType;
		answers = answersArray;
		isCorrect = isCorrectArray;
	}
	
	/**
	 * Alternativer Konstruktor der Klasse ohne Themenzuordnung (Dabei wird die Frage im Default-Thema "Test" angelegt)
	 * @param String Theme Thema der Frage
	 * @param String Text Fragetext
	 * @param String sType Fragetyp
	 * @param String[] answerArray Array mit den Antworttexten
	 * @param Boolean[] isCorrectArray Flag, welche Antworten korrekt sind
	 */
	public Question (String Text, String sType, String[] answersArray, Boolean[] isCorrectArray){
		questionText = Text;
		questionTheme = "Test";
		QuestionTypeTitle = sType;
		answers = answersArray;
		isCorrect = isCorrectArray;
	}
	
	/**
	 * Methode zum Bereitstellen des Fragentextes (questionText)
	 * @return String Fragetext
	 */
	public String getQuestionText(){
		return questionText;
	}

	/**
	 * Methode zum Bereitstellen des Fragentyps (QuestionTypeTitle)
	 * @return String Fragetyp
	 */
	public String getQuestionTypeTitle(){
		return QuestionTypeTitle;
	}
	
	/**
	 * Methode zum Bereitstellen des Arrays der Antworten (answers)
	 * @return String[] Antworten
	 */
	public String[] getAnswers(){
		return answers;
	}
	
	/**
	 * Methode zum Bereitstellen des Arrays der Flags zur Kennzeichnung der richtigen Antworten (answers)
	 * @return Boolean[] Array mit Flags
	 */
	public Boolean[] getIsCorrectAnswers(){
		return isCorrect;
	}
	
	/**
	 * Methode zum Bereitstellen des Fragenthemas (questionTheme)
	 * @return String Fragethema
	 */
	public String getQuestionTheme(){
		return questionTheme;
	}
	
	/**
	 * Methode zum Setzen des Fragentextes (questionText)
	 * @param String Fragetext
	 */
	public void putQuestionText(String text) {
		questionText = text;
	}
}