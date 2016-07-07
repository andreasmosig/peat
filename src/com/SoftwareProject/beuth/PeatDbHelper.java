package com.SoftwareProject.beuth;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/** 
 * Klasse mit deren Hilfe die SQLite-Datenbank erstellt wird und alle Methoden zum Loggen und Schreiben von Daten in die DB bereitgestellt wird
 * enthält weiterhin wichtige Konstanten
 * 		wie Tabellennamen,
 * 		Datenbankversion, 
 * 		oder Namen der Spalten
 * @author #peatTeam
 * @version v1.0.1
 */
public class PeatDbHelper extends SQLiteOpenHelper{

    private static final String LOG_TAG = PeatDbHelper.class.getSimpleName();

    public static final String DB_NAME = "peat.db";
    public static final int DB_VERSION = 1;
    public static final Boolean isDebugVersion = true;

    public static final String TABLE_QUESTIONTYPE = "QuestionType";
    public static final String TABLE_THEMES = "Themes";
    public static final String TABLE_PEATUSER = "PeatUser";
    public static final String TABLE_QUESTIONS = "Questions";
    public static final String TABLE_ANSWERS = "Answers";    
    public static final String TABLE_THEMES_HAS_QUESTIONS = "Themes_has_Questions";
    public static final String TABLE_PEATUSER_HAS_QUESTIONS = "PeatUser_has_Questions";
    public static final String TABLE_PEATUSER_HAS_THEMES = "PeatUser_has_Themes";
    public static final String TABLE_HISTORIEREPLIES = "HistorieReplies";

    public static final String SQL_CREATE_QUESTIONTYPE =
    	"CREATE TABLE " + TABLE_QUESTIONTYPE +
    	"(idQuestionType INTEGER   NOT NULL , qt_title VARCHAR(255)   NOT NULL UNIQUE, qt_explanation VARCHAR(255), PRIMARY KEY(idQuestionType));";

	public static final String SQL_CREATE_THEMES =
		"CREATE TABLE " + TABLE_THEMES +
		"(idThemes INTEGER NOT NULL , th_title VARCHAR(255) NOT NULL UNIQUE, th_explanation VARCHAR(255), PRIMARY KEY(idThemes));";

	public static final String SQL_CREATE_PEATUSER =
		"CREATE TABLE " + TABLE_PEATUSER + 
		"(idPeatUser INTEGER NOT NULL, us_name VARCHAR(255), PRIMARY KEY(idPeatUser));";

	public static final String SQL_CREATE_QUESTIONS =
		"CREATE TABLE " + TABLE_QUESTIONS +
		"(idQuestions INTEGER NOT NULL, qst_idQuestionType INTEGER NOT NULL, qst_text VARCHAR(255) NOT NULL, PRIMARY KEY(idQuestions), " +
		"FOREIGN KEY(qst_idQuestionType) REFERENCES QuestionType(idQuestionType));";

	public static final String SQL_CREATE_INDEX1 =
		"CREATE INDEX Questions_FKIndex1 ON Questions (qst_idQuestionType);" +
		"CREATE INDEX IFK_Rel_01 ON Questions (qst_idQuestionType);";

	public static final String SQL_CREATE_ANSWERS =
		"CREATE TABLE " + TABLE_ANSWERS + 
		"(idAnswers INTEGER NOT NULL, as_idQuestions INTEGER NOT NULL, as_text VARCHAR(255) NOT NULL, as_isCorrect BOOL NOT NULL," +
		"PRIMARY KEY(idAnswers), FOREIGN KEY(as_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX2 =
		"CREATE INDEX Answers_FKIndex1 ON Answers (as_idQuestions);" +
		"CREATE INDEX IFK_Rel_04 ON Answers (as_idQuestions);";

	public static final String SQL_CREATE_THEMES_HAS_QUESTIONS =
		"CREATE TABLE " + TABLE_THEMES_HAS_QUESTIONS +
		"(thq_idThemes INTEGER NOT NULL, thq_idQuestions INTEGER NOT NULL, PRIMARY KEY(thq_idThemes, thq_idQuestions)," +
		"FOREIGN KEY(thq_idThemes) REFERENCES Themes(idThemes), FOREIGN KEY(thq_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX3 =
		"CREATE INDEX Themes_has_Questions_FKIndex1 ON Themes_has_Questions (thq_idThemes);" +
		"CREATE INDEX Themes_has_Questions_FKIndex2 ON Themes_has_Questions (thq_idQuestions);" +
		"CREATE INDEX IFK_Rel_02 ON Themes_has_Questions (thq_idThemes);" +
		"CREATE INDEX IFK_Rel_03 ON Themes_has_Questions (thq_idQuestions);";

