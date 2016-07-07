package com.SoftwareProject.beuth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * CrashActivity liefert mittels Aufruf des ExceptionHandler
 * den relevanten Auszug aus dem Log der Android-Entwicklungsumgebung
 * sowie Informationen zum verwendeten Endgeraet.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
public class CrashActivity extends AppCompatActivity {

	TextView error;

	/**
	 * Ausgabe der Fehlermeldung per TextView error, activity_main-Layout.
	 * @param savedInstancState
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
		setContentView(R.layout.activity_main);
		
		error = (TextView) findViewById(R.id.error);
		error.setText(getIntent().getStringExtra("error"));
	}
}