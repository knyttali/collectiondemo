package se.collectiondemo;

import java.util.Arrays;
import java.util.ArrayList;

public class Lab3e {
    public void Run(){
        ArrayList<Integer> tal1 = new ArrayList<>(Arrays.asList(12, 55, 32, 9, 34));
        int summa = 0;
        for (Integer integer : tal1) {
            summa = summa + integer;
        }
        System.out.println(summa);
    }
}
/**Skapa en ArrayList  kod med 5 stycken INTS. 12 ,55, 32, 9, 34.   

Det ska vara en oneliner!

Loopa igenom listan och räkna fram SUMMAN av alla tal */