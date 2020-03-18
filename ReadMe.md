# Jetbrains Academy

in diesem Projekt werden ich mit dem Kurs: Jetbrains Academy, kenntnisse über Java sammeln. 

## 1. Installieren 
um mein java projekt von gitLab in intelliJ ausführen zu können muss ich das git-Repository klonen: 

   1. In IntelliJ -> File (links oben )-> New -> Project from Version Control... -> Git 
   
   2. Link des Repositories -> auf GitLab -> unter Project -> unter Details -> Clone-Button -> Clone with HTTPS
   
   3. neues Fenster -> unter URL: link meines Git Repositorys einfügen -> Unter Directory: Projektname/ Ordnername eingeben -> auf Clone klicken -> GitLab Benutzerdaten eingeben
   
   4. Mit **Maven** das projekt installieren -> auf das Suchzeichen klicken (direkt unter dem Schließen-Button, oben rechts in intelliJ) -> *maven* eingeben -> auf *Reimport all Projekts* klicken 
   5. Neues Fenster von **Maven** (rechts) -> unter **java_lern_projekt** -> unter **Lifecycle** -> die Prozesse *clean*, *test*, *install*, *compile* ausführen
   
        * **Wie?:** ->Prozess auswählen und auf grünen Pfeil, oben in der Leiste, klicken 
    
   6. Links in der Projekt-Leiste -> unter src -> unter main -> unter java -> unter jetbrains_academy -> unter lektion1 -> auf Stage1From6 klicken 
   
   7. unter der java-klasse: neben der Main-Funktion -> mit Links-klick auf den grünen Pfeil gehen -> auf Run klicken 
        
     
        
   <br>
   <br>        
                  
## 2. Theorie: 

### 2.1 Ausgeben von Daten (mit print)

<br>

   * um in Java daten auf dem Bildschirm auszugeben nutzt man println() und print().
   * der Standard Output (Standartausgang) ist ein Empfänger an das ein Programm Informationen senden kann. 
        * hierfür stellt java ein spezielles Objekt namens System.out zur Verfügung um mit dem Standard Output zu arbeiten.
        * Es wird oft benutzt wenn man Text ausgeben will.
       
       
   <br>
  
        
   > Das println-Verfahren zeigt die übergebende zeichenkette gefolgt von einem Zeilenumbruch auf dem Bildschirm wie folgt aus:
   
   <br>
   
   #### Im java-Quellcode:
    
    
```java    

    System.out.println("Ich");
    System.out.println("bin");
    System.out.println("Lennart");
    System.out.println("Röpnack");
          
```     

   <br>

   #### Als Ausgabe:
   
    Ich
    bin
    Lennart
    Röpnack
    
    
   <br>
   <br>
    
   
   * Die print() Methode zeigt den übergebenen Wert an und platziert den Cursor danach. 
        * Cursor: die Stelle, an der wir einen Wert anzeigen 
   
     <br>
   
   
   > Hierbei soll mit dem print-Verfahren alle Zeichenketten in einer einzigen Zeile ausgeben:  

   <br>
   
  
   
   #### Im java-Quellcode:
   
  ```java    
  
      System.out.print("Ich ");
      System.out.print("bin ");
      System.out.print("Lennart ");
      System.out.print("Röpnack.");
            
  ```               

   <br>

   #### Als Ausgabe:
   
     Ich bin Lennart Röpnack.
 
 
   <br>
   <hr>
   <br>
   
 ### 2.2 Ausgeben von Daten  (mit Logging)
 
* Logger sind dafür da Ausgaben zu formatieren und zu konfigurieren
* In meinem Fall habe ich die Logging-funktion mit einer xml-Datei (log4j2.xml) integriert

 
 <br>
 <br>
 
 #### Anforderungen an Logging
 
 * Der Benutzer muss in der Lage sein die Protokolle leicht abrufen zu können
 * Das Format muss einheitlich sein, damit der Benutzer das Protokoll leicht lesen kann 
 * Protokollierte Daten müssen Tatsächlich aufgezeichnet werden und Sensible Daten dürfen nur sicher protokolliert werden. 
 * Logging erfüllt diese Anforderungen im Gegensatz zu System.out.println.
 
  <br>
  <br>
 
 #### Eingebaute Funktionen von Logging (Attribute)
 
 * **All:** Alle Meldungen werden ungefiltert ausgegeben
 * **TRACE:** Ausführlicheres Debuggen
 * **DEBUG:** Allgemeines Debugging(Auffinden von Fehlern, Analyse von Sachverhalten)
 * **INFO:** Allgemeine Informationen(wie z.b Programm Gestartet, Verbindung zu Host .. wird 
 	Aufgebaut)
 * **WARN:** Auftreten einer unerwarteten Situation
 * **ERROR:** Fehler(Ausnahme wurde abgefangen, Bearbeitung wurde alternativ fortgesetzt)
 * **FATAL:** Kritischer Fehler, „Programmabbruch“
 * **OFF:** Logging ist deaktiviert

     <br>
     <br>
     

#### Im Java-Quellcode:

* Hierbei muss der logger erstmal initialisiert werden:

        private static Logger logging = LogManager.getLogger(Stage1From6.class);
        
 * Wobei "logging" für den Logger-Name steht
 * Zur Ausführung schreibt man **Logger-Name**.**Attribute**.("Zeichenkette");

    <br>


```java     
    public class Stage1From6
    {
        private static Logger logging = LogManager.getLogger(Stage1From6.class);
    
        public static void main(String[] args)
        {
    
            logging.info("Ich");
            logging.info("bin");
            logging.info("Lennart Röpnack");
        }
    }

````

   <br>

   #### Als Ausgabe:
   
    11:21:37.809 [main] INFO  jetbrains_academy.lektion1.Stage1From6 - Ich
    11:21:37.817 [main] INFO  jetbrains_academy.lektion1.Stage1From6 - bin
    11:21:37.818 [main] INFO  jetbrains_academy.lektion1.Stage1From6 - Lennart Röpnack  
 


  <br>
  <br>
   
 
 ## 4.Programmablauf
 
 #### von Stage1From6
   <br>
   * in diesem Programm sollte ich Sätze (als Zeichenketten) die eine Kaffeemaschine anzeigen würde, in einem java projekt ausgeben. 
    
   <br>
   
   #### Im java-Quellcode:
```java 
jetbrains_academy.lektion1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Stage1From6
{
    private static Logger logging = LogManager.getLogger(Stage1From6.class);

    public static void main(String[] args)
    {

        logging.info("Starting to make a coffee");
        logging.info("Grinding coffee beans");
        logging.info("Boiling water");
        logging.info("Mixing boiled water with crushed coffee beans");
        logging.info("Pouring coffee into the cup");
        logging.info("Pouring some milk into the cup");
        logging.info("Coffee is ready!");
    }
}````
