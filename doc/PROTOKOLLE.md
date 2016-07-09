#Protokolle

#16.04.2016

- Expose (Andreas, Thomas)
- Fragenkatalog (Thomas)
- Use Cases Beispiele (Thomas)
- Deployment (Thomas)
- Architekturbild (Komponenten- und Paketdiagramm, welche Komponenten sollen die GUIs haben?) (Thomas)
- Explorative GUI (Bsp. Push Notification, App (Landing, Settings), Web => Lumzi) (Andreas)

Thomas Ricklinkat:
- UML-Diagramme modellieren (Use Cases, Paket-, Klassen-, Deployment- und Komponentendiagramm)

Andreas Mosig:
- GUIs entwerfen

------------------------------------------------------------------------------------------

#23.04.2016 (Präsenz)

Entwicklung
QM
Wartung Pflege
?

Nicht zu viel Frameworks/Tools
Nicht zu viel GUI

Ruby on Rails (Sinatra)

MET Metriken, 
CCD Clean Code Developement/Developer (Grade)
BUI Buildmanagement
CID Continious Integration/Delivery

Fragen:
1) Web und App, oder entweder oder? - App, lokale DB, 
2) Empfehlung für App-Frameworks/Entwicklung? - Eclipse, Plugins, SQLlite
3) Versionierung, wie? - releases (git)
4) Webserver / Webservice? - nein

Ideen:
1) lokale Datenbank (Abo)
2) Synchronisation mit Web-DB (User kann neues Thema zum Abo hinzufügen)
3) Statusbericht in asana als Terminserie mit Links zu easyBacklog
4) In easyBacklog:
4.1) Thema (z.B. App, Weboberfläche, DB)
4.2) Story (z.B. UI, Funktion A/B, Farbe, ..)
4.3) Sprint (z.B. Version 1, Verions 2, ..)
5) In asana dann die Sprints grob anlegen und managen
6) Ausblick auf Webserver/-service, Abos, Jeder
7) Lernintervalle in DB hinterlegen (Wiederholung)

Tasks (bis 01.05.2016)
- Fachwissen aneignen und in Doku notieren (alle)
- Use Cases (Expose) prüfen (alle)
- und diese als Stories in easyBacklog eingeben (Thomas)
- Sprints planen (alle)
- DB-Schema (ER)(Steven)
- Doku parallel pflegen (Andreas)
- Prototyp weiterentwickeln (nach jedem Sprint neue, lauffähige Version > releases in git) (alle)

------------------------------------------------------------------------------------------

#01.05.2016 (Online Meeting via Team Viewer)

- Fehler/Kompilierfehler mit Studio bei Steven (Theme.AppCompat.Light-Library)
- Thomas testet am selben Abend (01.05.2016) noch SDK und AVD und gibt Steven Bescheid, ob dieselben Fehler auftreten > wenn nicht, arbeitet Steven via Eclipse (+SDK, AVD)
- Steven muss noch Pullrequest ziehen (Datensatz nicht aktuell)
- Steven hat DB DesignerFork erstes Shema gemacht
 mit den wichtigsten Attributen (erklärt es)

- WIEDERHOLUNGSLOGIK: Nutzer > alle 5 Min > Frage richtig > isIgnore false, lastShown Date, isLastAnswerCorrect true > nächste Frage ... > falsch beantwortete Fragen wiederholt (sortiert nach lastShown) > User kann bereits richtig beantwortete Fragen ignorieren (isIgnore true) > bis alle Fragen richtig gewesen sind > und keine Fragen mehr, die User noch nicht gesehen hat (lastShown) > Report / Statistik

**Tasks**:

Alle (04.05.2016):
- Java-Version (master) 1.8.0_91 (prüfen)
- Libraries prüfen > Build / Run as Android Application
- alle aktuell, alle haben ausführbaren Code

Steven (13.05.2016):
- Steven lädt DB-Schema-XML-Datei hoch und ergänzt in Dokumentation (bis 04.05.2016)
- DB-SQLite-Schema erstellen
- Prototyp der DB erstellen
- wie in Android-Projekt hinein?
- Testdatensatz erzeugen

Andreas (13.05.2016):
- wichtigste Dateien / Ordner zusammentragen > online stellen bzw. in peat-Slack-Kanal
- GUI erweitern Logik: Frage steht, Ja / Nein-Radio-Buttons (Variablen true/false)

