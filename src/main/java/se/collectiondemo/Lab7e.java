package se.collectiondemo;
import java.util.ArrayList;

public class Lab7e {
    public void Run() {
        int highest = 0;
        ArrayList<String> players = new ArrayList<>();
        String mening = "amanda"; // KOLLA IGÅRS NUMMER 6 och 2
        char[] bokstaver = mening.toCharArray();
        char ch = ' ';
        int i = 0;

        for (char bokstav : bokstaver) {
            i = 0; // varje gång ny bokstav börjar från noll
            for (char c : bokstaver) {
                if (c == bokstav) {
                    ++i;

                    if (i > highest) {
                        highest = i;
                        ch = bokstav;
                    }
                }
            }
        }
        System.out.println("den bokstav som används mest är " + ch + " som används " + i + " ggr");
    }
}
/**
 * Låt användaren mata in en sträng. Nu ska du med loopar ta fram vilket TECKEN
 * som återkommer flest gånger
 * 
 * >STEFAN HOLMBERG
 * 
 * e förekommer 2 gånger
 * 
 * 
 */