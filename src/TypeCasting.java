public class TypeCasting {

    public static void main(String[] args) {

        // je kan aanpassen van boven naar benenden naar niet andersom
        // een byte kun je dus wel in een double opslaan maar niet andersom

        byte a = 1;
        short b;
        char c;
        int d = 500;
        long e;
        float f;
        double g;

        // je kan alleen de double in een int verandere door er (int) voor te zetten
//        int ex = (int) g;
        // dit kan wel want een double is groter dan een int
        double ex1 = d;
    }
}
