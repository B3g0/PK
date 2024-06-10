
public class GGT_Übung_rekursiv {

    public static void main (String args[]) {

        int ergebnis = ggt(1027, 395);
        System.out.println("Rechnung 1: "+ergebnis);

        ergebnis = ggt(9, ggt(24, 7));
        System.out.println("Rechnung 2: "+ergebnis);

        ergebnis = ggt(ggt(9, 24), 27);
        System.out.println("Rechnung 3: "+ergebnis);

        int n = 7;
        int d = 5;
        System.out.println("Bruchzahl: "+n+"/"+d);

        ergebnis = ggt(n, d);
        n /= ergebnis;
        d /= ergebnis;

        System.out.println("Gekürzt: " +n+"/"+d);
    }

    public static int ggt(int m, int n) {

        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return m;
    }
}
