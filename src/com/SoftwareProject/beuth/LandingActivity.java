package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

/**
 * LandingActivity wird im Anschluss an die Splash-Activity aufgerufen.
 * Stellt das Menue der App dar (landing page).
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
@TargetApi(Build.VERSION_CODES.M)
public class LandingActivity extends AppCompatActivity {

	Button game; // Button game, ruft MainActivity auf
	Button question; // Button question, ruft Eingabe der Fragen auf
	Button theme; // Button theme, ruft user_themes auf
	Button setting; // Button setting, ruft Settings auf
	ImageView splash; // Bild splash.png aus res/drawable
	
	/**
	 * onCreate(Bundle savedInstanceState) ruft alle definierten
	 * Elemente der Klasse LandingActivity auf:
	 * - Buttons, Texte, Funktionen, Parameter
	 * @param savedInstanceState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landing);
		
		ImageView iv = (ImageView)findViewById(R.id.splash);
		iv.setImageResource(R.drawable.splash);
		
		game = (Button) findViewById(R.id.game);
		question = (Button) findViewById(R.id.question);
		theme = (Button) findViewById(R.id.theme);
		setting = (Button) findViewById(R.id.setting);
		
		/**
		 * game ruft das Quizz auf
		 * (MainActivity)
		 */
		game.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intentgame = new Intent(LandingActivity.this, MainActivity.class);
				LandingActivity.this.startActivity(intentgame);
			}
		});

		/**
		 * question ruft die Auswahl fuer Fragen auf
		 * (QuestionTypeActivity)
		 */
		question.setOnClickListener(new View.OnClickListener() {
			
		 	@Override
		 	public void onClick(View v) {
		 		Intent intentquest = new Intent(LandingActivity.this, QuestionTypeActivity.class);
		 		LandingActivity.this.startActivity(intentquest);
		 	}
		});
		
		/**
		 * theme ruft die Themenverwaltung auf
		 * (UserThemeActivity)
		 * ab Version v2.0.1
		 */
		theme.setOnClickListener(new View.OnClickListener() {
		 	
		 	@Override
		 	public void onClick(View v) {
		 		Intent intenttheme = new Intent(LandingActivity.this, UserThemeActivity.class);
		 		LandingActivity.this.startActivity(intenttheme);
		 	}
		});

		/**
		 * setting ruft die Einstellungen auf
		 * (EinstellungenActivity)
		 */
		setting.setOnClickListener(new View.OnClickListener() {
		 	
		    @Override
		 	public void onClick(View v) {
		 		Intent intentset = new Intent(LandingActivity.this, EinstellungenActivity.class);
				LandingActivity.this.startActivity(intentset);
			}
		});
	}
}