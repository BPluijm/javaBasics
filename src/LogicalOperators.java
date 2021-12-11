public class LogicalOperators {

    public static void main(String[] args) {
        // || betekend OR
        // && betekend AND
        // ! betekend NOT
        // != betekend IS NOT EQUAL TO

        // dit blijft true want er minimaal 1 van true
        boolean a = true || false || false || false;
        System.out.println(a);

        // dit is altijd false want ze zijn niet beide gelijk
        boolean b = false && true;
        System.out.println(b);

        // dit geeft false weer
        boolean c = !true;
        System.out.println(c);

        // dit zal altijd false zijn
        boolean d = !(true || false);
        System.out.println(d);

        int e = 3;
        int f = 4;
        boolean isSunny = true;
        // beide zijn waar daarom wordt de sout uitgeprint
        if (e < f && isSunny) {
            System.out.println("It's gonna be a good day");
        }


    }
}
