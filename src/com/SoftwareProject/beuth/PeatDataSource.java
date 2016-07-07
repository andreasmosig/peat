package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

/** 
 * Diese Klasse ist Data Access Object und für das Verwalten der Daten verantwortlich.
 * - unterhält die Datenbankverbindung 
 * - ist für Hinzufügen, Auslesen und Löschen von Datensätzen zuständig
 * - wandelt Datensätze in Java-Objekte um
 * 		(So dass Code der Benutzeroberfläche nicht direkt mit den Datensätzen arbeiten muss.
 * 		Dies nennt man auch mehrschichtige Architektur.)
 * @author #peatTeam
 * @version v1.0.1
 */

public class PeatDataSource {

    private static final String LOG_TAG = PeatDataSource.class.getSimpleName();

    private SQLiteDatabase database;
    private PeatDbHelper dbHelper;
    private Boolean defaultBackButtonPush = false;
    private String currentQuestionID = "";

    /**
     * Konstruktor zur Klasse
     * - loggt wichtige Informationen
     * - legt ein PeatDbHelper Objekt mit dem aktuellen Context an
     * 
     * @param Context context
     */
    public PeatDataSource(Context context) {
        Log.d(LOG_TAG, "DataSource erzeugt dbHelper");
        dbHelper = new PeatDbHelper(context);
    }
    
