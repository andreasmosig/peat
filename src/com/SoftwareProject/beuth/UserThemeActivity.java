package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

/**
 * Die Klasse UserThemeActivity listet vorhandene Themengebiete auf und ermoeglicht das Hinzufuegen weiterer Themengebiete.
 * Weiterentwicklung geplant fuer v2.0.1.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
@TargetApi(Build.VERSION_CODES.M)
public class UserThemeActivity extends AppCompatActivity {
	
	/* Button addTheme, fuegt neues Thema hinzu, ab Version v2.0.1 */
	Button addTheme;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_themes);
		
		// Verknuepfung Button-Objekt mit dem Layout-Element
		addTheme = (Button) findViewById(R.id.addTheme);

		addTheme.setOnClickListener(new View.OnClickListener() {
					
			@Override
				public void onClick(View v) {
					
					// Hier erfolgt die Programmierung fuer die user_themes fuer die Version v2.0.1.
					
					Toast.makeText(UserThemeActivity.this, "Wende dich an den Support!", Toast.LENGTH_LONG).show();
		    	}
		});
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
}