Thomas (13.05.2016):
- GUI erweitern (Themenauswahl, Frage stellen; PeatUser_has_Themes)

**Ausblick**:
- Fragetypen (Multiple Choice, Offene Fragen)
- Neuanlage von Fragen
- Wiederholung > länger werdende Zeiträume
- Spacing Effekt
- Rating der User/Contributer/Fragen > Statistiken/Sperre, User-Community

------------------------------------------------------------------------------------------

#08.05.2016 (Online Meeting via Team Viewer)

Startschwierigkeiten :)

**Rückblick**:
- Andreas hat einige Buttons/Funktionen (siehe GitHub) hinzugefügt.
- Thomas hat das Projekt implementiert und lauffähig gemacht.
- Steven hat sich weiter hinsichtlich der Datenbank informiert und diese erweitert/vorbereitet.

**Tasks**:

Alle:
- Jeder zieht sich noch einmal den aktuellen Stand nach dem heutigen Meeting
- Sprints werden ggf. nachträglich dokumentarisch erfasst
- weitere Dokumentation erfolgt nach Fortschritt mit DB (-Anbindung)

Steven:
- wird das Projekt noch einmal in Eclipse aufbauen, statt Android Studio zu nutzen
- DB ist bis 15.05. aufgesetzt

Andreas:
- committed letzten Stand der Entwicklung
- Wie funktioniert Datenbankanbindung (theoretische Vorbereitung)?

