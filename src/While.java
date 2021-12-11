import java.util.ArrayList;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {

//        int a = 0;

        // de for en de while loop doen hier precies hetzelfde
//        for(int i = 0; i < 10; i++) {
//            System.out.println("i is less than 10: " +  i);
//        }
//
//        while(a < 10) {
//            System.out.println("a is less than 10: " + a);
//            a++;

//        // de code runt maar 1x want hij ziet dat het niet gelijk is aan 0
//        // haal == 1 weg en je hebt een infinty loop
//        do {
//            System.out.println(a == 1);
//        } while(true);
//    }


        // met deze while loop kun je de woorden afzonderlijk uit de zin opslaan door de scanner woorden te laten toevoegen aan de ArrayList
        String sentence = "flapjacks are awesome!";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<String>();

        while(scan.hasNext()) {
            words.add(scan.next());
        }
        System.out.println(words);
    }
}
