public class NamingConventions {
    // Class namen mogen geen spaties of nummers erin hebben want dan werkt het niet
    // altijd met hoofdletter beginnen
    // gebruik ook geen afkortingen in de naam van de class

    public static void main(String[] args) {
    // methode namen starten altijd met een kleine letter
    // het zou een werkwoord moeten zijn
    // ieder nieuw woord begint met een hoofdletter\

        int a = 5;
        // variabele namen het begint met kleine letter
        // iedere nieuw woord begint met een hoofdletter
        // beschrijft wat je erin opslaat

        int maxAge = 100;
        // als deze nooit verandert verander het dan naar allemaal hoofdletters met een underscore als spatie
        // en voeg final + static voor int, etc. toe
        // verplaats hem dan direct onder de public class bovenaan in de code, wordt nu als fout weergegeven omdat het op de verkeerde plaats in de code staat
        // static
        final int MAX_AGE = 100;
    }
}