Thomas:
- GUI erweitern (Themenauswahl, Frage stellen; PeatUser_has_Themes (siehe database https://github.com/andreasmosig/peat/tree/master/doc/DB)

------------------------------------------------------------------------------------------

#10.05.2016 (Online Meeting komplette Gruppe)

Andreas:
- den aktuellen Prototyp von #peat in die Dropbox legen und Link an Herrn Prof. Edlich senden: https://www.dropbox.com/sh/8djn2di76w9jqga/AABS1uvujSAhcy7iVWHPvo9oa?dl=0 - done

**Tasks**:
- zum nächsten Online Meeting mit allen am 24.05.2016 einen Prototyp präösentieren

------------------------------------------------------------------------------------------

#17.05.2016 (Online Meeting via Moodle)
21 Uhr
Teilnehmer: Andreas, Thomas

- verschoben vom 16.05.2016
- Protokoll, Tasks und Statusbericht aktualisieren
- Prüfungsterminwunsch verabschieden: 08.07.2016 um 12:30 Uhr (ist noch frei)

**Rückblick**:
- Versionen v1.0.0-0008 bis v1.0.0-0010 (siehe https://github.com/andreasmosig/peat/releases)
- Andreas postet Tutorials zu SQLite in Slack #peat, onClickNoSound hinzugefügt, Fragen-Array und Merged Pull Requests und löst Konflikte
- Steven schreibt die Klassen PeatDbHelper.java und PeatDataSource.java und Question.java
- Thomas schreibt user_themes.xml, eine neue Activity ging leider verloren
- Thomas Lösung der Fehlermeldung *This version of the rendering library is more recent than your version of ADT plug-in. Please update ADT plug-in*: Android SDK öffnen > Android 5.1.1 (API22) installieren (ohne Images) > Eclipse neu starten > xml editieren > rechts oben im XML-Fenster beim grünen Roboter auf Version 5.1.1 umstellen > fertig
- Lösung weiterer Fehlermeldung *The following classes could not be found: android.support.v7.internal.app.WindowDecorActionBar (Fix Build Path, Edit XML, Create Class)*: in res/values-v14/styles.xml Base.Theme.AppCompat.Light.DarkActionBar statt Theme.AppCompat.Light.DarkActionBar

**Tasks**:

Andreas:
- Release v1.0.0-0011 erstellen

Thomas:
- Feedback an Herrn Prof. Edlich senden
- inkl. Prüfungsterminwunsch
- weiter an der neuen Activity zur PeatUser_has_Themes-Tabelle arbeiten

**Ausblick**:
- zeitnahen, internen Termin (außerordentlich) finden
- Zielversion v2.0.0-0001: Datenbankanbindung ersetzt das Mockup-Fragen-Array
- Organisatorisches: Asana, easyBacklog, etc
- Prototyp für den 24.05.2016 zum Gruppenmeeting vorbereiten

------------------------------------------------------------------------------------------

#21.05.2016 (Meeting nach der Präsenz)
15:30 Uhr - ca. 16:30 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Ergebnisse**:
- zeitnahen, internen Termin (außerordentlich) finden > hiermit erledigt
- Fehlersuche für App-Absturz mittels Try-Catch erfolglos, weil Stack zu diesem Zeitpunkt nicht nachvollziehbar
- Einigung auf die Umsetzung des Single-Choice Fragetypen für den Prototypen zur Präsentation am 24.05.2016

**Tasks**:

Andreas:
- Exception-Handler intergrieren um Fehlermeldung analysieren zu können
- .gitignore um bin/ und gen/ ergänzen (Herrn Edlichs Vorschlag umsetzen)
- Button "Close" durch Button "Menü" ersetzen

Steven:
- Datenbank-Fehlersuche

Thomas:
- GUI inkl. Datenbankanbindung für Single-Choice-Fragetyp

Alle:
- Kurz-Meeting unmittelbar vor der Präsentation am 24.05.2016 zwecks Absprache Schwerpunkte der Präsentation

------------------------------------------------------------------------------------------

#24.05.2016 (Online Meeting komplette Gruppe)

**Ergebnisse**:
- Prototyp nicht ganz fertig geworden: keine Datenbankanbindung
- Präsentation der App per ADK-Emulator durch Andreas
- Hinweis Herr Edlich:
-- weitere Fragetypen mit einplanen --> war für Enddokumentation für den Ausblick bereits vorgesehen
-- USP und Geschäftsmodell herausarbeiten

Andreas:
- Under-Construction-Activity für die Fragetypen, die noch nicht umgesetzt sind erstellen

Thomas:
- notieren der Hinweise von Herrn edlich in Enddokumentation

------------------------------------------------------------------------------------------

#31.05.2016 (Online Meeting via Moodle)
21 Uhr
Teilnehmer: Andreas, Thomas

- Protokoll, Tasks und Statusbericht aktualisieren
- weiteres Vorgehen besprechen
- Prüfungsterminwunsch nachfragen, da Zusage für 08.07.2016 um 12:30 Uhr, in Moodle jedoch jetzt Tagliatelle vermerkt statt #peat

------------------------------------------------------------------------------------------

#01.06.2016 (Online Meeting via Moodle)
21 Uhr
Teilnehmer: Steven, Andreas, Thomas

**Tasks**:

Steven:
- Pushen deines Repositorys nach origin/master (Andreas)
- Fehlerbehebung Datenbank
- Mock für Andreas-Task schreiben

Andreas:
- Funktion "Frage aus Datenbank holen" implementieren

Thomas:
- Lösung für Problem "Zugriff Datenbank-Objekt " finden
- Funktion "neue Frage speichern"

Alle:
- Protokoll, Tasks lesen und für Sonntag weiteren Projekt-Fahrplan vorbereiten

------------------------------------------------------------------------------------------

#05.06.2016 (Online Meeting via Moodle)
20:15 Uhr
Teilnehmer: Steven, Andreas, Thomas

**Ergebnisse**:
- Steven hat Datenbank-Fehler behoben und Repository gepusht

**Tasks**:

Steven:
- in MainActivity die Datenbankverbindung schließen (close)
- es fehlt noch für den Button zurück eine Methode getLastQuestion (Gegenpart zu getNextQuestion)

Andreas:
- mit aktuellem Repository Funktion "Frage aus Datenbank holen" implementieren

Thomas:
- mit aktuellem Repository Funktion "neue Frage speichern" implementieren

------------------------------------------------------------------------------------------

#08.06.2016 (Online Meeting via Moodle)
20:00 Uhr
Teilnehmer: Steven, Andreas, Thomas

**Ergebnisse**:
- Steven hat noch einen Fehler entdeckt und korrigiert bis morgen den Code
- Andreas & Thomas erarbeiten eine erste Gliederung für die Dokumentation
- nächstes Treffen 9.6.: Ziel: Lesen aus und Speichern in Datenbank

------------------------------------------------------------------------------------------

#09.06.2016 (Online Meeting via Moodle)
18:00 Uhr
Teilnehmer: Andreas, Thomas

**Ergebnisse**:
- Gliederung besprochen (wird am Samstag, den 11.06. gemeinsam verabschiedet und zugeteilt)
- Bearbeitung der Dokumentation erfolgt über GoogleDocs: https://docs.google.com/document/d/1lXp826fNUOqA218F46cWIHy61nWo_skWwVwSv0FM8x8/edit
- Dokumentation im MD-Format gepflegt

**Tasks**:

Steven: 
- Lösung des Übergabe-Problems in/aus der Datenbank
- in MainActivity die Datenbankverbindung schließen (close)
- es fehlt noch für den Button zurück eine Methode getLastQuestion (Gegenpart zu getNextQuestion) 

Andreas:
- mit aktuellem Repository Funktion "Frage aus Datenbank holen" implementieren

Thomas:
- mit aktuellem Repository Funktion "neue Frage speichern" implementieren

------------------------------------------------------------------------------------------

#11.06.2016 (Präsenz)
11:30 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- GetLastQuestion ("Back")
- Geschlossene Frage in DB speichern - DONE
![FehlermeldungSpeichern] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/FehlerFrageSpeichern.png)
- GUI noch ändern hins. Antwort und Sound
- Klick auf "Weiter" sollte am Ende  wieder bei 1 beginnen?
- Funktion für "Pause"?

**Ergebnisse**:
- Muss 1: Antwort (true, false) aus DB lesen und Sound entsprechend ausgeben
- Muss II: getLastQuestion
- Muss III: Frage Speichern für Choice fertig programmieren
- Muss IV: Vorgehen am Ende des Fragelaufs (Score oder Start von Beginn an)
- Kann I: Userverwaltung: Standarduser BENUTZER#1, andere Benutzer eingeben
- Kann II: Abspeichern Fragethema bzw. Fragetyp in allen Activities berücksichtigen

**Tasks**:

Steven:
- manuell gespeicherte Frage muss auch ausgegeben werden
- Methode für Antworten-Übergabe
- Methode für Themen-Speichern
- Methode GetLastQuestion (Gegenpart zu getNextQuestion)
- in MainActivity die Datenbankverbindung schließen (close)
- User-Verwaltung

Andreas:
- mit aktuellem Repository Funktion "Frage aus Datenbank holen" implementieren
- Arbeiten an der Dokumentation

Thomas:
- mit aktuellem Repository Funktion "neue Frage speichern" implementieren
- Arbeiten an der Dokumentation

------------------------------------------------------------------------------------------

#19.06.2016 (Online Meeting via Moodle)
20:00 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- Ja/Nein Frage in DB speichern - DONE
- Fehlermeldung bei Speichern - DONE
- über GUI gespeicherte Fragen in Main-GUI ausgeben - In Progress (Steven)
- GUI noch ändern hins. Antwort und Sound - In Progress (Steven)
- Klick auf "#repeat" sollte die zuletzt gestellte Frage ausgeben - Pending (zurückgestellt für Version 2.0)
- Klick auf "Weiter" sollte am Ende  wieder bei 1 beginnen? - Pending (zurückgestellt für Version 2.0)
- Funktion für "Pause"? - Pending (zurückgestellt für Version 2.0)
- GetLastQuestion ("Back") - Pending (zurückgestellt für Version 2.0)
- Zuweisung der Gliederungspunkte der Dokumentation - DONE

**Ergebnisse**:
- Muss I: Antwort (true, false) aus DB lesen und Sound entsprechend ausgeben - In Progress (Steven)
- Muss II: Frage Speichern für Choice fertig programmieren - DONE
- Muss III: Abspeichern Fragethema bzw. Fragetyp in allen Activities berücksichtigen - In Progress (Thomas, Steven)
- Kann I: getLastQuestion - Pending (zurückgestellt für Version 2.0)
- Kann II: Vorgehen am Ende des Fragelaufs (Score oder Start von Beginn an) - Pending (zurückgestellt für Version 2.0)
- Kann III: Userverwaltung: Standarduser BENUTZER#1, andere Benutzer eingeben - Pending (zurückgestellt für Version 2.0)
- Thomas und Andreas treffen sich am 25.06. zur Arbeit an der Dokumentation

**Tasks**:

Steven:
- manuell gespeicherte Frage muss auch ausgegeben werden - In Progress
- Methode für Antworten-Übergabe - In Progress
- Methode für Themen-Speichern - In Progress
- in MainActivity die Datenbankverbindung schließen (close) - In Progress
- User-Verwaltung - Pending (zurückgestellt für Version 2.0)
- Methode GetLastQuestion (Gegenpart zu getNextQuestion) - Pending (zurückgestellt für Version 2.0)
 
Andreas:
- mit aktuellem Repository Funktion "Frage aus Datenbank holen" implementieren - übergeben an Steven (In Progress)
- Arbeiten an der Dokumentation - In Progress

Thomas:
- mit aktuellem Repository Funktion "neue Frage speichern" implementieren - DONE
- Arbeiten an der Dokumentation - In Progress

------------------------------------------------------------------------------------------

#25.06.2016 (Online Meeting via Moodle)
20:00 Uhr
Teilnehmer: Andreas, Thomas

**Agenda**:
Rücksprache hins. "In Progress" sowie Status der Dokumentation.

**Ergebnisse**:
- Steven ist abwesend.
- Dokumentation wird Sonntag, 26.06. voraussichtlich fertig.
- Meeting hins. Programmierung ("In Progress") vertagt auf Sonntag, 26.06. zw. 11:00 und 18:00 Uhr (Steven unterbreitet Vorschlag).

**Weiteres Vorgehen**:
- Für Präsentation wird die pptx-Vorlage der Beuth-Hochschule verwendet.
- Code säubern, kommentieren.
- Letzte Tests durchführen.
- Fertigstellung der Dokumentation und Einbindung in md-Format (GitHub).
- Einigung auf
  - Link-Syntax, statt Fußnoten
  - Begriffklärung bzw. Schreibart

------------------------------------------------------------------------------------------

#26.06.2016 (Präsenz- und Online Meeting via Moodle)
11:00 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- Rücksprache hins. "In Progress" sowie Status der Dokumentation.

**Ergebnisse**:
- Präsentation fertigstellen bis 06.07..
- Code säubern, kommentieren (javadoc?) bis 07.07..
- Weitere Tests durchführen bis 06.07..
- Fertigstellung der Dokumentation und Einbindung in md-Format (GitHub) bis 06.07..
- Einigung auf:
  - Link-Syntax, statt Fußnoten
  - Begriffklärung bzw. Schreibart
- Themen **Programmierung** (bis spät. 06.07.)
  - manuell gespeicherte Frage muss auch ausgegeben werden - DONE
  - mit aktuellem Repository Funktion "Frage aus Datenbank holen" implementieren - DONE
  - Methode für Antworten-Übergabe - DONE
  - Methode für Themen-Speichern - DONE
  - in MainActivity die Datenbankverbindung schließen (close) - DONE
  - Back-Button (Aufruf der letzten Fragen mittels getNextQuestion) - IN PROGRESS (bis 06.07.)
  - User-Verwaltung - zurückgestellt für Version 2.0

* ab Dienstag, 28.06., regelmäßige Abstimmung mit Steven, wie weit der Code ist.

------------------------------------------------------------------------------------------

#03.07.2016 (Online Meeting via Moodle)
20:00 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- Rücksprache hins. "Pending" sowie Status der Dokumentation sowie der Präsentation.

**Ergebnisse**:
- bis 06.07.: lesen Dokumentation und kommentieren/ergänzen
- bis 06.07.: Steven in Dokumentation ergänzen
- bis 06.07.: Back-Button

------------------------------------------------------------------------------------------

#06.07.2016 (Online Meeting via Moodle)
21:00 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- Dokumentation fertigstellen und in md-Format einbinden (GitHub)
- Präsentation fertigstellen und aufteilen
- Code kommentieren und säubern

**Ergebnisse**:
- Back-Button - DONE
- Dokumentation fertiggestellt und in md (GitHub) eingebunden
- Präsentation fertiggestellt und in Dokumentation verlinkt
- bis 07.07.: Javadoc des relevanten Codes
- bis 07.07.: Tagging des letzte Releases v1.0.1 und APK-Prototyp in Dropbox verfügbar machen
- ab 07.07. 23:59 Uhr keine Änderungen mehr am Code!

------------------------------------------------------------------------------------------

#08.07.2016 (Online Meeting via Moodle)
12:00 Uhr
Teilnehmer: Andreas, Thomas, Steven

**Agenda**:
- Vorbereitung auf Präsentation
- 13:00 Uhr: Präsentation, D 418

**Ergebnisse**:
- Note: 1.3 :wink: