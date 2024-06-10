/*
    Aufgabe4) Schleifen und Methoden
    Erweitern Sie die Klasse "Aufgabe4" um folgende Funktionalität:
    - Schreiben Sie eine statische Methode "countDigits", die die Ziffern einer ganzzahligen Zahl zählt.
    - Der Methode wird ein positiver ganzzahliger Wert "value" übergeben.
    - Die Methode liefert das Ergebnis (Anzahl der Digits) als ganzzahligen Wert zurück.
    - Testen Sie Ihr Programm im "main" mit verschiedenen Inputs und geben Sie das Ergebnis mit "System.out.println()" aus.

    Zusatzfragen:
    1) Darf eine Methode mehr als eine return-Anweisung enthalten?

*/
public class Aufgabe4 {

    public static void main(String[] args) {

        System.out.println(countDigits(4854973));
    }

    public static int countDigits(int value) {
        int sum = 0;
        while(value > 0) {
            value /= 10;
            sum++;
        }
        return sum;
    }
}

/*
    1) Ja.
 */
