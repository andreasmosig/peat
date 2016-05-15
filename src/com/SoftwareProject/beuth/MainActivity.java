package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.TextView;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class MainActivity extends AppCompatActivity {
	
	/**
	 * Definition aller notwendigen Variablen: Buttons, etc.
	 */
	Button quiz;			// Ist das der Button "Frage"? Ich kann keinen Button sehen der "Quiz" heißt...
	Button buttonAnswer;	// ruft die Antwort zu aktuellen Frage auf
	Button back;			// ruft die zurueckliegende Frage wieder auf
	Button pause;			// pausiert die aktuelle Frage
	Button next;			// ruft die naechste Frage auf
	Button wiki;			// ruft die URL https://www.wikipedia.de/ auf
	Button google;			// ruft die URL https://www.google.de/ auf
	Button close;			// schließt die Anwendung bzw. App
	
	// Ist das unsere "Kommunikationsbühne"? Also der Ort, an dem wir mit dem User kommunizieren?
	TextView anzeige;
	
	// Zähler-Mockup: setzt den Array-Index des Fragearrays auf Null 
	int setNextQuestion=0;
    
	// Fragen-Mockup als Array
	String[] question={
    		" ",
    		"Dient Git der Versionsverwaltung für Software?",
    		"Ist Slack ein webbasierter Instant-Messanger?",
    		"Ist Trello eine Projektmanagementsoftware?",
    		"Ist Android u.a. auch ein Betriebssystem?",
    		"Bedeutet APK Android Package File?"};
    // String frageA;
	// String frageB;
	// String frageC;	
	
	// Antwort-Mockup für Radio Button Gruppe? Richtig?
	String antwortA;	// Könnte man nicht schon an dieser Stelle initialisieren mit "Ja lautet die Antwort! Gut gemacht!"
	String antwortB;	// Könnte man nicht schon an dieser Stelle initialisieren mit "Die Antwort ist leider falsch!"
	
	// Dieser Hinweis wird angezeigt, wenn eine Frage pausiert wird.
	String hinweisPause;		// Könnte man nicht schon an dieser Stelle initialisieren mit "Frage wurde für später gespeichert!"
	
	// Definition einer Radio Button Gruppe für geschlossene Fragen (Ja-Nein-Fragen)
	private RadioGroup radioGroup;
	private RadioButton radioAnswerButton;
	
	// Wozu dient diese Variable?
	private static final int RESULT_SETTINGS = 1;
	
	/**
	 * Was macht diese Klasse?
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// frageA = "Dient Git der Versionsverwaltung für Software?";
		// frageB = "Ist Slack ein webbasierter Instant-Messanger?";
		// frageC = "Ist Trello eine Projektmanagementsoftware?";		
		antwortA = "Ja lautet die Antwort! Gut gemacht!";	// siehe Kommentar oben bei Variablendeklaration
		antwortB = "Die Antwort ist leider falsch!";		// siehe Kommentar oben bei Variablendeklaration
		hinweisPause = "Frage wurde für später gespeichert!";	// siehe Kommentar oben bei Variablendeklaration
		
		quiz = (Button) findViewById(R.id.quiz);
		
		anzeige = (TextView) findViewById(R.id.totaloutput);
		anzeige.setText(question[setNextQuestion]);
		
		buttonAnswer = (Button) findViewById(R.id.buttonAnswer);

		back = (Button) findViewById(R.id.back);
		pause = (Button) findViewById(R.id.pause);
		next = (Button) findViewById(R.id.weiter);
		
		wiki = (Button) findViewById(R.id.wiki);
		google = (Button) findViewById(R.id.google);
		close = (Button) findViewById(R.id.close);
		
		quiz.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageA);
				anzeige.setText("Möchtest du beginnen? Klicke anschließend auf Weiter.");
			}
		});
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageA);
				if(setNextQuestion==1){
					setNextQuestion=5;
				} else {
					setNextQuestion--;
				}
				anzeige.setText(question[setNextQuestion]);
			}
		});
		
		pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				anzeige.setText("Achtung: " + hinweisPause);
			}
		});
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// anzeige.setText("Frage: " + frageB);
				setNextQuestion++;
				if(setNextQuestion == 6){
					setNextQuestion=1;
				}
				anzeige.setText(question[setNextQuestion]);
			}
		});
		
		wiki.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wikipedia.de/"));
				  startActivity(browserIntent);
			}
		});
		
		google.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.de/"));
				  startActivity(browserIntent);
			}
		});
		
		close.setOnClickListener(new View.OnClickListener() {
		     
			@Override
		    public void onClick(View v) {
				finish();
		    }
		});
		
		addListenerOnButton();
	}

	/**
	 * Was macht diese Klasse?
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/**
	 * Was macht diese Klasse?
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
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
	 * Was macht diese Klasse?
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
	 * Was macht diese Klasse?
	 */
    private void showUserSettings() {
        SharedPreferences sharedPrefs = PreferenceManager
                .getDefaultSharedPreferences(this);
 
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
	 * Was macht diese Klasse?
	 */
    public void addListenerOnButton() {

    	radioGroup = (RadioGroup) findViewById(R.id.radioQuestion);
    	buttonAnswer = (Button) findViewById(R.id.buttonAnswer);

    	final MediaPlayer mpButtonClick = MediaPlayer.create(this, R.raw.onclickyes);
    	
    	buttonAnswer.setOnClickListener(new OnClickListener() {

    		@Override
    		public void onClick(View v) {

	    		// get selected radio button from radioGroup
	    		int selectedId = radioGroup.getCheckedRadioButtonId();

	    		// find the radiobutton by returned id
	    		radioAnswerButton = (RadioButton) findViewById(selectedId);

	            if(selectedId == R.id.radioYes){
	            	anzeige.setText("Antwort: " + antwortA);
	            	mpButtonClick.start();
	            	Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
	            }
	            else if(selectedId == R.id.radioNo){
	            	anzeige.setText("Antwort: " + antwortB);
	            	Toast.makeText(MainActivity.this, radioAnswerButton.getText(), Toast.LENGTH_SHORT).show();
	            }
	        
    		}
    		
    	});
    	
      }
    
}