public class StringToInt {

    public static void main(String[] args) {

        // hier wordt het getal 4 achter 102 toegevoegd
//        String s = "102";
//        System.out.println(s + 4);

        // Nu wordt het wel opgeteld
        String s = "102";
        System.out.println(Integer.parseInt(s) + 4);

        // of het kan op deze manier:
        int n = Integer.parseInt("3");
        System.out.println(n + 4);

        // en hiermee voeg je ze weer samen tot een String
        int j = 8;
        System.out.println(Integer.toString(j) +1);

        // Hiermee haal je het woord age weg:
        String k = "age: 47";
        k = k.replaceAll("\\D+","");

        // hiermee kun je weer optellen
        int a = Integer.parseInt(k);

        System.out.println(k + 2);



    }
}
