package se.collectiondemo;

import java.util.ArrayList;

//HEJSAN AMANDA

public class CollectionDemo {
    public void Run() {
        ArrayList<String> players = new ArrayList<>();
        //var players = new ArrayList<String>();
        while (true) {
            System.out.println("1. skapa ny spelare");
            System.out.println("2. lista alla");
            System.out.println("3. ta bort");
            System.out.println("4. exit");
            
            int sel = Integer.parseInt(System.console().readLine());
            if (sel == 1) {
                System.out.print("skriv in namn ");
                String namn = System.console().readLine();
                if (players.contains(namn)==false){//om namnet inte redan finns i listan
                    players.add(namn);//lägg till namn
                }
            }
            if(sel==2){
                for(String p : players){
                    System.out.println(p);
                }
            } 
            if (sel == 3) {
                System.out.print("skriv in namn påd en du vill ta bort: ");
                String namn = System.console().readLine();
                players.remove(namn);
            }
            if(sel == 4){
                break;
            }
           
        }

        String [] weekDays = {"m", "tis", "o", "tors", "f", "l", "s"};

        /*
         * int [] talen = {1,2,3,4}; 
         * int largest = talen[0]; 
         * for (int tal : talen) {
         *  if (tal>largest){ 
         * largest = tal; }
         *  } System.out.println("största talet: " +
         * largest);
         */
        // String[] minabarn2 = {"amanda", "anna", "emeli"};

        /*
         * String [] minaBarn = new String[3]; minaBarn[0] = "fanny"; minaBarn[1] =
         * "oliver"; minaBarn[2] = "tiffany";
         * 
         * for (String oneChild : minaBarn) { System.out.println(oneChild); }
         */
        /*
         * for (int index = 0; index < minaBarn.length ; index++){
         * System.out.println(minaBarn[index]); }
         */
    }
}
