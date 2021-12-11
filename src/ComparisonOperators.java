public class ComparisonOperators {

    public static void main(String[] args) {

        // == is equal to
        // != is not equal to
        // <= less than or equal to
        // < less than
        // < greater than
        // >= greater than or equal to
        // || OR
        // && AND


        // wanneer het false is wordt het niet weergegeven%!!!


        double a = 2.4;

        if(a == 2.4) {
            System.out.println("They are equal!");
        }

        if(a > 7) {
            System.out.println("Greater than 7");
        }

        if(a == 2.4 || a == 2.5 || a == 6.1) {
            System.out.println("a is 2.4 or 2.5");
        }

        if(a >= 0 && a <= 100){
            System.out.println("a is in te range");
        }

    }
}
