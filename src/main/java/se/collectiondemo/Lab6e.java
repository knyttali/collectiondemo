package se.collectiondemo;

import java.util.ArrayList;

public class Lab6e {
    public void Run() {
        ArrayList<String> players = new ArrayList<>();
        String längstNamn = "";

        while (true) {
            System.out.println("namn ny spelare");
            String namn = System.console().readLine();

            if (players.contains(namn) == false) {// om namnet inte redan finns i listan
                players.add(namn);// lägg till namn
            }

            if (namn.equalsIgnoreCase("exit")) {
                if (players.size() >= 5) {
                    for (String s : players) {
                        if (s.length() > längstNamn.length()) {
                            längstNamn = s;
                        }
                    }
                    break;
                } else {
                    System.out.println("nejnej fortsätt mata in några till");
                }
            }
        }
        System.out.println("det längsta namnet är "+ längstNamn + " med antal tecken " + längstNamn.length());
    }
}
/**
 * Skriv ett program där man matar in strängar (namn på hockeyspelare) .
 * 
 * Lägg hela tiden namnn i en Lista
 * 
 * Skriver man in EXIT och antalet är större eller lika med 5 så avsluta loopen
 * 
 * Skriver man in EXIT och antalet är mindre med 5 så säg "Nej nej fortsätt mata
 * in några till!!"
 * 
 * 
 * 
 * När loopen avslutats. Räkna ut vilken spelare som har det LÄNGSTA namnet.
 * Skriv ut det namnet och dessutom hur många tecken namnet består av
 * 
 */