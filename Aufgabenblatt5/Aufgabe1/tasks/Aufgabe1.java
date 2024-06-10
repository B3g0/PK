/*
    Aufgabe1) Rekursion in Iteration ändern

    Stellen Sie fest, was die Methode 'rec' macht. Schreiben Sie eine statische Methode 'iter', die das Gleiche macht
    wie 'rec' (gleiches Input-Output-Verhalten), aber ohne Rekursion auskommt.

    Zusatzfragen:
    1. Was berechnet 'rec'?
    2. Warum ist es notwendig, negative Parameterwerte getrennt zu behandeln?-
    3. Warum ist es notwendig, 0 als Sonderfall zu behandeln?- Die while() Schleife wird unendlich
*/
public class Aufgabe1 {

    // What does rec compute?
    public static int rec(int x, int y) {
        if (x < 0) {
            return rec(-x, y);
        }
        if (y < 0) {
            return rec(x, -y);
        }
        if (x == 0) {
            return 0;
        }
        if (x > y) {
            return rec(y, x);
        }
        if (x == y) {
            return x;
        }
        return rec(x, y - x);
    }

    // Does the same as rec.
    private static int iter(int x, int y) {
        int temp;
        while(true){
            if (x < 0) {
                x=-x;
            }
            if (y < 0) {
                y=-y;
            }
            if (x == 0) {
                return 0;
            }
            if (x > y) {
                temp=y;
                y=x;
                x=temp;
            }
            if (x == y) {
                return x;
            }
            y= y - x;
        }

//        return -1;  // Implementation is your task.
    }

    public static void main(String[] args) {
        System.out.println(rec(6,-4));
        System.out.println(iter(6,-4));

    }
}