	public static final String SQL_CREATE_PEATUSER_HAS_QUESTIONS =
		"CREATE TABLE " + TABLE_PEATUSER_HAS_QUESTIONS + 
		//"(PeatUser_idPeatUser INTEGER NOT NULL, Questions_idQuestions INTEGER NOT NULL , isIgnore BOOL NOT NULL, lastShown DATETIME, " +
		"(uhq_idPeatUser INTEGER, uhq_idQuestions INTEGER NOT NULL , uhq_isIgnore BOOL NOT NULL, uhq_lastShown TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL, " +
		"uhq_isLastAnswerCorrect BOOL, " +
		"PRIMARY KEY(uhq_idPeatUser, uhq_idQuestions), FOREIGN KEY(uhq_idPeatUser)  REFERENCES PeatUser(idPeatUser), " +
		"FOREIGN KEY(uhq_idQuestions) REFERENCES Questions(idQuestions));";

	public static final String SQL_CREATE_INDEX4 =
		"CREATE INDEX PeatUser_has_Questions_FKIndex1 ON PeatUser_has_Questions (uhq_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Questions_FKIndex2 ON PeatUser_has_Questions (uhq_idQuestions);" +
		"CREATE INDEX IFK_Rel_07 ON PeatUser_has_Questions (uhq_idPeatUser);" +
		"CREATE INDEX IFK_Rel_08 ON PeatUser_has_Questions (uhq_idQuestions);";

	public static final String SQL_CREATE_PEATUSER_HAS_THEMES =
		"CREATE TABLE " + TABLE_PEATUSER_HAS_THEMES + 
		"(uht_idPeatUser INTEGER NOT NULL, uht_idThemes INTEGER NOT NULL, uht_questionEveryMinutes INTEGER NOT NULL, " +
		"PRIMARY KEY(uht_idPeatUser, uht_idThemes), " +
		"FOREIGN KEY(uht_idPeatUser) REFERENCES PeatUser(idPeatUser), FOREIGN KEY(uht_idThemes) REFERENCES Themes(idThemes));";

	public static final String SQL_CREATE_INDEX5 =
		"CREATE INDEX PeatUser_has_Themes_FKIndex1 ON PeatUser_has_Themes (uht_idPeatUser);" +
		"CREATE INDEX PeatUser_has_Themes_FKIndex2 ON PeatUser_has_Themes (uht_idThemes);" +
		"CREATE INDEX IFK_Rel_05 ON PeatUser_has_Themes (uht_idPeatUser);" +
		"CREATE INDEX IFK_Rel_06 ON PeatUser_has_Themes (uht_idThemes);";

	public static final String SQL_CREATE_HISTORIEREPLIES =
		"CREATE TABLE " + TABLE_HISTORIEREPLIES + 
		"(idHistorieReplies INTEGER NOT NULL, his_uhq_idQuestions INTEGER NOT NULL, " +
		"his_uhq_idPeatUser INTEGER NOT NULL, his_dateOfReply DATETIME NOT NULL," +
		"his_wasCorrectReply BOOL NOT NULL, "+
		"PRIMARY KEY(idHistorieReplies), FOREIGN KEY(his_uhq_idPeatUser, his_uhq_idQuestions) " +
		"REFERENCES PeatUser_has_Questions(uhq_idPeatUser, uhq_idQuestions));";

	public static final String SQL_CREATE_INDEX6 =
    	"CREATE INDEX HistorieReplies_FKIndex1 ON HistorieReplies (his_uhq_idPeatUser, his_uhq_idQuestions);" +
    	"CREATE INDEX IFK_Rel_09 ON HistorieReplies (his_uhq_idPeatUser, his_uhq_idQuestions);";

	/**
	 * Konstruktor der Klasse
	 * - erzeugt die Datenbank
	 * 
	 * @param Context context
	 */
    public PeatDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(LOG_TAG, "DbHelper hat die Datenbank: " + getDatabaseName() + " erzeugt.");
    }
    
    /**
     * Die onCreate-Methode wird nur aufgerufen, falls die Datenbank noch nicht existiert.
     * Alle Tabellen werden inkl. Verknüpfungen angelegt. Darüber hinaus werden initial die wichtigsten Daten eingefügt.
     * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
     * 
     * @param SQLiteDatabase db Referenz zur Datenbank
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            CreateSQL(db, TABLE_QUESTIONTYPE, SQL_CREATE_QUESTIONTYPE);
            CreateSQL(db, TABLE_THEMES, SQL_CREATE_THEMES);
            CreateSQL(db, TABLE_PEATUSER, SQL_CREATE_PEATUSER);
            CreateSQL(db, TABLE_QUESTIONS, SQL_CREATE_QUESTIONS);
            CreateSQL(db, TABLE_ANSWERS, SQL_CREATE_ANSWERS);
            CreateSQL(db, TABLE_THEMES_HAS_QUESTIONS, SQL_CREATE_THEMES_HAS_QUESTIONS);
            CreateSQL(db, TABLE_PEATUSER_HAS_QUESTIONS, SQL_CREATE_PEATUSER_HAS_QUESTIONS);
            CreateSQL(db, TABLE_PEATUSER_HAS_THEMES, SQL_CREATE_PEATUSER_HAS_THEMES);
            CreateSQL(db, TABLE_HISTORIEREPLIES, SQL_CREATE_HISTORIEREPLIES);
            CreateSQL(db, "Index 1", SQL_CREATE_INDEX1);
            CreateSQL(db, "Index 2", SQL_CREATE_INDEX2);
            CreateSQL(db, "Index 3", SQL_CREATE_INDEX3);
            CreateSQL(db, "Index 4", SQL_CREATE_INDEX4);
            CreateSQL(db, "Index 5", SQL_CREATE_INDEX5);
            CreateSQL(db, "Index 6", SQL_CREATE_INDEX6);
            execSQL("INSERT INTO Peatuser (us_name) VALUES('Steven')", db);
            putNewThemeInDB("Mathematik", "Allgemeine Fragen zu mathematischen Problemen", db);
            putNewThemeInDB("Physik", "Allgemeine Fragen zur Physik", db);
            putNewThemeInDB("Informatik", "Allgemeine Fragen zur Informatik und Computern", db);
            putNewThemeInDB("Wirtschaft", "Allgemeine Fragen zur Wirtschaft", db);
            putNewThemeInDB("Politik", "Allgemeine Fragen zur Politik", db);
            putNewThemeInDB("Religion", "Allgemeine Fragen zur Religion", db);
            putNewThemeInDB("Biologie", "Allgemeine Fragen zur Biologie", db);
            putNewThemeInDB("Geschichte", "Allgemeine Fragen zur Geschichte", db);
            putNewThemeInDB("Geografie", "Allgemeine Fragen zur Geografie", db);
            putNewQuestionTypeInDB("SimpleText", "Bitte geben Sie Ihre Antwort als Text ein. Achten Sie auf die Rechtschreibung.", db);
            putNewQuestionTypeInDB("MultipleChoice", "Bitte wählen Sie eine oder mehrere Antworten.", db);
            putNewQuestionTypeInDB("Choice", "Bitte wählen Sie die richtige Antwort.", db);
            String[] antwortFrageA = {"Ja", "Nein"};
    	    Boolean[] isCorrectFrageA = {true, false};
    	    Question frageA = new Question("Informatik", "Dient Git der Versionsverwaltung für Software?", "Choice", antwortFrageA, isCorrectFrageA);
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Slack ein webbasierter Instant-Messanger?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Trello eine Projektmanagementsoftware?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Ist Android u.a. auch ein Betriebssystem?");
    	    putQuestionInDB(frageA, db);
    	    frageA.putQuestionText("Bedeutet APK Android Package File?");
    	    putQuestionInDB(frageA, db);
    	    String[] antwortFrageB = {"Ja", "Nein"};
    	    Boolean[] isCorrectFrageB = {false, true};
    	    Question frageB = new Question("Geografie", "Ist das Wetter immer sonnig?", "Choice", antwortFrageB, isCorrectFrageB);
    	    putQuestionInDB(frageB, db);
    	    logAllTablesofDB(db);
    	    logAllQuestionsOfDB(db);
    	    logAllAnswersOfDB(db);
        }
        catch (Exception ex) {
            Log.e(LOG_TAG, "Fehler beim Anlegen der Tabelle: " + ex.getMessage());
        }
    }
    
    /**
     * Hilfsmethode zum Anlegen von Tabellen inkl. Logging
     * 
     * @param SQLiteDatabase db Referenz zur Datenbank
     * @param String tablename Name der neu anzulegenden Tabelle
     * @param String SQL_CREATE SQL Befehl zum anlegen der Tabelle
     */
    private void CreateSQL(SQLiteDatabase db, String tablename, String SQL_CREATE){
        execSQL(SQL_CREATE, db);
    }
    
    /**
     * Methode zum Einfügen von Daten in die Tabelle QuestionType per SQL-Befehl INSERT
     * Diese Tabelle verwaltet die Fragetypen.
     * 
     * @param SQLiteDatabase db Referenz zur Datenbank
     * @param String title Name des neu anzulegenden Fragetyps
     * @param String explanation Erklärung des Fragetyps
     */
    private void putNewQuestionTypeInDB(String title, String explanation, SQLiteDatabase db){
    	execSQL("INSERT INTO QuestionType (qt_title, qt_explanation) VALUES('" + title + "', '" + explanation +"')", db);
    }

    /**
     * Methode zum Einfügen von Daten in die Tabelle Themes per SQL-Befehl INSERT
     * Diese Tabelle verwaltet die Themen.
     * 
     * @param SQLiteDatabase db Referenz zur Datenbank
     * @param String title Name des neu anzulegenden Themas
     * @param String explanation Erklärung des Themas
     */    
    private void putNewThemeInDB (String title, String explanation, SQLiteDatabase db) {
    	execSQL("INSERT INTO Themes (th_title, th_explanation) VALUES ('"+ title +"', '" + explanation + "')", db);
    }
    
    /**
     * Methode zum Einfügen von Daten in die Tabelle Questions und Answers per SQL-Befehl INSERT
     * Diese Tabelle verwalten die Fragen und Antworten. 
     * 
     * Besonderheiten: In der SQLite Datenbank werden Booleanwerte nicht als true und false gespeichert, sondern als 0 und 1.
     * Daher müssen die Werte für die Datenbank "übersetzt" werden.
     * 
     * @param Question oQuestion Frageobjekt inkl. Antworten
     * @param SQLiteDatabase db Referenz zur Datenbank
     */    
    public void putQuestionInDB(Question oQuestion, SQLiteDatabase db) {
    	String[] answers;
    	String theme;
    	Boolean[] bool_isCorrect;
    	Integer boolSqlite =0;
    	Integer i;
    	String sSql;
    	sSql = "INSERT INTO " + TABLE_QUESTIONS + " (qst_idQuestionType,qst_text) VALUES(" + getIdFromQuestionTypeTitle(oQuestion.getQuestionTypeTitle(), db) + 
    			", '" + oQuestion.getQuestionText() +"')";
    	Log.d(LOG_TAG, sSql);
    	execSQL(sSql, db);
    	theme = oQuestion.getQuestionTheme();
    	answers = oQuestion.getAnswers();
    	bool_isCorrect = oQuestion.getIsCorrectAnswers();

        for (i=0; i<answers.length; i++) {
        	if (bool_isCorrect [i] == true) {
        		boolSqlite = 1;
        	}
        	else {
        		boolSqlite = 0;
        	}
        	execSQL("INSERT INTO Answers (as_idQuestions, as_text, as_isCorrect) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), '" + answers[i] + "', " + boolSqlite +")", db);
        }
        try {
        	execSQL("INSERT INTO " + TABLE_THEMES_HAS_QUESTIONS + " (thq_idQuestions, thq_idThemes) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), (SELECT MAX(idThemes) FROM Themes WHERE th_title='" + theme + "'))", db); 
        }
        catch (Exception e) {
        	execSQL("INSERT INTO " + TABLE_THEMES + "(th_title) VALUES ('" + oQuestion.getQuestionTheme() + "')", db);
        	execSQL("INSERT INTO " + TABLE_THEMES_HAS_QUESTIONS + " (thq_idQuestions, thq_idThemes) VALUES ((SELECT MAX(idQuestions) FROM Questions WHERE qst_text='" + oQuestion.getQuestionText() + "'), (SELECT MAX(idThemes) FROM Themes WHERE th_title='" + theme + "'))", db);
        }
    }
    
    /**
     * Methode führt SQL-Kommandos aus. Über eine globale Variable isDebugVersion wird gesteuert, ob das SQL-Kommando zusätzlich ins LogCat geschrieben wird.
     * 
     * @param String sSQL auszuführendes SQL Kommando
     * @param SQLiteDatabase db Referenz zur Datenbank
     */
    public void execSQL(String sSQL, SQLiteDatabase db) {
    	if (isDebugVersion) {
    		Log.d(LOG_TAG, sSQL);
    	}
    	db.execSQL(sSQL);
    }
    
    /**
     * Methode ermittelt die ID eines Fragetyps.
     * 
     * @param String title Title des Fragetyps
     * @param SQLiteDatabase db Referenz zur Datenbank
     * @return Integer gibt die ID des angefragten Fragetyps als Integer zurück
     */
    public Integer getIdFromQuestionTypeTitle(String title, SQLiteDatabase db){
    	Cursor mCursor = db.rawQuery("SELECT * FROM QuestionType WHERE qt_title = '" + title +"'", null);
    	mCursor.moveToFirst();
    	return mCursor.getInt(mCursor.getColumnIndex("idQuestionType"));
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Tabellen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */
    public void logAllTablesofDB(SQLiteDatabase db){
    	Cursor mCursor = db.rawQuery("SELECT tbl_name FROM sqlite_master WHERE type='table';", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Tabellen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("tbl_name")));
    		mCursor.moveToNext();
    	}
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Fragetypen im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */
    public void logAllQuestionTypesofDB(SQLiteDatabase db){
    	Cursor mCursor = db.rawQuery("SELECT * FROM QuestionType", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Fragetypen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qt_title")));
    		mCursor.moveToNext();
    	}
    }

    /**
     * Hilfsmethode
     * Diese Methode gibt alle Fragen mit der dazugehörigen ID im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */    
    public void logAllQuestionsOfDB(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT * FROM Questions;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("qst_text")) + "   " + mCursor.getString(mCursor.getColumnIndex("idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Antworten mit dem Flag, ob es sich um eine korrekte oder falsche Antwort handelt, und mit der dazugehörigen ID im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */  
    public void logAllAnswersOfDB(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT * FROM Answers;", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Antworten:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("as_text")) + "     " + mCursor.getString(mCursor.getColumnIndex("as_isCorrect"))+ "     " + mCursor.getString(mCursor.getColumnIndex("idAnswers")));
    		mCursor.moveToNext();
    	}
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt die IDs der Fragen im LogCat aus, die Usern zugeordnet sind. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */  
    public void logAllUserQuestionIDs(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT uhq_idQuestions FROM PeatUser_has_Questions", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle IDs von User_Fragen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("uhq_idQuestions")));
    		mCursor.moveToNext();
    	}
    }
    
    /**
     * Hilfsmethode
     * Diese Methode gibt alle Zuordnungen von Fragen zu Themen anhand der IDs im LogCat aus. Dies ermöglicht eine schnelle Fehlersuche.
     * @param SQLiteDatabase db Referenz zur Datenbank
     */  
    public void logAllQuestionsOfThemesofDB(SQLiteDatabase db) {
    	Cursor mCursor = db.rawQuery("SELECT * FROM Themes_has_Questions", null);
    	mCursor.moveToFirst();
    	Log.d(LOG_TAG, "Alle Themenzuordnungen:");
    	while(!mCursor.isAfterLast()) {
    		Log.d(LOG_TAG, mCursor.getString(mCursor.getColumnIndex("thq_idQuestions")) + "   " + mCursor.getString(mCursor.getColumnIndex("thq_idThemes")));
    		mCursor.moveToNext();
    	}
    }
    
    /**
     * Methode zum Durchführen von Datenbank Updates
     * Im Prototyp werden Änderungen noch direkt auf der Datenbank durchgeführt. Dafür wird die ganze DB neu initialisiert.
     * Für zukünftige Versionen ist ein Datenbank Update geplant.
     * 
     * @param SQLiteDatabase db Referenz zur Datenbank
     * @param int oldVersion alte Version der Datenbank (vor Update)
     * @param int newVersion neue Version der Datenbank (nach Update)
     */  
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
