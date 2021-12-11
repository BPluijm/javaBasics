public class ConditionalOperator {

    public static void main(String[] args) {

        // variabele aan de linkerkant (int a)
        // if else aande rechterkant ((7 > 3) ? 7 : 3)
        // de conditie = (7 > 3)
        // ? = if true
        // resultaat bij true = 7 wordt opgeslagen in a
        // resultaat bij false = 3 wordt opgeslagen in a

        int a = (7 > 3) ? 7 : 3;

        // dit is dus hetzelfde als:
//        int = a
//        if(7 > 3) {
//            a = 7;
//        } else {
//            a = 3
//        }

        System.out.println(a);


        String b = "Howdy";
        // de waarde moeten wel overeenkomen met de vorm van de variabele
        double result = b.equals("Hello") ? 0.5 : 0.25;

        System.out.println(result);


    }
}
