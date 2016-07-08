#Dokumentation Lernapp #peat

Erlerntes spielend wiederholen und nie wieder vergessen!

![peat](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/peat.jpg)

####Version:
######v1.0.1

####Ausgabe:
######1

####Autoren/Entwickler:
######Steven Pawellek, Thomas Ricklinkat, Andreas Mosig

####Kontakt:
<mailtopeat@gmail.com>

####Stand:
######06.07.2016

######Beuth Hochschule für Technik Berlin, Wirtschaftsinformatik, 4. Semester, Sommersemester 2016

-----------------------------------------------------------------------------------------------

#Gliederung

[1. Einleitung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#1-einleitung)

[1.1. Problemstellung und Zielsetzung der Arbeit](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#11-problemstellung-und-zielsetzung-der-arbeit)

[1.2. Projekt-Stammdaten](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#12-projekt-stammdaten)

[1.3. Projektidee, -ziel und -plan](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#13-projektidee--ziel-und--plan)

[1.4. Vorgehensweise](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#14-vorgehensweise)

[2. Vorbetrachtungen (IST-Analyse)](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#2-vorbetrachtungen-ist-analyse)

[2.1. Theoretische Aspekte einer Lernsoftware](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#21-theoretische-aspekte-einer-lernsoftware)

[2.2. Vision und Geschäftsmodell](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#22-vision-und-gesch%C3%A4ftsmodell)

[2.3. Marktanalyse](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#23-marktanalyse)

[3. Produktdefinition und Systementwurf (SOLL-Konzept)](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#3-produktdefinition-und-systementwurf-soll-konzept)

[3.1. Requirements](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#31-requirements)

[3.2. Design und Architektur](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#32-design-und-architektur)

[3.3. Konzept der Qualitätssicherung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#33-konzept-der-qualit%C3%A4tssicherung)

[4. Umsetzung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#4-umsetzung)

[4.1. Plattform](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#41-plattform)

[4.2. GUI](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#42-gui)

[4.3. Logik](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#43-logik)

[4.4. Persistenz](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#44-persistenz)

[4.5. Versionierung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#45-versionierung)

[5. Schlussbetrachtung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#5-schlussbetrachtung)

[5.1. Zusammenfassung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#51-zusammenfassung)

[5.2. Erkenntnisse](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#52-erkenntnisse)

[5.3. Ausblick](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#53-ausblick)

[6. Anhang & weiterführende Links](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#6-anhang--weiterf%C3%BChrende-links)

[7. Glossar](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#7-glossar)

-----------------------------------------------------------------------------------------------

#1. Einleitung

##1.1. Problemstellung und Zielsetzung der Arbeit

Das **Lerngebiet** des Softwareentwicklungsprojektes erstreckt sich über viele Aspekte der Softwaretechnik, bspw. in der praktischen Anwendung von Modellierungsprachen (wie z.B. UML) sowie von Vorgehensmodellen der Softwareentwicklung (z.B. Scrum).


Das übergeordnete **Lernziel** war, aus den in der Theorie erworbenen Inhalten, die individuellen sowie gruppenspezifischen Kompetenzen herauszubilden resp. zu verstärken. Diese sind u.a. die Fähigkeit zur selbständigen Bearbeitung einer Aufgabenstellung, die Anforderungsanalyse sowie die Modellierung prozessorientierter Systeme. Darüber hinaus lassen sich weitere Ziele nennen, wie z.B. die Realisierung in einer Gruppe, die daraus resultierende Forderung und Förderung der Teamfähigkeit und schließlich das Einüben systematischer Vorgehensweisen und Arbeitstechniken auf wissenschaftlicher Basis. Selbstverständlich sollten auch die Arbeitsergebnisse in Form einer lauffähigen Anwendung sowie der hier vorliegenden Dokumentation präsentiert werden.


Das konkrete **Projektziel** war das Entwickeln einer Implementierungsidee für ein (virtuelles) Startup, hin zu einem lauffähigen Prototypen. Dieser soll dem Auftraggeber, welcher sich als Business Angel (BA) versteht, präsentiert werden, um seine finanzielle Beteiligung an dem Projekt in Höhe von 300.000 EUR zu erwirken. Während des Entwicklungsprozesses sollte des Weiteren eine ausführliche Dokumentation erstellt werden, die Ihnen hiermit vorliegt. Neben der Projektdokumentation lag der Fokus auf dem Kodieren (Applikation, Interfaces) und einer gesunden Gruppendynamik.


Das **Team \#peat** bestand zu Beginn, d.h. in der Findungsphase einer Vision, noch aus zwei Mitgliedern. Schnell wurde klar, dass die gestellten Anforderungen an das Projekt noch eine weitere Kraft erfordern würden. Im Zuge der finalen Festlegung der Idee sowie der Gruppe, galt es die nächsten Ziele und Meilensteine zu definieren. Ein [Exposé](https://github.com/andreasmosig/peat/blob/master/doc/EXPOSE.md) sollte die ersten Weichen stellen. Hierin wurden Anforderungen, theoretische Grundlagen, technische Aspekte, wie z.B. Architektur und Entwicklungsumgebung sowie Meilensteine abgesteckt.

Die **Statusberichte** wurden alle ein bis zwei Wochen per E-Mail an den BA samt der Verlinkungen zu den Projektmanagement- sowie Versionsverwaltungsanwendungen geschickt (s. [6. Anhang & weiterführende Links](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#6-anhang--weiterf%C3%BChrende-links)).

##1.2. Projekt-Stammdaten

#####a) Gruppenmitglieder

* Thomas Ricklinkat (s58372@beuth-hochschule.de, Matr.-Nr. 821644)

* Andreas Mosig (s58395@beuth-hochschule.de, Matr.-Nr. 817272)

* Steven Pawellek (s45848@beuth-hochschule.de, Matr.-Nr. 776340)


#####b) Projektdauer

* Der Projektzeitraum erstreckte sich vom 7. April (Kick-Off) bis zum 8. Juli 2016, dem Tag der Präsentation der Arbeitsergebnisse.


#####c) Projektmanagement-Werkzeuge

* Für den allgemeinen Austausch und für die Projekt- sowie interne Kommunikation mit dem BA und allen Kommilitonen, wurde eine allgemein zugängliche [Slack-Gruppe](http://beuthswtprojekt.slack.com) vom BA eingerichtet. Darüber hinaus verfügte jede Projektgruppe über ihren eigenen, projektinternen Slack-Kanal. Für das vorliegende Projekt war es der Kanal **peat**.


* Das Projektmanagement fand via [asana.com](https://app.asana.com/0/105766113985042/105766113985043) statt, welches synchron mit dem Projekt-Slack-Kanal verbunden war. Jegliche asana-Kommunikation war und ist im Slack-Kanal nachvollziehbar (s. [5.2. Erkenntnisse](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#52-erkenntnisse)).


* Für die agile Software-Entwicklung mit Scrum war ursprünglich das Arbeiten mit dem Tool [easyBacklog](https://easybacklog.com/) vorgesehen (s. [5.2. Erkenntnisse](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#52-erkenntnisse)).


* Das Versionsmanagement erfolgte via [GitHub](https://github.com/andreasmosig/peat). Analog zu asana liefen alle Aktivitäten im privaten Slack-Kanal zusammen und waren für den BA einsehbar (s. [5.2. Erkenntnisse](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#52-erkenntnisse)).


#####d) Entwicklungswerkzeuge

* Für die verschiedenen Komponenten und Schnittstellen sind unterschiedliche Technologien und Werkzeuge notwendig gewesen. Zum Entwickeln der [Android](https://de.wikipedia.org/wiki/Android_(Betriebssystem))-App in Java wurde Eclipse sowie dafür notwendige Plugins (SDK/AVD, (s. [4.1. Plattform](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#41-plattform))) verwendet.


* Für die Erstellung des konzeptuellen und logischen Datenbankschemas wurde der DBDesigner-Fork verwendet und daraus das entsprechende SQL-DDL-Skript erzeugt und als Klasse in Eclipse eingebunden, da in der Entwicklungsumgebung bereits Bibliotheken zum Ansteuern der SQLite-Datenbank vorhanden gewesen sind.


* Sonstige Tools waren Modellierungsprogramme, wie ArgoUML und UMLet, welche der theoretischen Konzeption der UML-Diagramme dienten (u.a. Use Cases, Paket-, Deployment- und Komponentendiagramm). Die Versionierung erfolgte über die Git-Shell von GitHub.

##1.3. Projektidee, -ziel und -plan

Die **Implementierungsidee** für das (virtuelle) Startup \#peat entstand aus einem studentischen Grundbedürfnis (Lernen) sowie der Erfahrung heraus, gefestigtes Wissen länger zu behalten, als ungefestigtes Wissen. Daher lag es nahe, eine Anwendungssoftware zu entwickeln, die Lerninteressierte dabei unterstützt, erlerntes Wissen durch Wiederholung in **Frageform** zu festigen und damit den Lernerfolg langfristig zu maximieren.


Bei der Namensfindung für die Lernapplikation (Lernapp) spielten folgende Überlegungen eine Rolle:


* “peat” stammt aus dem englischen Verb “repeat” (engl. wiederholen)

* ein menschlich klingender Name soll ganz allgemein die Einstellung zum Lernen sowie die Kommunikation bzgl. der Applikation positiv stärken: \#peat als dein Freund

* Hashtag \# zur Optimierung des Namens aus Online-Marketingsicht


Für den späteren wirtschaftlichen Erfolg der Lernapp im Allgemeinen sowie für eine erfolgreiche Unternehmenskommunikation im Speziellen, z.B. in einem App-Store, ist es u.a. wichtig, einen einprägsamen **Claim** bzw. **Slogan** zu haben. Für \#peat ist das


> Erlerntes spielend wiederholen und nie wieder vergessen!


Eine **Kurzbeschreibung** zur knappen und marktgerechten Erläuterung der Anwendungsfunktionalitäten, z.B. für einen Appstore oder einen SEO-relevanten Text auf der Website, könnte wie folgt aussehen:


> \#peat hilft dir, dein erworbenes Wissen durch intelligente Wiederholung zu verfestigen und damit ins Langzeitgedächtnis zu überführen. Und das funktioniert so: hinterlege in deinem Account offene oder geschlossene Fragen zu verschiedenen Themenbereichen sowie deren Antwortmöglichkeiten und sage \#peat, wann bzw. wie häufig dich \#peat abfragen soll. Fertig. \#peat fragt dich ab sofort bequem per Push-Notification oder per Lernquizz auf deinem Smartphone ab und du kannst die Frage direkt beantworten oder ignorieren. Am Ende des Tages kannst du dir deinen Lernerfolg darstellen lassen. Re \#peat!


Wie in Punkt [1.1](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#11-problemstellung-und-zielsetzung-der-arbeit) bereits erwähnt, war das vorrangige **Projektziel** das Entwickeln einer Implementierungsidee hin zu einem lauffähigen, präsentierbaren Prototypen innerhalb von knapp drei Monaten. Vor diesem Hintergrund war es daher zunächst erforderlich, das Gesamtziel in Teilziele zu zerlegen und dabei jeweils zu unterscheiden, was davon realistisch gesehen in dieser Zeit umgesetzt werden kann bzw. was davon in den Ausblick genommen werden muss. Der folgende Milestone-Plan zeigt das Ergebnis dieser Überlegungen, wobei die einzelnen Meilensteine in Anlehnung an die Scrum-Methode als “Sprints” bezeichnet werden:


* Sprint 0) Semesterstart (29.03.2016)

* Sprint 1) Projekt-KickOff E-Mail durch den BA (07.04.2016)

* Sprint 2) UML-Diagramme, Architekturbild, GUI-Entwurf (18.04.2016)

* Sprint 3) Abgabe Exposé (18.04.2016)

* Sprint 4) Freigabe des Exposés/Projekts durch den BA (23.04.2016)

* Sprint 5) Product Backlog in easyBacklog anlegen (01.05.2016)

* Sprint 6) Einrichten der Entwicklungsumgebung (04.05.2016)

* Sprint 7) Erstellung des Datenbankschemas (08.05.2016)

* Sprint 8) erster, versionierter, explorativer Prototyp ohne Persistenz (23./24.04.2016)

* Sprint 9) Implementierung der Datenbank im Android-Projekt (13.05.2016)

* Sprint 10) Demonstration eines ersten Prototypen mit DB und Versionierung (25.05.2016)

* Sprint 11) Schreiben in Datenbank: Eingabe für eine neue Ja-Nein-Frage in Datenbank speichern (19.06.2016)

* Sprint 12) Lesen aus Datenbank: Wiederholungslogik in Form eines Quizz-Spiels (29.06.2016)

* Sprint 13) Themen speichern (und abonnieren, ab **v2.0.1**) (30.06.2016)

* Sprint 14) Quizz vor und zurück gehen (04.07.2016)

* Sprint 15) Erzeugung des Abgabe-Prototypen inkl. Tests (07.07.2016)

* Sprint 16) Fertigstellung der Enddokumentation (06.07.2016)

* Sprint 17) Vorbereitung Präsentation (07.07.2016)

* Sprint 18) Abgabe und Präsentation (08.07.2016)


Neben den inhaltlichen Aufgaben gehörte die **Projektkommunikation** mit dem BA als projektbezogene Aufgabe mit zu den Anforderungen: Während der gesamten Laufzeit des Projektes sollte es mit dem BA einen regelmäßigen (mindestens alle 1-2 Wochen) Austausch in Form eines [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) sowie eines [Statusberichtes](https://github.com/andreasmosig/peat/blob/master/doc/STATUSBERICHTE.md) geben.

##1.4. Vorgehensweise

Die Systementwicklung fand entsprechend der Projektgröße agil und hinsichtlich der iterativen Entwicklung eines Prototyps (Prototyping) explorativ und evolutionär statt. Sie sollte nach Vorgabe durch den Auftraggeber (BA) der Scrum-Methode folgen. Die in der Theorie eindeutig verteilten Rollen des Product Owners, des Scrum Masters, des Teams und ggf. weiterer externer Rollen war im Rahmen dieses Projektes nicht immer eindeutig bestimmt. Es kam vor, dass alle Teilnehmer sporadisch in die Rolle des Product Owners geschlüpft sind oder jedes Teammitglied spontan in die Rolle des Scrum Masters gewechselt ist. Zu allen Zeitpunkten gab es jedoch immer den Product Owner und das Team.


Der Entwicklungsprozess zu \#peat richtete sich nach dem Scrum-Prozess:


* Vision: die Vision stimmt mit der Implementierungsidee überein und markierte den Beginn der Lernapp \#peat

* Product Backlog: als Product Backlog verstehen sich Teile des Exposés, insbesondere die in UML modellierten Anwendungsfälle

* Sprint Planning: die 1-2 wöchentlichen Online-Meetings dienten u.a. der Planung, Schätzung und Bewertung der einzelnen Backlogs. Auf dieser Basis wurden dann die notwendigen Schritte im Hinblick auf das Projektziel erörtert. Die Ziele dieser Teilschritte sind mit den Sprintzielen identisch. Das Sprint Planning lässt sich anhand des [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) nachvollziehen.

* Selected Product Backlog & Sprint Backlog: die im Sprint Planning definierten Teilschritte enthielten jeweils die notwendig umzusetzenden Aufgaben (Backlogs)

* Sprint: die Sprints an sich hatten einen 1-2 wöchentlichen Rhythmus

* New Functionality: jeder Sprint enthielt jeweils eine in sich geschlossene Funktionalität, die dann zum nächsten Treffen präsentierbar sein sollte (usable Software)

* Retrospective: insbesondere die Zusammenkünfte zu den Präsenzen dienten der taktischen/strategischen Rückschau. Kleinere Rückschauen gab es zu den 1-2 wöchentlichen Online-Meetings.


In der ursprünglichen Planung sollte der Scrum-Prozess durch das Tool easyBacklog unterstützt werden. Das wurde zu Beginn des Projektes auch versucht, stellte sich jedoch schnell für das Projekt als zu umständlich heraus. Die weitreichenden Funktionen von easyBacklog eignen sich besser für größere Projekte und ein mit easyBacklog immer aktuell gepflegtes Backlog hätte in diesem Projekt eher ein ressourcenbindenden Dokumentationscharakter gehabt. Daher wurde für den weiteren Verlauf auf dieses Tool verzichtet.


![Auszug aus dem easyBacklog](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/auszug-easyBacklog.png)

#2. Vorbetrachtungen (IST-Analyse)

##2.1. Theoretische Aspekte einer Lernsoftware

Für den Entwurf des Datenbankschemas sowie die Modellierung der Wiederholungslogik war es zunächst wichtig, sich in einem angemessenen Umfang mit dem Sachgebiet vertraut zu machen und die folgenden zentralen Fragen zu beantworten:


* Welche Fragekategorien gibt es, welchen Einfluss haben diese auf die Lernapplikation und welche sind tatsächlich relevant?

* Welchen Einfluss haben Wiederholungsrate und -reihenfolge auf den Lernerfolg?


Die Implementierungsidee zu \#peat stützt sich im Allgemeinen auf die [Wiederholung als Lernmethode](https://de.wikipedia.org/wiki/Wiederholung_%28Lernmethode%29), die sich der [Fragetechnik](https://de.m.wikipedia.org/wiki/Fragetechnik) bedient. Die Kernfunktionalität von \#peat umfasst daher alle relevanten **Fragekategorien** und die dazugehörigen Antwortformate. In formaler Hinsicht werden die folgenden [Fragekategorien](https://de.wikipedia.org/wiki/Fragetechnik#Fragekategorien) unterschieden:


* Offene Fragen (freies Antwortformat)

* [Geschlossene Fragen](https://de.wikipedia.org/wiki/Multiple_Choice#Unterschiedliche_Formate_und_Begrifflichkeiten):

  * Binär-/Entscheidungs-/Ja/Nein-Fragen (eine von zwei dichotomen Antworten trifft zu: wahr/falsch, ja/nein …)

  * Single Choice (eine von n Antworten trifft zu)

  * Multiple Choice: Select (eine bekannte Anzahl von n Antworten trifft zu)

  * Multiple Choice: Check (eine unbekannte Anzahl von n Antworten trifft zu)


Für \#peat sind alle genannten Fragekategorien theoretisch wichtig und relevant, realistischerweise jedoch im Rahmen dieses Projektes nicht abschließend umsetzbar. Für das Prototyping musste diese Menge daher eingeschränkt werden und die Wahl fiel ganz im agilen Sinne auf die Fragekategorie mit der geringsten Komplexität, den Ja/Nein-Fragen. Der offene Fragetyp war nicht die erste Wahl, da die softwareseitige Eigenbewertung der Antwort für einen ersten Prototypen zu komplex und nebensächlich ist.


Hinsichtlich des optimalen **Wiederholungsintervalls** gibt die [Vergessenskurve](https://de.wikipedia.org/wiki/Vergessenskurve) erste wichtige Anhaltspunkte für die spätere Modellierung des Wiederholungsalgorithmus, denn sie veranschaulicht den Grad des Vergessens im Zeitverlauf. Aus ihr lässt sich aufgrund zahlreicher wissenschaftlicher Studien ableiten, dass durch Wiederholung des Lernstoffes der Grad des Vergessens verringert werden kann, wobei der Abstand der Zeitpunkte der Wiederholung einen relevanten Einfluss hat. Der sogenannte [Spacingeffekt](http://lexikon.stangl.eu/9382/spacing-effect-intervall-effekt/) besagt, dass Wissen besser erinnert wird, wenn zwischen der Erstaufnahme und der ersten bzw. den folgenden Wiederholung(en) ein größerer Zeitraum liegt. In der Literatur zu Lernmethoden finden sich diesbezüglich u.a. konkrete [Empfehlungen](https://www.uni-due.de/edit/selbstmanagement/content/content_k6_2.html): “Weitere Repetitionen sollen nach 24 Stunden, einer Woche, einem Monat, einem halben Jahr erfolgen.”


Diese Empfehlungen sind für ein erstes Prototyping bzw. für den Anfang sehr praktisch und lassen sich direkt in einen Wiederholungsalgorithmus übertragen. Eine Vielzahl an Forschungsergebnissen ([Wiederholungsintervall](http://www.lac.ane.pl/pdf/5409.pdf), [SuperMemo](https://en.wikipedia.org/wiki/SuperMemo#Algorithms)) auf diesem Gebiet legt jedoch eine differenziertere Betrachtung nahe; nicht zuletzt mit Blick auf die spätere [USP](https://de.wikipedia.org/wiki/Alleinstellungsmerkmal) der Anwendung. Daneben finden sich auch Informationen zu konkreten, [frei verfügbaren Algorithmen](https://www.supermemo.com/english/algsm11.htm), die jedoch den zeitlichen Rahmen dieses Projektes sprengen würden und damit in den Ausblick gehören.

##2.2. Vision und Geschäftsmodell

Die **Vision** zu \#peat ist, das geliebte Lerntool schlechthin für Wissbegierige zu sein.


\#peat soll nicht nur eine Plattform sein, auf der die User ihre persönlichen Wissensgebiete vertiefen, sondern auch mit anderen Usern teilen oder von professionellen Wissensträgern erwerben können. Thematisch soll \#peat universal angelegt sein und bis auf wenige Ausnahmen (z.B. Gewalt) kein Fachgebiet auslassen.


Der Schlüssel, die Vision zur Realität werden zu lassen, liegt dabei in deutlich wahrnehmbaren und für den Markt relevanten bzw. treffenden **USP**. Diese könnten sein:


* \#peat ist einfach: \#peat ist auf die wichtigsten Funktionen reduziert, getreu dem Motto “Keep learning simple”.

* \#peat ist individuell: frag dich selbst mit deinen eigenen Worten. Der Wiederholungsalgorithmus lernt mit und passt sich deinen Lernbedürfnissen an.

* \#peat ist riesig und vielfältig:

  * alle Wissensgebiete sind zugänglich. Karteikarten sind obsolet.

  * *Community*: jeder Teilnehmer kann seine eigenen Themen mit allen anderen teilen

* \#peat ist effektiv und effizient: der Wiederholungsalgorithmus basiert auf wissenschaftlichen Untersuchungen und optimiert den Lernprozess

* \#peat ist überall: als mobile App und für Desktop ist \#peat immer dabei


Die für den Erfolg notwendigen Investitionen bedürfen eines tragfähigen **Geschäftsmodells**, um die Existenz auch langfristig zu sichern. Die zentrale Frage dabei ist “Wie soll mal Geld verdient werden?”. Wie ein Blick auf die Startup-Szene zeigt, sind Geschäftsmodelle durchaus keine starren Gebilde [(Beispiel)](http://www.gruenderszene.de/allgemein/book-a-tiger-festangestellte-reinigungskraefte), sondern können abgewandelt, erweitert oder angepasst werden. Folgende Ideensammlung kommt für eine spätere Auswahl in Frage:


* *Free*: werbefinanzierte Einnahmen

* *Freemium*:

  * eine funktionsarme (z.B. nicht alle Frageformate stehen zur Verfügung) Gratis-Version für alle sowie eine Vollversion gegen Bezahlung

  * denkbar ist auch eine modulare Erweiterung (z.B. neue Frage-Wiederholungslogik), die je Update kostet

* Bezahl-App: jeder Download kostet (beginnend ab einer bestimmten Zahl an Usern)

* Marktplatzmodell (In-App-Kauf): Wissensträger können Inhalte in Form von Paketen oder Abonnements bereitstellen, z.B. Wissensgebiet “UML”. Diese Pakete bzw. Abonnements kosten je Download. Davon geht ein Teil an \#peat, der Rest an den Verfasser.

##2.3. Marktanalyse

Da der Projektfokus auf dem Programmieren lag, geht es bei der Marktanalyse eher um eine grobe Einordnung der Implementierungsidee in den Markt der Anwendungssoftware.


Thematisch bewegt sich \#peat auf dem Markt der Bildungsanwendungen, der mit knapp 10% Anteil an allen verfügbaren Apps im Appstore, das [drittstärkste Segment](http://de.statista.com/statistik/daten/studie/166976/umfrage/beliebteste-kategorien-im-app-store/) darstellt. Da das Segment Bildung noch zu allgemein gefasst ist, muss weiter eingegrenzt werden. Nach Auffassung der Autoren ist \#peat den elektronischen Karteikarten / Lernkarten zuzuordnen, die auch das Segment der elektronischen Vokabeltrainer mit einschließen.


In diesem Bereich gab es in den Appstores von Apple und Google zum Zeitpunkt des Projektes bereits zahlreiche Anwendungen: eine Suche am 25.06.2016 nach “Karteikarten” ergab im iTunes App Store ca. 17 Apps für Karteikarten und im Google Play Store mehr als 20 Apps (Vokabeltrainer wurden nichtberücksichtigt). Für eine echte Software-Entwicklung wäre eine genauere Analyse der einzelnen Anwendungen und deren Funktionalitäten erforderlich. An dieser Stelle sollen jedoch die ersten [Hinweise](http://www.studis-online.de/Studieren/studi-apps.php) der Google-Suche bzw. von digitalen [Ratgebern](https://allmaxx.de/magazin-uniglobale/studieren/unsere-10-besten-apps-zum-lernen) ausreichen, nach der folgende Anwendungen am bekanntesten / beliebtesten sind:


* [Flashcards Deluxe](http://orangeorapple.com/)

* [BRAINYOO](http://www.brainyoo.de/)

* [AnkiDroid Karteikarten](https://ankidroid.org)


Die Hürden für einen erfolgreichen Einstieg in diesen Markt liegen durch die hohe Zahl der Anbieter bereits etwas höher. Jedoch scheinen sich die aktuellen Angebote auf den ersten Blick an Endverbraucher zu richten. Ggf. ist die Entwicklung eines B2B-Modells eine aussichtsreiche Überlegung.

#3. Produktdefinition und Systementwurf (SOLL-Konzept)

##3.1. Requirements

Im Rahmen des **Requirements Engineering** geht es im Allgemeinen um die Frage, welche Anforderungen an das zu erstellende Softwaresystem existieren. Da diese Anforderungserhebung immer im Zusammenhang mit bestimmten Personengruppen steht, ist es erforderlich sich mit den (Ziel-)Gruppen bzw. Stakeholdern auseinanderzusetzen, an die \#peat sich richtet bzw. die von \#peat in irgendeiner Form betroffen sind.


Für \#peat stehen vor allem folgende Stakeholder bzw. Anspruchsgruppen im Fokus:


* Benutzer,

* Investoren,

* Geschäftspartner (Kollegen, Lieferanten),

* Öffentlichkeit und

* Staat,


wobei im Rahmen des Projektes ausschließlich die späteren Benutzer betrachtet wurden.


Das Volere Requirements Specification Template empfiehlt an dieser Stelle eine ausführliche Beschreibung der einzelnen Stakeholder inklusive fiktiver Persona-Profile und Gewichtungen, was jedoch den Rahmen dieser Arbeit überschritten hätte.


Um dem elementaren Charakter der Anforderungen gerecht zu werden, war geplant, die Anforderungen wie folgt zu managen:


* Dokumentation von Anwendungsfällen in Form eines Use-Case-Diagramms

* anschließende Konkretisierung der Requirements mit Hilfe des Tools easyBacklog im Rahmen der Product-Backlog-Erstellung


Wie bereits im Punkt [1.4.](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#14-vorgehensweise) erwähnt, wurde die Arbeit mit easyBacklog aufgegeben, so dass nur das Exposé-Use-Case-Diagramm existiert und damit dieser Punkt etwas zu kurz kam.


![visionäres Use-Case-Diagramm zu \#peat](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-use-case.png)


Mit Blick auf das Projektziel (ausführbarer Prototyp) war es notwendig, diese sehr weit gefassten Anwendungsfälle auf ein realistisches Maß zu reduzieren. Die nachfolgenden, ausschließlich funktionalen Anforderungen stellen das Ergebnis dieser Eingrenzung dar und bilden die Basis für die vom Prototypen zu erfüllenden Funktionalitäten. Die Schlüsselwörter "MUSS", "SOLL" und "KANN" sind dabei entsprechend der Definition im RFC 2119 zu interpretieren; Muss (Pflicht), Soll (Wunsch), Wird (Absicht) und Kann (Vorschlag).


**Prototyp** (**v1.0.1**):

* Muss I: Frage und Antwort speichern für Ja/Nein-Fragen - GUI und Datenbank

* Muss II: Antwort (true, false) aus DB lesen und per Button-Klick ausgeben - GUI und Datenbank

* Muss III: Je Antwort-Wert (Boolean) aus DB wird entsprechend der gespeicherten Antwort ein Sound wiedergegeben - Sound und Datenbank

* Muss IV: Über einen back-Button muss die vorherige Frage angezeigt werden können - GUI und Datenbank


* Soll I: Vorgehen am Ende des Fragelaufs (Start von Beginn an) - GUI und Datenbank


* Kann I: Abspeichern Fragethema sowie Auslesen und Anzeige im Quizz - GUI und Datenbank


**Ausblick** (ab **v2.0.1**):

* Soll II: Wiederholungslogik (nach letzter gespeicherter Frage falsch beantworteten Fragen wiederholen) - GUI und Datenbank

* Soll III: Vorgehen am Ende des Fragelaufs (Ausgabe der Punkte: richtige Antworten) - GUI und Datenbank

* Soll IV: “Ladebalken in %”: zeigt an, wie viele Fragen bereits beantwortet wurden und wie viele Fragen noch kommen - GUI und Datenbank


* Wird I: Alle Fragetyp-Varianten berücksichtigen (generischer Code) - GUI und Datenbank

* Wird II: Userverwaltung, Standarduser BENUTZER\#1, andere Benutzer eingeben - GUI, Web und Datenbank

* Wird III: Anderes Thema durch Benutzer auswählen - GUI und Datenbank

* Wird IV: Eigenständige Verwaltung der Wiederholungslogik durch den Benutzer (settings) - GUI, Web und Datenbank


* Kann II: Webbasierte Desktop-Version - Web und Datenbank


Nichtfunktionale Kriterien wurden im Rahmen dieses Projektes nicht berücksichtigt und werden im Ausblick kurz angerissen.

##3.2. Design und Architektur

In der Analysephase galt es zunächst herauszufinden, aus welchen Komponenten das System bestehen würde und welche (nicht-) funktionalen Anforderungen die Komponenten erfüllen sollen. Wie in dem vorangegangenen Kapitel zu lesen ist, hat man sich auf bestimmte Grade der Verbindlichkeit hinsichtlich der zu erfüllenden Kriterien der Lernapp konzentriert. In einem agilen Projekt ist es wichtig, einen Schwerpunkt zu setzen.


In den initialen Überlegungen, welche sich in diversen Entwürfen widerspiegeln ([Web-GUI](https://github.com/andreasmosig/peat/tree/master/doc/MOCKUPS/WEB)), ist zunächst der Weg erkennbar gewesen, dass es zwei Benutzeroberflächen geben würde (Web, App), die auf eine gemeinsame, auf einem Webserver installierte Datenbank (z.B. LAMP) zugreifen sollten. Dabei sollte die Web-GUI zum Erfassen und Lesen von Daten dienen (Schreib-, Lesezugriff per Benutzerkonto), die App-GUI hingegen das Lesen der Daten sowie das Konfigurieren der Wiederholungslogik zulassen.


Der Ergebnisfokus für diese Projektarbeit lag jedoch auf der Entwicklung der App und demnach mündeten die Analyse und das daraus resultierende theoretische Konzept im Laufe eines iterativen Prozesses in dem Design respektive in der Entwicklung der App-UI. Mit der Version **v1.0.1** wurde schließlich die App-Benutzeroberfläche fertiggestellt. 


**Design**

Unter (Software-)Design versteht man grob den Prozess zwischen Anforderungsanalyse und der Implementierung.


Aufbauend auf den mehr oder weniger konkreten Vorstellungen hinsichtlich der zu entwickelnden App, wurde im Anschluss an das RE die grundlegende Architektur definiert, zunächst nur wenige Komponenten (i.e. Android-Activities) spezifiziert und die wichtigsten Interaktionen transparent gemacht. Das Design ist auch in dem vorliegenden Projekt die Grundlage für den Beginn der konkreten Implementierung der theoretischen und praktischen Aspekte der Lernapp gewesen.


Die Designphase schloss sich (wie in der Theorie empfohlen) an die Analysephase an, weshalb ein Kern an Anwendungsfällen bezogen auf den Funktionsumfang der App bereits definiert wurde. In easyBacklog wurden, wie bereits eingangs beschrieben, zunächst die wichtigsten Use Cases mit Rollen, Ereignissen und Ergebnissen dokumentiert und schließlich in aus der Entwicklungsarbeit resultierenden Protokollen und fortlaufend aktualisierten Task-Aufstellungen aktualisiert. Man sollte zum Start einen möglichst guten Überblick haben, d.h. funktionale Anforderungen sollten bekannt sein (z.B. das Speichern und Lesen von Fragen und Antworten in die/aus der Datenbank) als auch nicht-funktionale Anforderungen (z.B. Usability der UI). Es fiel früh auf, dass man nicht alles vorher festlegen kann und ebenso, dass zu viele verschiedene Werkzeuge das Hauptaugenmerk, nämlich die Entwicklung/Programmierung, verwischen. Die Ersten Entwürfe, die mittels Lumzy angefertigt worden sind, zeigten schon früh die Anforderungen an die zu entwickelnde Lernapp \#peat:


#####a) App (für Version **v1.0.1**):

![Push] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/pushnotification.png)

![FrageJaNein] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/janeinfrage.png)

![Multiple] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/multiplechoice.png)

![Antwort] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/antwort.png)

![Einstellungen] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/einstellungen.png)

#####b) Web (für Version **v2.0.1**):

![Landing] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/landing.png)

![Konfiguration] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/konfiguration.png)


Es stellte sich früh heraus, dass bei agilen Methoden der Softwareentwicklung die Herangehensweise an das Design bzw. die Architektur eine grundlegend andere ist, als bei den klassischen Vorgehensweisen, wie dem Wasserfallmodell, bei denen auf eine lange Analyse- eine ebenfalls lange Designphase folgt. Aufgrund der zeitlichen Einschränkung und des geplanten Vorhabens, wurde auch bei dem Softwareprojekt \#peat direkt mit einem Prototyp begonnen, der die grundlegende Architektur enthielt. Dies war möglich, da die installierten Eclipse-Plugins bereits das nachfolgend etwas näher beschriebene Model View ModelView- Architekturmuster mitlieferten (AVD/-SDK-Manager, XML (Layout), Java- und Android-spezifische Bibliotheken (z.B. die Google Support Library *appcompat v7* (u.a. auch für *Backward Compatibility*)), SQLite, etc.). Es wurden zu Beginn nur wenige Komponenten spezifiziert, wie bspw. die splash-Seite (inkl. Musik), die MainActivity mit dem Quizz sowie grundlegende Einstellungen und die CI der App. D.h. der erste Spike repräsentierte bereits einen kleinen Ausschnitt aus dem Design der finalen App. Daraus konnte geschlossen werden, wo die Reise hingehen wird und welche Anforderungen initial nicht berücksichtigt wurden. In der Folge konnten Schwächen relativ früh aufgedeckt werden, unterstützt durch eine stetige Qualitätssicherung (Debuggen, manuelle Funktionstests, ExceptionHandler, s. [3.3. Konzept der Qualitätssicherung](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#33-konzept-der-qualit%C3%A4tssicherung)). Der jeweils nächste Meilenstein konnte den Designbereich stetig iterativ erweitern und optimieren.


In dieser Phase wurden nach und nach die Komponenten (i.e. XML-Sheets für das Layout der GUI und die Struktur der App (z.B. Android-Manifest) und Java-Klassen/-Methoden für die Logik) definiert und gestaltet. Daraus entwickelte sich die finale Struktur und Architektur. Hinzu kam die Persistenz / Datenbank.


**Architektur**

Bei dem initial geplanten, größer gedachten  System \#peat handelt es sich um eine Client-Server-Architektur, mit Thin Client (Webbrowser, ab Version **v2.0.1**) und einem Rich Client (Android App, **v1.0.1**). Im Rahmen dieses Projektes wurde ausschließlich die Android App mit lokaler Persistenz umgesetzt. Um die Systemarchitektur abzubilden, wurden zu Beginn (für das Exposé) sowohl ein Komponenten- als auch ein Deploymentdiagramm erstellt (Hinweis: die Diagramme entsprechen dem Stand zu Beginn des Projektes und wurden nicht aktualisiert):

* Deployment-Diagramm:

![deployment](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-deployment.png)

* Paket-Diagramm:

![package](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-package.png)

* Komponenten-Diagramm:

![component](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-component.png)

Daraus ergab sich eine typische Mehrschichtenarchitektur (N-Tier) mit User Interface (UI), Logiken und Persistenz/Datenbank.


Die Verwendung einer Android-Plattform als Basis der App-Entwicklung gab implizit die [Architektur](https://de.wikipedia.org/wiki/Model_View_ViewModel) vor ![MVVM-Konzept](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/MVVM-Konzept.png)

  Abbildung: Die Datenbindung (Data Binding) ermöglicht eine Trennung von der View (z.B. XAML oder HTML) und dem Modell für die Darstellung.


Das Model View ViewModel (MVVM) ist ein Entwurfsmuster. Es dient zur Trennung von Darstellung und Logik der Benutzerschnittstelle (UI). Gegenüber dem MVC-Muster kann die Testbarkeit verbessert und der Implementierungsaufwand reduziert werden, da keine separaten Controller-Instanzen erforderlich sind.


Die drei Komponenten sind:

* Model: Datenzugriffsschicht für die Inhalte, enthält die gesamte Datenbank- und Geschäftslogik

* View: durch grafische Benutzeroberfläche (GUI) angezeigte Elemente, austauschbar

* ViewModel: UI-Logik (Modell der View), Bindeglied, ruft Methoden oder Dienste auf



Dieses Muster erlaubte eine gewisse Trennung der Rollen im Projektteam. Es gab UI-Designer (A. Mosig, T. Ricklinkat) und Entwickler (T. Ricklinkat, S. Pawelleck). Die Designer (v.a. A. Mosig) konnten ihren Fokus auf die sogenannte Usability sowie User Experience setzen, was sich insbesondere in der Anlage und Layout-Gestaltung über XML umsetzte, und die Entwickler die UI- (v.a. T. Ricklinkat) sowie Datenbank-Logik (v.a. S. Pawellek) schreiben resp. in Java programmieren. Daraus formte sich in effizienter Arbeitsteilung die lauffähige Anwendung \#peat.

##3.3. Konzept der Qualitätssicherung

Da der Projektfokus auf dem Programmieren lag, geht es in diesem Punkt weniger um die Prozessqualität als vielmehr um die Qualität der Software an sich. Das Hauptinstrument zur Sicherstellung und Erhöhung der Softwarequalität sind Softwaretests, also automatische oder manuelle Verfahren zur Verifikation und Validierung von Software.


Für \#peat kamen in Anbetracht der Zeit insbesondere folgende Tests in Frage:


* Funktionale Tests bzw. Akzeptanztests: rückblickend waren manuelle Funktionstests die häufigsten Tests

  * Positiv-Tests: während der Entwicklung wurden ständig Positiv-Tests anhand der Anforderungen durchgeführt (Testen der Funktionalität auf Korrektheit)

  * Negativ-Tests:  spielten während des Projektes eine untergeordnete Rolle, sollten aber im weiteren Verlauf stärker in den Fokus rücken, um die Stabilität der Anwendung zu erhöhen (z. B. fehlerhafte Eingaben, wie nicht ausgefüllte Pflichtfelder, falsche Objekt-Definition etc.)

* Unit-Tests: spielten während des Projektes keine Rolle, sollten aber im weiteren Verlauf genutzt werden

* Installationstests: Für das Minimum API Level wurde die Android Version 16, Code Name “Jelly Bean (4.1.2)” gewählt, API Level 16. Grund hierfür ist die Unterstützung aller Android-Geräte ab diesem Level. Auch werden einige Funktionen verwendet (z.B. parentActivityName in der Manifest-Datei), welche erst ab der Version 16 unterstützt werden. Das höchste getestete API-Level ist 23. Level 24 ist erst seit dem 16.06.2016 für den Produktivbetrieb freigegeben. Auszug aus der AndroidManifest.xml:


> <uses-sdk

> android:minSdkVersion="16"

> android:targetSdkVersion="23" />


Zur Qualitätssicherung gehörte ebenfalls, den Quellcode nachvollziehbar zu kommentieren und zu erläutern. Dies ist hilfreich für künftige Wartungen und Erweiterung (z.B. für die Version **v2.0.1**). Die geforderten und daraufhin entwickelten Funktionen (s. [3.1. Requirements](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#31-requirements)) sind während der Erstellung und vor dem Projektabschluss auf ihre Funktionalität hin getestet worden (Funktionstest).


Im Allgemeinen sollte die Programmierung folgenden Mindeststandards genügen:


* Kommentare: Jede sinnhafte zusammenhängende Codeeinheit soll kommentiert werden. Dabei ist eine Verwendung von javadoc vorgesehen, um automatisiert eine Quellcode-Dokumentation zu erstellen.

* Logdatei: wichtige Schritte bzw. Teilschritte eines Algorithmus sollen geloggt werden. Beispiel Logeintrag:

> Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");

* Exception Handling: zur Erhöhung der Robustheit der Anwendung sollen alle kritischen Codestellen aufgefangen werden; frei nach Murphys Gesetz: Was schief gehen kann, muss aufgefangen werden.


Ein wichtiger Punkt beim Exception Handling ist das Auffangen von und das Umgehen mit nicht behandelten Ausnahmen im Code. In diesem Projekt wurde dies mit folgendem Methodenaufruf realisiert:


> Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));


Eingesetzt in jede Activity, lieferte dieser Aufruf mittels der CrashActivity den relevanten Auszug aus dem Log (-Cat) der Android-Entwicklungsumgebung sowie Informationen zum verwendeten Endgerät. Hieraus ließ sich unmittelbar auf die Stelle im Code verweisen, die es zu debuggen galt.


**Perspektivisch** sollte bei hinreichend hoher Anzahl der Testfälle eine Testsuite angelegt, also die Testfälle in ein eigenes Package ausgelagert werden. Für Android-Apps stehen darüberhinaus auch Testtools zur Verfügung wie z.B. Testdroid, einem Cloud-Service, für Installations- und JUnit-Tests. Für Last- und Performance-Tests gibt es ebenfalls Dienstleister, z.B. [NeoLoad](http://www.neotys.de/solutions/mobile-load-testing).

#4. Umsetzung

Wie bereits eingangs geschildert, war die Vorgabe des BA, das Projekt iterativ und agil anzugehen. Daher wurde im Anschluss an die kurze aber intensive Analysephase, welche u.a. das Erzeugen von Use Cases in easyBacklog sowie weiteren Modellen und Diagrammen zur Modellierung des Aufbaus und der Anforderungen an das zu entwickelnde System beinhaltete, direkt die Designphase inkl. Prototyping angesiedelt. Es wurden erste Funktionen (Splash-Seite inkl. Sound, Titel sowie zwei erste Quizz-Buttons (quiz, score) integriert, welche aber zunächst nur zur Orientierung dienten.


Das Prototyping enthielt regelmäßige Releases/Versionen (in GitHub auch Tagging genannt) mit entsprechender Beschreibung der enthaltenen Erweiterungen. Der stets aktuellste und lauffähige Stand wurde als apk-Datei in einen für den BA sowie alle Projektmitglieder frei zugänglichen Dropbox-Ordner geladen. Mittels der bereits erwähnten AVD- und SDK-Manager, welche u.a. einen Emulator bereitstellten, aber auch in Verwendung der geladenen apk-Datei, konnten unmittelbar und umfassende Tests des jeweiligen Entwicklungsstandes der Lernapp erfolgen.


Eine elementare Erweiterung - und ebenfalls Muss-Kriterium der App - sollte die Erstellung und Implementierung des Datenbank-Schemas in das Android-Projekt und die Eclipse-Umgebung bedeuten (relevante Klassen: PeatDataSource, PeatDbHelper und Question).


Darauf aufbauend erfolgten weiterhin regelmäßige Tests und Erweiterungen, um die anfangs an das Projekt gestellten Anforderungen sowie Muss- und Soll-Kriterien in Form der modellierten Use Cases zu erfüllen.


Schließlich konnte ein lauffähiger Abgabe-Prototyp final getestet und erzeugt sowie die Enddkumentation des Projektes \#peat abgeschlossen werden.

##4.1. Plattform

Mit der Entscheidung für Android als Plattform wird neben der Programmiersprache Java auch die Architektur der Anwendung implizit festgelegt. So gibt das Applikation-Framework des Android-Betriebssystems die generelle Architektur vor, [z.B.](http://www.pcwelt.de/ratgeber/Smartphone-Grundlagen-Technik-erklaert-Google-Android-Architektur-im-Detail-1005294.html):


* der Activity Manager verwaltet die Anwendungen und deren Lebenszyklus (Logik in Java)

* das View System ist für die grafische Oberfläche zuständig (Layout z.B. als XML)

* der Notification Manager für die Anzeige von Informationen in der Statusleiste


Die Programmierlogik und das Layout sind wie für eine Mehrschichtarchitektur typisch vollständig voneinander getrennt.


Als ein für mobile Geräte optimiertes Betriebsystem gibt Android mit SQLite ebenfalls das zu verwendende Datenbanksystem vor.


Die für Android bevorzugte Entwicklungsumgebung stellt Eclipse dar. Daher wurde sie mit der folgenden Konfiguration zur Entwicklung von \#peat verwendet:


* Android ADT extensions 4.0.0

* Android Development Tools for Eclipse

* SDK-Manager (Android Software Development Kit)

* AVD-Manager (Android Virtual Device-Manager, Emulator)

* LogCat, Lint, etc.

##4.2. GUI

Die Grafische Benutzeroberfläche hat die Aufgabe, Anwendungssoftware mittels Steuerelemente (Widgets), bedienbar zu machen. Sie ist sozusagen die Schnittstelle zwischen Mensch und Maschine und bedarf daher eine besonderen Betrachtung. Denn findet sich der Benutzer innerhalb der Anwendung nicht zurecht, oder wird von dieser nicht angesprochen (Usability, User Experience), ist die Erfüllung aller funktionalen Anforderungen wenig wert. Beispielhaft zeigen die folgenden Screenshots die Komponenten der GUI aus Sicht des Anwenders:


* Nach Klick auf das \#peat-Icon innerhalb des Menüs des mobilen Endgerätes öffnet sich zunächst der Startbildschirm (Splash), welcher mit einer Erkennungsmelodie hinterlegt wurde. Der Benutzer gelangt anschließend auf die Startseite der App, dem Menü (Landing). Der erste Menüpunkt führt den Benutzer unmittelbar zum Quizz (MainActivity).

![IconMenuQuizz](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/IconMenuQuizz.png)


* Aus der MainActivity heraus gelangt der Benutzer über den Button Menü zurück auf die Startseite. Hier kann er sich zu der Eingabe z.B. einer Ja/Nein-Frage navigieren (QuestionInputActivity) oder sich sein Thema auswählen, aus welchem die Fragen stammen sollen (UserThemeActivity, Ausarbeitung für Version **v2.0.1** vorgesehen).

![TypeInputTheme](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/TypeInputTheme.png)


* Innerhalb des Quizz sowie aus der Startseite der App heraus gelangt der Benutzer zu den Settings der App (EinstellungenActivity). In Version **v1.0.1** wurden die Menüpunkte der Einstellungen noch mit keiner Logik versehen. Ab Version **v2.0.1** sollen sich u.a. die Themen und Benutzer verwalten lassen. Befindet sich eine Komponente, wie z.B. die übrigen Fragentypen, noch in Entwicklung, erscheint standardmäßig ein Hinweis (UnderConstruction).

![SettingsUserConstruction](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/SettingsUserConstruction.png)

##4.3. Logik

Das bereits beschriebene Architektur-Muster der Android-Entwicklungsumgebung ([MVVM](https://de.wikipedia.org/wiki/Model_View_ViewModel)) ermöglicht es, dass zu jeder Komponente der App, in dem Fall zu jeder Activity, jeweils eine eigene Struktur mit eigenem Layout gebaut werden kann (XML). In der Android-Manifest-XML-Datei wird u.a. die Hierarchie der Komponenten definiert und somit bspw. festlegt, welche Activity die Startseite der App darstellt. Die objektorientierte Programmierung wiederum stellt den globalen Zugriff und die Wiederverwendung von Methoden und (Geschäfts-) Objekten sicher (Java). Sie verkörpert demnach die Geschäfts- oder Anwendungslogik des Systems und implementiert somit die eigentliche Problemstellung und technischen Belange an die App.

Nachstehend folgt ein Überblick über die wichtigsten Java-Klassen, aufbauend auf der Anforderungsphase sowie den Entwürfen der Designphase. Das Modell als Datenschicht wird durch die Klassen PeatDataSource, DBHelper und der dazugehörenden SQLite-Datenbank umgesetzt. Alle anderen Klassen sind der Modelview zuzuordnen und beinhalten die UI-Logik.


#####a) GUI und Logik

* Splash > Splash-Bild inkl. Sound (bei Öffnen der App)

* LandingActivity > Menü (Startseite von \#peat)

* MainActivity > Quizz


* QuestionTypeActivity > Gibt Wahlmöglichkeit der Frage-Typen vor

* QuestionInputActivity > Speichert Frage-Objekt in die Datenbank

* UserThemeActivity > Wahl des Themas, aus welchen die Fragen stammen sollen


* ExceptionHandler > ExceptionHandler Logik (Abfangen unbehandelter Ausnahmen)

* CrashActivity > ExceptionHandler (Ausgabe der Log-Daten)

* UnderConstructionActivity > “Klasse in Arbeit” (Bsp. Fragentyp “Offene Fragen”)


#####b) Persistenz

* PeatDataSource > Data Access Object und für Verwalten der Daten verantwortlich

* PeatDbHelper > Hilfsklasse mit deren Hilfe die SQLite-Datenbank erstellt wird

* Question > Konstruktor-Klasse für das Frage-/Antwort-Objekt

##4.4. Persistenz

Zu Beginn, d.h. für den ersten lauffähigen Prototyp in der Designphase, lag der Fokus darauf, die ersten Komponenten abzustecken und eine Idee zu entwickeln, wie die Version **v1.0.1** zum Abgabetermin im Juli aussehen könnte. Demnach wurden die ersten Fragen in ein starres Array (als Mockup) geschrieben, welches wiederum mittels eines if-Statements ausgelesen wurde. Nachstehende Abbildungen zeigen beispielhaft erläutertes Szenario:


![setNextQuestion-Array](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/setNextQuestionArray.png)


![setNextQuestion-ifStatement](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/setNextQuestionifStatement.png)


Persistenz bedeutet in der Informatik die Fähigkeit, Datenstrukturen in nicht-flüchtigen Speichermedien, wie Dateisystemen oder Datenbanken zu speichern. Für das Erstellen des hierfür notwendigen relationalen Datenbank-Schemas (ERM) wurde die Anwendung DBDesigner-Fork verwendet. Dieses Schema bildete die Grundlage für die \#peat-Datenbank und deren Java-Klassen (PeatDataSource, PeatDBHelper, Question):

![DBDesign] (https://github.com/andreasmosig/peat/blob/master/doc/DB/DBDesign.png)


Hierbei machte es sich das Projektteam zu Nutze, dass z.B. keine JDBC-Verbindung benötigt wurde, sondern es bereits Bibliotheken zum Ansteuern der SQLite-Datenbank in der Android-/Eclipse-Entwicklungsumgebung gab.


Zunächst wurde eine leere Datenbank angelegt. Anschließend wurde ein entsprechendes SQL-Skript zur Erstellung der Tabellen geschrieben. Daran anknüpfend wurden entsprechende Methoden zum Ein- und Auslesen der Daten (Fragen, Antworten) codiert.


Die Datenbank (DB) wurde bereits vorausschauend für das nächste Release entwurfen. Dies ermöglicht während der Entwicklung einen Blick auf das große Ganze zu werfen und den Überblick nicht zu verlieren. Es ist trotz allem nicht ausgeschlossen, dass es zukünftig weitere Tabellen geben wird.


Aktuell gibt es in der DB 5 Haupttabellen. Die Tabelle QuestionType ist eine dieser Haupttabellen. Sie beschreibt die einzelnen Fragetypen. Wir haben uns aufgrund des Normalisierungsgedanken dazu entschlossen, den Fragetyp in eine eigene Tabelle auszulagern. Dies erleichtert die zukünftige Wartung. Die Tabelle Questions enthält alle Fragen und ist mit der Tabelle QuestionType verknüpft.


Da eine Frage auch mehrere Antworten haben kann, wurde auch für die Antworten eine eigene Tabelle angelegt. In der Tabelle können mittels Flag sowohl richtige als auch falsche Antworten gespeichert werden. Diese Funktion ist für das Speichern von Multiple Choice Fragen unerlässlich. Der Ansatz der Speicherung aller Antworten in einer Tabelle ermöglicht die Abbildung aller Fragetypen.


* Offene Fragen: ein Eintrag in Tabelle Answers (isCorrect true)

* Ja/Nein Fragen: zwei Einträge in Tabelle Answers (davon einer mit isCorrect true und einer mit isCorrect false)

* Choice Fragen: n Einträge in Tabelle Answers (davon einer mit isCorrect true und n-1 mit isCorrect false)

* Multiple Choice Fragen: n Einträge in Tabelle Answers (davon m mit isCorrect true und i mit isCorrect false; Es gilt m>0 und m+i=n)


Die Fragen können Themen zugeordnet werden. Dabei werden die Themen in der Tabelle Themes gespeichert. Verknüpft werden die Tabellen Questions und Themes über eine eigene Verknüpfungstabelle (Themes_has_Questions). Dies ist notwendig, weil ein Thema verschiedene Fragen beinhalten kann und eine Frage im Umkehrschluss auch mehrere Themen thematisch berühren kann. Es handelt sich somit um eine n:m-Beziehung.


Eine weitere Haupttabelle in der DB ist die Tabelle PeatUser. Für zukünftige Versionen ist es vorgesehen, dass sich mehrere User an der App anmelden können. Daher gibt es eine eigene Tabelle zum Verwalten der Nutzer. Die Nutzer sollen weiterhin die Möglichkeit bekommen, Themen zu abonnieren, die sie besonders interessieren. Dafür ist wiederum eine Verknüpfungstabelle (PeatUser_has_Themes) notwendig, weil ein Nutzer verschiedene Themen abonnieren kann und ein Thema von verschiedenen Nutzern abonniert werden kann.


Die Anzeige und Beantwortung der Fragen werden über die Tabellen PeatUser_has_Questions und HistorieReplies verwaltet. Dabei verwaltet die Tabelle PeatUser_has_Questions in der aktuellen Version den aktuellen Quizz-Lauf. Die Tabelle HistorieReplies wird aktuell nicht verwendet. Zukünftig ist es angedacht, alle abgegeben Antworten zu speichern, um so Statistiken und Reports zu generieren. Dies soll über die Tabelle HistorieReplies passieren. Dafür wird gerade evaluiert, ob es sinnvoll ist, die Tabelle HistorieReplies direkt über die Tabellen Questions und PeatUser zu verknüpfen, da aktuell die Tabelle PeatUser_has_Questions am Ende des Quizz-Laufs gelöscht wird.


Während des Quizz-Laufs wird aktuell für jede angezeigte Frage ein Eintrag in der Tabelle PeatUser_has_Questions erzeugt. Dieser Eintrag enthält auch einen Zeitstempel, wann die Frage erstmalig im Lauf angezeigt wurde. Dadurch wird eine Navigation durch die Fragen mit vor und zurück möglich.


Die zwei relevantesten Methoden hinsichtlich der Datenspeicherung und -bereitstellung sind:


* putQuestioninDB (Speichern der manuell über die GUI (QuestionInputActivity) eingegebenen Fragen): 

> void PeatDataSource.putQuestionInDB(Question oQuestion)


* getNextQuestion (Auslesen des Frageobjektes aus der DB heraus):

> Question PeatDataSource.getNextQuestion()


* getNextQuestion (Auslesen des Frageobjektes aus der DB heraus):

> Question PeatDataSource.getNextQuestion(Boolean backButtonPush)


Die Methode getNextQuestion wurde doppelt implementiert. Dies ermöglicht den Aufruf mit und ohne Übergabeparameter. Wenn kein Parameter übergeben wird, so wird automatisch ein Default übernommen. Es wird backButtonPush= false gesetzt und damit einfach die nächste Frage ausgegeben. Wird allerdings ein true beim Aufruf übergeben, so werden die zuletzt angezeigten Fragen angezeigt. Dies ermöglicht eine Navigation in der GUI. Außerdem wird der Code sowohl für die nächste als auch die letzte Frage verwendet. Dies steigert die Wiederverwendung und verringert den Anpassungsaufwand.

##4.5. Versionierung

Das Versions- und Release-Management sind zentraler Bestandteil des Projektmanagements. Dabei geht es darum, dass das gesamte Projekt in seinem Wachstum begleitet wird. Korrekte Auslieferungen und Codezustände müssen jederzeit sichergestellt und Entwicklungslinien stets nachvollzogen werden können.


Für das vorliegende Projekt wurde zur verteilten Versionskontrolle Git verwendet. Git ist eine freie Software zur Unterstützung der verteilten Versionsverwaltung von Quellcode. Da es sich hierbei um eine verteilte Versionskontrolle handelt, besaß jedes Projektmitglied sein eigenes lokales Repository, in das er Änderungen einpflegen konnte. Die einzelnen individuellen Repositories konnten über bestimmte Operationen (z.B. push, pull) Informationen austauschen. Die lokalen Repositories ermöglichten daher weitgehend unabhängiges Arbeiten.


Die Versionskontrolle sollte im Optimalfall Teil eines Gesamtzyklus (Continious Integration) sein, bestehend aus einem Software-System zur Versionsverwaltung (z.B. Git), einem automatisierten Buildprozess (z.B. mit Ant), Tests zur Sicherstellung der Codequalität (z.B. mit JUnit) und der Fehlerbeseitiung/-verwaltung (z.B. mit Bugzilla). Aufgrund des relativ überschaubaren Projektes, wurde während dieses Projektes auf automatisierte Buildprozesse, Testsuiten o.ä. verzichtet.


Das Projekt hatte nichtsdestotrotz dank der iterativen und agilen Vorgehensweise und der das gesamte Projekt umfassenden Verwendung von GitHub zur Verwaltung aller Projektinhalte (Quellcode, Releases, Exposé, Protokolle, Dokumentation sowie aller sonstigen Einstellungen, Dateien und Zustände, die für das Funktionieren des Systems und die Projektorganisation relevant sind) zeitnah und jederzeit einen lauffähigen Code resp. Prototyp (Durchstich) zur Folge. Zusammengefasst nennt man die Summe der beschriebenen Systeme (Verions-, Release- und Konfigurationsmanagement) **Change Management**.


In GitHub konnten ständig Snapshots auf Versionsstände ([Releases](https://github.com/andreasmosig/peat/releases)) vorgenommen werden. Dies geschah mittels des sogenannten [Tagging](https://git-scm.com/book/en/v2/Git-Basics-Tagging) über die Git-Shell. Hierüber wurden auch Konflikte beim Zusammenführen vom Code der einzelnen lokalen Repositories transparent gemacht und gelöst. Fehlerfreier Sourcecode wurde freigegeben und in das zentrale [Repository](https://github.com/andreasmosig/peat) übertragen. Zu Dokumentationszwecken konnte anhand der *commits* stets nachvollzogen werden, wer welche Änderung vorgenommen hat und welche *features* integriert worden sind. Zum Download lag jederzeit die letzte auf ihre Lauffähigkeit hin getestete Version von \#peat in einer Dropbox bereit: [Hol’ dir \#peat](https://www.dropbox.com/sh/8djn2di76w9jqga/AABS1uvujSAhcy7iVWHPvo9oa?dl=0)!

#5. Schlussbetrachtung

##5.1. Zusammenfassung

Was zu Beginn nur ein Spiel gewesen ist, könnte nun das Lernen vieler Schüler und Studenten, Auszubildenden und anderen Lerninteressierten erleichtern und vielleicht sogar Geschäftsleuten Freude bereiten.


Der erste Prototyp von \#peat ist zu einer lauffähigen Android-App entwickelt worden. Der Fokus lag auf wenigen, aber relevanten Komponenten, deren Umsetzung bereits jetzt vielversprechend ist und den praktischen Einsatz der mobilen Applikation zulässt.


\#peat ermöglicht das Abspeichern eigener Fragen und Antworten und deren Wiedergabe innerhalb des Quizz sowie ab Version **v2.0.1** eine Themen- und Benutzerverwaltung.

Mit etwas Glück und dem richtigen Marketing wird \#peat nicht nur die Nummer 1 auf dem Markt der Lernapps sein. Auch die sich in Planung befindliche Website wird zur neuen Startseite unseres breiten *peers*.

##5.2. Erkenntnisse

Im Zuge der Projektarbeit stellte sich heraus, nachdem anfänglich noch easyBacklog für die Anlage der Use Cases resp. asana für die Projektorganisation verwendet worden waren, dass die Arbeit mit Slack und moodle (Projektkommunikation und -organisation) und GitHub (Versionierung, Dokumentation) sowie das iterative Entwickeln und Testen in der Eclipse/Android-Umgebung völlig ausreichend, zufriedenstellend und insbesondere iterativ und agil waren. Es ließ sich viel effizienter arbeiten, da nebenher nicht viel dokumentiert und modelliert wurde. Im Nachhinein konnte festgestellt werden, dass die Teilprojekte und *subtasks* gleichermaßen erfüllt werden konnten, allein mit den zuletzt genannten Werkzeugen: Slack, moodle und GitHub.


Eine weitere Erkenntnis ergab sich aus dem Arbeiten mit GitHub. Eine theoretische Grundlage besaß jedes Mitglied des Teams. Allerdings wurde noch nie praktisch mit der Versionsverwaltung gearbeitet. Daraus resultierten beim Zusammenführen besagter Codefragmente diverse Konflikte, die es über die Git-Shell zu lösen galt.


Doch es muss rückblickend durchaus auch kritisch beurteilt werden, was hinsichtlich der initialen Anforderungsanalyse und insbesondere die Einigung darauf, was tatsächlich umgesetzt werden sollte, gewissermaßen schief lief. Die Vorstellung darüber, was das System können sollte, war allen Teammitgliedern bewusst. Was das System allerdings tatsächlich können wird, offenbarte diverse Disparitäten. Denn die Erwartungen an die App waren recht groß, schlussendlich wohl übermotiviert und unrealistisch. Eine konkrete Aussage und Entscheidung, welche den Anforderungen für die Abgabe an den BA genügen, wurden erst spät getroffen. Dies zeigte auch, dass es keine konkrete Führungsperson innerhalb der Projektgruppe gab. Je näher die Abgabe rückte, desto klarer wurde aber, dass es Entscheidungen bedurfte.


Im Zusammenhang mit der Uneinigkeit und Unsicherheit in Bezug auf die Anforderungen und deren Umsetzungsmöglichkeit war die agile, explorative und evolutionäre Vorgehensweise rückblickend sehr hilfreich.


Es ist ebenfalls hervorzuheben, dass die Grundlagen und Programmier-Kenntnisse innerhalb des Teams sehr unterschiedlich waren und sind. Die Rollenverteilung (UI-Designer und Entwickler) wurde dahingehend noch eindeutiger definiert. Man konnte allerdings feststellen, dass die Gruppe aus unterschiedlichen Charakteren bestand. Ganz im Sinne der [Teamrollen](https://de.wikipedia.org/wiki/Teamrolle) nach Belbin gab es in dem Team \#peat die unterschiedlichsten Vertreter (Umsetzer, Macher, Koordinator, Spezialist). Die richtige Kombination von verschiedenen Teamrollen machte dieses Team - bis auf die angesprochene Entscheidungsfindung für das lauffähige Arbeitsergebnis - effizient.

##5.3. Ausblick

Aus den vorangegangen Ausführungen ist zu entnehmen, dass diese Lernapp noch viel Erweiterungspotential birgt. In der zur Verfügung stehenden Zeit hat man sich aber auf die relevanten Bereiche, Komponenten und Activities fokussiert.


Mögliche Erweiterungen der Nachfolgeversionen, beginnend bei **v2.0.1**, sind nachstehend stichpunktartig umrissen:


#####a) Funktionale Anforderungen an die App:

* Angebot: Die GUI wurde vorbereitet auf das geplante Angebot mehrerer Fragekategorien, welches in **v2.0.1** realisiert werden SOLL (s. [2.1. Theoretische Aspekte einer Lernsoftware](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#21-theoretische-aspekte-einer-lernsoftware)).

* Quizz:

  * Funktion für Pause-Button (Frage für später speichern) entwickeln.

  * Suchbegriff übergeben bei Klick auf Wiki- und Google-Button.

  * “Ladebalken in %”: zeigt an, wie viele Fragen bereits beantwortet, wie viel kommen noch?

* Größe des Endgerätes: GUI (XML) SOLL auf ScrollableLayout oder FrameView umgestellt werden, um den verschiedenen Größen mobiler Endgeräte gerecht zu werden.

* Settings: Eine Erweiterung der Funktionalitäten der Einstellungen-Activity SOLL erfolgen (intelligenter, selbstlernender Wiederholungsalgorithmus (s. [2.1. Theoretische Aspekte einer Lernsoftware](https://github.com/andreasmosig/peat/blob/master/doc/DOKUMENTATION.md#21-theoretische-aspekte-einer-lernsoftware)), Abbruch-/Fehlermeldung, Update-Steuerung, Benutzer- sowie Themenverwaltung u.v.m.).

* Persistenz: Es SOLL eine Synchronisation der lokalen Datenbank (hier: SQLite) mit einem “[Backend-as-a-Service](http://t3n.de/news/backend-as-a-service-parse-504596/)”-Anbieter wie Parse realisiert werden (alternativ mit einer Remote-Datenbank auf einem Server).

* Push-Notification: WIRD mit Hilfe des Android NotificationManager möglich gemacht. Alternativ gibt es externe Anbieter, wie z.B. Parse:

  *[Parse-Tutorial](https://parse.com/tutorials/android-push-notifications)

  * [Parse-QuickStart](https://parse.com/apps/quickstart#parse_data/mobile/android/native/new)

* Qualität: Bewertung von Fragen (Güte, Schwierigkeitsgrad) sowie eine gewisse Selbstreinigung ist hins. des Designs und der Anforderung definiert und umgesetzt. Die Logik geht allerdings mit einer Themen- und Nutzerverwaltung einher. Deren vollständige Ausarbeitung WIRD für die Version **v2.0.1** vorgesehen.

* Externer Webservice: KANN z.B. sein 

  * https://de.wikipedia.org/wiki/Wikipedia:Technik/Datenbank/API

  * https://www.mediawiki.org/wiki/API:Main_page/de


#####b) Funktionale Anforderungen an die Website:

* Webpage-Prototyp: SOLL u.a. dem Download der App sowie dem Speichern, Import und Export von Fragen/Antworten dienen:

![PeatLanding] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/1_peatlanding.png)

![PeatSave] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/2_füllepeat.png)

![PeatFeedback] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/3_feedbackpeat.png)

* Shop: Abonnement von Fragethemen

* Benutzerverwaltung: eigene Daten, Import, Export, uvm.

* Webserver: SOLLTE z.B. sein: SAAS oder eigene Webserver

* Entwicklung mit Webframework z.B. Bootstrap, ein auf CSS/LESS und JavaScript basierendes UI-Framework; für diverse Funktionaltitäten, wie Bentnutzerkontensteuerung und Authentifizierung sind gegebenfalls andere Frameworks und zusätzlich ein Content Management System notwendig (z.B. Ruby on Rails, Silverstripe)


#####c) Nicht-Funktionale Anforderungen an die App und an die Website (beispielhaft):

* Look and feel: Die App und die Website SOLLEN für Jugendliche ab 13 Jahren verständlich und bedienbar sein.

* Compliance: Die Verwendung der App und der Website SOLL an die Akzeptanz eines Verhaltenskodex geknüpft sein.

* Performance: Die Anwendung SOLL in der Lage sein, im ersten Jahr bis 500.000 User zu verwalten und in den darauf folgenden 3 Jahren bis zu 5 Millionen.

* Community: Aus der Themen- und Nutzerverwaltung sowie der Bewertung von Fragen KANN, unterstützt durch eine webbasierte Lösung, der Gedanke von Contributors und Followern verfolgt werden.

#6. Anhang & weiterführende Links

* [Protokolle](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md)

* [Statusberichte](https://github.com/andreasmosig/peat/blob/master/doc/STATUSBERICHTE.md)

* [Tasks](https://github.com/andreasmosig/peat/blob/master/doc/TASKS.md)

* [Abschlusspräsentation](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/peat.pptx)

* [GitHub](https://github.com/andreasmosig/peat)

* [Projektmanagement (asana)](https://app.asana.com/0/105766113985042/list)

* [Slack-Kanal](https://beuthswtprojekt.slack.com/?redir=%2Fmessages%2Fpeat%2F)

#7. Glossar

BA    Business Angel

bspw.    beispielsweise

bzgl.    Bezüglich

bzw.    beziehungsweise

CI    Corporate Identity

d.h.     das heißt

ggf.    gegebenenfalls

GUI    graphical user interface

hins.    hinsichtlich

i.e.    id est

MVC    Model-View-Controller

peer    Interessengruppe

RE    Requirements Engineering

resp.    respektive

SEO    Search Engine Optimization

u.a.    unter anderem

USP    Unique Selling Proposition
