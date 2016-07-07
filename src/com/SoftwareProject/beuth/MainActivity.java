package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Die MainActivity ist das Herz von #peat, das Quizz.
 * Hier werden die Daten aus der Datenbank geholt
 * und entsprechend uber die stage ausgegeben.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
@TargetApi(Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {
	// Definition aller notwendigen Variablen
	Button start; // Button Frage, leitet das Spiel ein
	Button buttonAnswer; // Button Antwort, ruft die Antwort zur aktuellen Frage auf
	Button back; // Button #Repeat, ruft die zurueckliegende Frage auf
	Button pause; // Button Pause, speichert/pausiert die aktuelle Frage
	Button next; // Button Weiter, fuft die naechste Frage auf
	Button wiki; // Button Wiki, ruft die URL https://www.wikipedia.de/ auf
	Button google; // Button Google, ruft die URL https://www.google.de/ auf
	Button returnlanding; // Button return, ruft LandingActivity auf
	Button saveComments; // Button save, speichert Kommentare
	private Question currentQuestion;
	
	TextView stage; // Ausgabe, Mensch-Computer-Kommunikation
	
	public static final String LOG_TAG = MainActivity.class.getSimpleName();
	private PeatDataSource dataSource;
	
	String questionTypeTitle;
	String questionText;
	String commentAnswers;
	String[] answers;
	Boolean[] isCorrect;

	// Antwort-Mockup, Radio-Buttons Ja Nein
    String answerCorrect = "Ja lautet die Antwort! Gut gemacht!";
	String answerNotCorrect = "Die Antwort ist leider falsch!";
		
	// Hinweis, wenn Button-Pause geklickt wird, ab Version v2.0.1
	String messagePause = "Frage wurde für später gespeichert!";
	
	// Definition einer Radio-Button-Gruppe für geschlossene Fragen (Ja-Nein-Fragen)
	private RadioGroup radioGroup;
	private RadioGroup radioGroupComment;
	private RadioButton radioAnswerButton;
	
	// Variable für Einstellungen der App
	private static final int RESULT_SETTINGS = 1;
		
	/**
	 * Methode onCreate (Bundle savedInstancesState)
	 * - holt sich die Werte der einzelnen Buttons aus strings.xml und activity_main.xml
	 * - baut eine Datenverbindung über die Klasse PeatDataSource auf
	 * - loggt wichtige Informationen im logCat
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this)); 
		setContentView(R.layout.activity_main);
	    dataSource = new PeatDataSource(this);
	    Log.d(LOG_TAG, "Die Datenquelle wird geöffnet.");
	    
	    dataSource.open();
		
		stage = (TextView) findViewById(R.id.stage);
		stage.setText("Welcome Back! Klicke auf Weiter!");
		
		buttonAnswer = (Button) findViewById(R.id.buttonAnswer);
		
		back = (Button) findViewById(R.id.back);
		pause = (Button) findViewById(R.id.pause);
		next = (Button) findViewById(R.id.next);

		wiki = (Button) findViewById(R.id.wiki);
		google = (Button) findViewById(R.id.google);
		returnlanding = (Button) findViewById(R.id.returnlanding);
		
		saveComments = (Button) findViewById(R.id.saveComment);
		
		radioGroupComment = (RadioGroup) findViewById(R.id.radioComment);
		
		/**
		 * back.setOnClickListener ruft mittels getNextQuestion aus der dataSource die vorherige Frage auf.
		 */
		back.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
				currentQuestion = dataSource.getNextQuestion(true);
				stage.setText(currentQuestion.getQuestionTheme() + ":" + System.getProperty("line.separator") + currentQuestion.getQuestionText());
				}
				catch (IllegalStateException e){
					Toast.makeText(MainActivity.this, "Weiter geht es nicht. Nächste Frage?!", Toast.LENGTH_LONG).show();
					Log.d(LOG_TAG, e.toString());
				}
			}
		});
		
		/**
		 * pause.setOnClickListener
		 * ab Version v2.0.1
		 */
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				stage.setText("Achtung: " + messagePause);
			}
		});
		
		/**
		 * next.setOnClickListener ruft mittels getNextQuestion aus der dataSource die naechste Frage auf.
		 */
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
				currentQuestion = dataSource.getNextQuestion();
				stage.setText(currentQuestion.getQuestionTheme() + ":" + System.getProperty("line.separator") + currentQuestion.getQuestionText());
				}
				catch (IndexOutOfBoundsException e){
					dataSource.resetUserHasQuestions();
					Toast.makeText(MainActivity.this, "Herzlichen Glückwunsch! Du hast alle Fragen der abonnierten Themen beantwortet."
							+ " Klicke auf Weiter und beginne von vorn!", Toast.LENGTH_LONG).show();
					Log.d(LOG_TAG, e.toString());
				}
			}
		});
		
		/**
		 * wiki.setOnClickListener ruft bei Button-Klick URL wikipedia.de auf.
		 */
		wiki.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.de/"));
				  startActivity(browserIntent);
			}
		});
		
		/**
		 * google.setOnClickListener ruft bei Button-Klick URL google.de auf.
		 */
		google.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.de/"));
				  startActivity(browserIntent);
			}
		});
		
		/**
		 * returnlanding.setOnClickListener ruft bei Button-Klick LandingActivity auf.
		 */
		returnlanding.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentreturn = new Intent(MainActivity.this, LandingActivity.class);
				MainActivity.this.startActivity(intentreturn);
			}
		});
		
		/**
		 * Bewertung der Frage
		 * ab Version v2.0.1
		 */
		EditText commentAnswer = (EditText) findViewById(R.id.commentAnswer);
		// Eingabe in einen String umwandeln
		commentAnswers = commentAnswer.getText().toString();
		// Textfeld leeren
		commentAnswer.setText("");
		
		saveComments.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
            		Toast.makeText(MainActivity.this, "Kommentar gespeichert.", Toast.LENGTH_LONG).show();
			}
		});
		
		addListenerOnButton();
	}

	/**
	 * onCreateOptionsMenu oeffnet das Menue in der Aktionsleiste, bzw. fuegt Menuepunkte hinzu, sofern diese existieren.
	 */	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * onOptionsItemSelected oeffnet bei Button-Klick in der Aktionsleiste die Activity.
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			startActivity(new Intent(this, EinstellungenActivity.class));
			return true;
		}
		
		switch (item.getItemId()) {
		
		case R.id.action_settings:
			Intent i = new Intent(this, EinstellungenActivity.class);
			startActivityForResult(i, RESULT_SETTINGS);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
		
	/**
	 * onActivityResult ruft showUserSettings auf, wenn RESULT_SETTINGS instanziiert wurde.
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		
		switch (requestCode) {
		case RESULT_SETTINGS:
			showUserSettings();
			break;
		}
 	}
		
	/**
	 * showUserSettings baut via preferences, arras sowie strings die EinstellungenActivity auf.
	 */
	private void showUserSettings() {
		SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
		StringBuilder builder = new StringBuilder();
 			builder.append("\n Benutzername: "
               + sharedPrefs.getString("prefUsername", "NULL"));
 			builder.append("\n Bericht senden:"
               + sharedPrefs.getBoolean("prefSendReport", false));
 			builder.append("\n Wiederholung: "
               + sharedPrefs.getString("prefSyncFrequency", "NULL"));
 			TextView settingsTextView = (TextView) findViewById(R.id.textUserSettings);
 			settingsTextView.setText(builder.toString());
	}
    
	/**
	 * addListenerOnButton prueft, welcher Radio-Button ausgewaehlt wurde,
	 * kommuniziert mit der dataSource via currentQuestion und getIsCorrectAnswers
	 * und erzeugt je nach Wahl bei Klick auf Button Antwort (answerCorrect, answerNotCorrect)
	 * einen Sound und einen Toast (Ja/Nein).
	 */
    public void addListenerOnButton() {

    	radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
    	buttonAnswer = (Button) findViewById(R.id.buttonAnswer);

    	final MediaPlayer mpButtonClickCorrect = MediaPlayer.create(this, R.raw.onclickyes);
    	final MediaPlayer mpButtonClickNotCorrect = MediaPlayer.create(this, R.raw.onclickno);
    	
    	buttonAnswer.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {
    		Boolean[] isCorrectArray;
    		Boolean correctAnswer = false;
    		// Holt ausgewaehlten Radio-Button von der RadioGroup
    		int selectedId = radioGroup.getCheckedRadioButtonId();

    		// Findet den Radio-Button anhand der zurueckgegebenen ID
    		radioAnswerButton = (RadioButton) findViewById(selectedId);

    		isCorrectArray = currentQuestion.getIsCorrectAnswers();
    		if (isCorrectArray[0] == true & selectedId == R.id.radioYes) {
    			correctAnswer = true;
    		}
    		else if (isCorrectArray[1] == true & selectedId == R.id.radioNo) {
    			correctAnswer = true;
    		}
            	if(correctAnswer == true){
            		stage.setText("Antwort: " + answerCorrect);
            		mpButtonClickCorrect.start();
            		Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();	
            	}
            	else {
            		stage.setText("Antwort: " + answerNotCorrect);
            		mpButtonClickNotCorrect.start();
                   	Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
            	}
           }
    	});
      }
}