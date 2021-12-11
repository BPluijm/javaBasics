import java.util.Scanner;

public class Modulus {

    // modulus --> %

    public static void main(String[] args) {
//        // omdat het helemaal kan worden opgedeeld is het 0
//        System.out.println(4 % 2);
//        // 4 past 3 keer in 15 en dus blijft er 3 over
//        System.out.println(15 % 4);
//        // 0.5 past 3x in 1.5 dus er blijft 0 over
//        System.out.println(1.5 % 0.5);
//        // bij decimalen geeft hij ook decimalen terug als uitkomst
//        System.out.println(1 % 0.6);

        // zo kan het gebruikt in de echte code

        int temp;
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num=scan.nextInt();
        scan.close();
        for (int i = 2; i <= num/2; i++) {
            temp=num%i;
            if(temp==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(" is not a Prime Number");
    }
}
