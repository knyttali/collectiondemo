package se.collectiondemo;

public class Lab1e {
    public void Run() {
        int[] intArray = { 12, 55, 32, 9, 34 };
        int largest = intArray[0];
        for (int i : intArray) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("största talet: " + largest);
        int smallest = intArray[0];
        for (int j : intArray) {
            if (j < smallest){
                smallest = j;
            }
        }
        System.out.println("minsta talet: " + smallest);
    }
}
/**
 * Skapa en ARRAY i kod med INTS 12 ,55, 32, 9, 34.
 * 
 * Ta fram vilket som är det STÖRSTA och MINSTA talet i arrayen
 */