    /**
     * Methode zum Öffnen der Datenbankverbindung
     * - fragt Referenz zur Datenbank vom dbHelper Objekt ab
     * - loggt wichtige Informationen
     */
    public void open() {
	    Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");
	    database = dbHelper.getWritableDatabase();
	    Log.d(LOG_TAG, "Datenbank-Referenz erhalten. Pfad zur Datenbank: " + database.getPath());
    }
    
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Fragetypen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * 
     * Besonderheit:
     * Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     */
    public void logAllTypes() {
    	dbHelper.logAllQuestionTypesofDB(database);
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Tabellen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * 
     * Besonderheit:
     * Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     */
    public void logAllTablesOfDB(){
    	dbHelper.logAllTablesofDB(database);
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Fragen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * 
     * Besonderheit:
     * Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     */
    public void logAllQuestionsOfDB() {
    	dbHelper.logAllQuestionsOfDB(database);
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle IDs der Fragen im LogCat aus, die Nutzern zugeordnet sind. Dies ermöglicht eine schnelle Fehlersuche.
     * 
     * Besonderheit:
     * Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     */
    public void logAllUserQuestionIDs() {
    	dbHelper.logAllUserQuestionIDs(database);
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Zuordnungen von Themen mit Fragen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * 
     * Besonderheit:
     * Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     */
    public void logAllQuestionsOfThemesofDB() {
    	dbHelper.logAllQuestionsOfThemesofDB(database);
    }
    
    /**
     * Methode zum Speichern von Fragen in der Datenbank inkl. Antworten
     *
     *  Besonderheit: Diese Methode hat keine eigene Implementierung. Sie nutzt die Methode der Klasse PeatDbHelper.
     * @param Question oQuestion Frageobjekt (inkl. Antworten)
     */
    public void putQuestionInDB(Question oQuestion) {
    	dbHelper.putQuestionInDB(oQuestion, database);
    }
    
    /**
     * Methode dient für ein alternativen Aufruf der Methode getNextQuestion(Boolean backButtonPush) ohne Übergabeparameter. Dafür wurde als Default eine globale Variable festgelegt.
     * @return Question Frageobjekt mit der Frage, die als nächstes in der GUI repräsentiert werden soll
     */
    public Question getNextQuestion(){
    	return getNextQuestion(defaultBackButtonPush);
    }
    
    /**
     * Methode ermittelt die Nächste Frage. Der Zustand bestimmt, welche Frage als nächstes geliefert werden soll. Es sind 3 verschiedene Zustände möglich.
     * Um zu navigieren wird in eine globale Variable die aktuell angezeigte Frage gespeichert.
     * 1) Button Repeat (auch Back Button) wurde betätigt. Diese Methode sucht aus der Tabelle PeatUser_has_Questions die Frage aus, die vom Zeitstempel direkt vor der aktuell angezeigten Frage erstmalig angezeigt wurde.
     * 2) Von einer bereits angezeigten Frage wird per Next Button die nächste Frage gewählt. Diese Methode sucht aus der Tabelle PeatUser_has_Questions die Frage aus, die vom Zeitstempel direkt nach der aktuell angezeigten Frage erstmalig angezeigt wurde.
     * 3) Per Next Button wird die nächste Frage gewählt und die aktuelle Frage ist das Maximum aller Zeitstempel aus der Tabelle PeatUser_has_Questions. Diese Methode ermittel die nächste noch nicht angefragte Frage und legt einen Eintrag in der Tabelle PeatUser_has_Questions für diese Frage an. Kann keine Frage mehr ermittel werden, weil alle Fragen bereits angezeigt wurden, so wird eine.
     * 
     * Fehlerzustände:
     * 1) Alle Fragen wurden bereits angezeigt und die Methode wird erneut aufgerufen. In diesem Fall wird eine IllegalStateException erzeugt.
     * 2) Die Frage mit dem minimalen Zeitstempel wird angezeigt und der Parameter backButtonPush ist true. In diesem Fall wird eine IllegalStateException erzeugt.
     * 3) Die Anwendung befindet sich am Start, es wurde noch keine Frage angezeigt und der Parameter backButtonPush ist true. In diesem Fall wird eine IllegalStateException erzeugt.
     * 
     *  @param Boolean backButtonPush gibt an, ob die vorherige oder die folgende Frage ausgegeben werden soll (backButtonPush=true heißt die vorherige wird ausgegeben)
     *  @return Question Frageobjekt mit der Frage, die als nächstes in der GUI repräsentiert werden soll (abhängig von der Aktion s. o.)
     */
    public Question getNextQuestion(Boolean backButtonPush){
	    	Question oQuestion;
	    	String[] answersArray;
	    	Boolean[] isCorrectArray;
	    	answersArray = new String[0];
	    	isCorrectArray = new Boolean[0];
	    	Integer iIsCorrect;
	    	Cursor mCursorQuestions;
	    	Boolean writeQuestionToTableUserHasQuestions = true;
	    	logAllUserQuestionIDs();
	    	if (currentQuestionID != "") {
	    		if (backButtonPush) {
	    			mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions WHERE uhq_lastShown IN (SELECT MAX(uhq_lastShown) FROM PeatUser_has_Questions WHERE uhq_lastShown < (SELECT uhq_lastShown FROM PeatUser_has_Questions WHERE uhq_idQuestions = " + currentQuestionID + ")))", null);
	    			if (mCursorQuestions.moveToFirst() == false) {
	    				throw new IllegalStateException("Back Button bei erster Frage nicht moeglich.");
	    			}
	    			writeQuestionToTableUserHasQuestions = false;
	    		}
	    		else {
	    			mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions WHERE uhq_lastShown IN (SELECT MIN(uhq_lastShown) FROM PeatUser_has_Questions WHERE uhq_lastShown > (SELECT uhq_lastShown FROM PeatUser_has_Questions WHERE uhq_idQuestions = " + currentQuestionID + ")))", null);
	    			if (mCursorQuestions.moveToFirst() == false) {
	    				mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions NOT IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions);", null);
	    			}
	    			else {
	    				writeQuestionToTableUserHasQuestions = false;
	    			}
	    		}
	    	}
	    	else {
	    		if (backButtonPush != true) {
	    			mCursorQuestions = database.rawQuery("SELECT * FROM Questions JOIN QuestionType ON idQuestionType = qst_idQuestionType WHERE idQuestions NOT IN (SELECT uhq_idQuestions FROM PeatUser_has_Questions);", null);
	    		}
	    		else throw new IllegalStateException("Back Button bei Start nicht moeglich.");
	    	}
	    	mCursorQuestions.moveToFirst();
	    	String QuestionText = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qst_text"));
	    	currentQuestionID = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("idQuestions"));
	    	String QuestionTypeTitle = mCursorQuestions.getString(mCursorQuestions.getColumnIndex("qt_title"));
	    	 
	    	if (writeQuestionToTableUserHasQuestions) {
	    		dbHelper.execSQL("INSERT INTO PeatUser_has_Questions (uhq_idQuestions, uhq_isIgnore, uhq_idPeatUser) VALUES(" + currentQuestionID + ", 0, (SELECT MAX(idPeatUser) FROM PeatUser WHERE us_name = 'Steven'))", database);
	    	}
	    	Cursor mCursorAnswers = database.rawQuery("SELECT * FROM Answers WHERE as_idQuestions = " + currentQuestionID, null);
	    	mCursorAnswers.moveToFirst();
	    	while(!mCursorAnswers.isAfterLast()) {
	    		String asText = mCursorAnswers.getString(mCursorAnswers.getColumnIndex("as_text"));
	    		answersArray = addStringToArray(answersArray, asText);
	    		iIsCorrect = mCursorAnswers.getInt(mCursorAnswers.getColumnIndex("as_isCorrect"));
	    		if (iIsCorrect == 1) {
					isCorrectArray = addBooleanToArray(isCorrectArray, true);
	    		}else {
	    			isCorrectArray = addBooleanToArray(isCorrectArray, false);
	    		}
	    		mCursorAnswers.moveToNext();
	    	}
	    	
	    	logAllQuestionsOfThemesofDB();
	    	Cursor mCursorThemes = database.rawQuery("SELECT * FROM " + dbHelper.TABLE_THEMES_HAS_QUESTIONS + " JOIN " + dbHelper.TABLE_THEMES + " ON idThemes = thq_idThemes WHERE thq_idQuestions = " + currentQuestionID, null);
	    	mCursorThemes.moveToFirst();
	    	String sTheme = mCursorThemes.getString(mCursorThemes.getColumnIndex("th_title"));
	    	oQuestion = new Question(sTheme, QuestionText, QuestionTypeTitle, answersArray, isCorrectArray);
	    	return oQuestion;
    }
    
