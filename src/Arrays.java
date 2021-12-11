public class Arrays {

    // Zombie killer

    public static void main(String[] args) {
        System.out.println("Welcome to our zombie killer program!!!");

        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper Rifle", "SPAS-12", "ACR", "Grenade"};
        String zombies[] = {"Crawler", "Close-range zombie", "Mid-range zombie", "Long-range zombie", "Zombie herd"};
        int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};

        System.out.println("A " + zombies[0] + " is coming towards you....");
        System.out.println("What do you use to shoot it?");
        System.out.println("I use the " + backpack[0]);
        System.out.println();
        System.out.println("A " + zombies[4] + " is coming....");
        System.out.println("What is the most effective thing in your backpack?");
        System.out.println("I would use the " + backpack[5]);
        System.out.println();
        System.out.println("For total zombie annihilation the best number to give them is...");
        System.out.println(numbersZombiesHATE[6]);
    }
}
