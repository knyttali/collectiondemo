package se.collectiondemo;

import java.util.Arrays;
import java.util.ArrayList;

public class Lab4e {
    public void Run(){
        ArrayList<String> liteText = new ArrayList<>(Arrays.asList("abc", "xyz", "aba", "1221", "er", "ee"));

        for (String textSnutt : liteText) {
            char firstChar = textSnutt.charAt(0);
            String firstChar1=Character.toString(firstChar);
            if(textSnutt.length() >= 2 && textSnutt.endsWith(firstChar1)){
               System.out.println(textSnutt);
            }
        }
    

  }
}
/**Skapa en ArrayList med några stängar tex

"abc", "xyz", "aba", "1221"



Loopa igenom och räkna hur många som

- är minst två tecken OCH det första och det sista tecknet är detsamma  (aba) */