    /**
     * Methode liefert eine Übersicht aller in der Datenbank gespeicherten Themen als Array zurück.
     * @return String[]  Array aller Themen als String
     */
    public String[] getAllThemes(){
    	String[] themeArray = new String[0];
    	String strThema;
       	Cursor mCursor = database.rawQuery("SELECT * FROM " + dbHelper.TABLE_THEMES + " ORDER BY th_title", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Themen:");
    	while(!mCursor.isAfterLast()) {
    		strThema = mCursor.getString(mCursor.getColumnIndex("th_title"));
    		Log.d(LOG_TAG, strThema);
    		themeArray = addStringToArray(themeArray, strThema);
    		mCursor.moveToNext();
    	}
    	return themeArray;
    }
    
    /**
     * Hilfsmethode
     * Methode dient zum Erweitern eines bestehenden Arrays. Das Array wird in der Größe um einen Eintrag erweitert und der übergebene String an diese Stelle geschrieben.
     * @param String[] array Array, das durch die Methode erweitert werden soll
     * @param String string Text, der an die neue Stelle im Array geschrieben werden soll
     * @return String[] erweitertes Array mit dem Text an der neuen Stelle
     */
    private String[] addStringToArray(String[] array, String string){
    	Integer length = array.length;
    	String[] bufferArray = new String[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = string;
    	return bufferArray;
    }
    
    /**
     * Hilfsmethode
     * Methode dient zum Erweitern eines bestehenden Arrays. Das Array wird in der Größe um einen Eintrag erweitert und der übergebene Boolean Wert an diese Stelle geschrieben.
     * @param Boolean[] array Array, das durch die Methode erweitert werden soll
     * @param Boolean bool Wert, der an die neue Stelle im Array geschrieben werden soll
     * @return Boolean[] erweitertes Array mit dem Wert an der neuen Stelle
     */
    private Boolean[] addBooleanToArray(Boolean[] array, Boolean bool){
    	Integer length = array.length;
    	Boolean[] bufferArray = new Boolean[length + 1];
    	Integer i = 0;
    	while (i < length) {
    		bufferArray[i] = array[i];
    		i++;
    	}
    	bufferArray[length] = bool;
    	return bufferArray;
    }
    
    /**
     * Methode zum Zurücksetzen der Tabelle PeatUser_has_Questions. Wenn bereits alle Fragen angezeigt wurden, so wird die Tabelle zurückgesetzt, um einen neuen Quizz-Lauf zu starten.
     */
    public void resetUserHasQuestions() {
    	dbHelper.execSQL("DELETE FROM " + dbHelper.TABLE_PEATUSER_HAS_QUESTIONS, database);
    }

    /**
     * Methode dient zum Schließen der Datenbank-Verbindung und erzeugt ein Log im LogCat.
     */
    public void close() {
    	dbHelper.close();
    	Log.d(LOG_TAG, "Datenbank mit Hilfe des DbHelpers geschlossen.");
    }
    

}