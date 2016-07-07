package com.SoftwareProject.beuth;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

/**
 * UnderConstructionActivity wird aufgerufen, sofern es eine bestimtmte Activity
 * noch nicht gibt bzw. in Arbeit ist, d.h. geplant fuer v2.0.1.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
@TargetApi(Build.VERSION_CODES.M)
public class UnderConstructionActivity extends AppCompatActivity {
	
	/**
	 * onCreat holt das Layout und fuegt ein Bild ein, aus res/drawable.
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_under_construction);
		
		ImageView iv = (ImageView)findViewById(R.id.underconstruction);
		iv.setImageResource(R.drawable.underconstruction);
		
		Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();
	}
	// Hier muss dann z.B. der Code fuer einen anderen Fragetyp hin.
}