/*
    Aufgabe2) Verzweigungen und Schleifen
    Erweitern Sie die main-Methode um folgende Funktionalität:
    - Schreiben Sie eine while-Schleife, die alle ungeraden und durch 3 teilbaren Zahlen im Intervall von 0 bis einschließlich 100 aufsummiert.
    - Geben Sie die Summe mit "System.out.println()" aus.

    Zusatzfragen:
    1) Könnte man diese Aufgabe auch mit einer for-Schleife lösen? Wenn ja, wie würde der Ansatz aussehen?
    2) Die Schleife summiert Werte in einem bestimmten Intervall. Wie könnten Sie das Programm umbauen damit die Schleife beliebige Intervalle aufsummiert?
*/
public class Aufgabe2 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 1;
        while (count <= 100) {
            if (count % 2 == 1) {
                if (count % 3 == 0) {
                    sum += count;
                }
            }
            count++;
        }
        System.out.println(sum);

    }
}

/*
        1)  Ja:

        sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                if (i % 7 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);

        2)
 */