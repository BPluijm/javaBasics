public class For {

    public static void main(String[] args) {

        // voor code te herhalen
        // vooraf bepalen: wat wil je herhalen en hoe vaak wil je het herhalen
        // 27 is het aantal dat het herhaalt wordt
        // i is een variabele en kan ook een andere naam hebben

        for (int i = 0; i < 27; i++) {
            System.out.println("I love dogs!");
        }

        // de code wordt 16x uitgevoerd
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        int[] grades = {98, 100, 83, 90, 93};
        // length geeft de lengte van de array weer
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

    }
}
