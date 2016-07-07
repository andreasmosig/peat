package com.SoftwareProject.beuth;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * EinstellungenActivity verwaltet die Einstellungen der App.
 * 
 * @author #peatTeam
 * @version v1.0.1
 */
@TargetApi(Build.VERSION_CODES.M)
public class EinstellungenActivity extends PreferenceActivity
	implements Preference.OnPreferenceChangeListener {
    
	/**
	 * Handling der Themenliste (Preferences) in den Einstellungen.
	 * @param savedInstanceState
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences);

    Toast.makeText(this, "Zurück mit Back-Button.", Toast.LENGTH_SHORT).show();

    Preference themenlistePref = findPreference(getString(R.string.themes_title));
	themenlistePref.setOnPreferenceChangeListener(this);

	// onPreferenceChange sofort aufrufen mit der in SharedPreferences gespeicherten Themenliste
	SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
	String gespeicherteThemenliste = sharedPrefs.getString(themenlistePref.getKey(), "");
	onPreferenceChange(themenlistePref, gespeicherteThemenliste);
	}

	/**
	 * Bei Aenderung der Preferences durch den Benutzer.
	 * @param preference (die geaenderten Preferences)
	 * @param value (der neue Wert der Preferences)
	 * @return boolean (true, update Preferences)
	 */
	@Override
	public boolean onPreferenceChange(Preference preference, Object value) {
    preference.setSummary(value.toString());
    return true;
	}
}