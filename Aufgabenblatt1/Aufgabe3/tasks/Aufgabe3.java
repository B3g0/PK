/*
    Aufgabe3) Schleifen und Methoden
    Erweitern Sie die Klasse "Aufgabe3" um folgende Funktionalität:
    - Schreiben Sie eine statische Methode "isFacultyDiv", die die Fakultät einer Zahl berechnet und überprüft ob das Ergebnis durch eine weitere Zahl teilbar ist.
    - Der Methode wird eine ganzzahlige Zahl "n" übergeben, die zur Berechnung der Fakultät verwendet wird und größer 1 ist.
    - Der Methode wird eine weitere ganzzahlige Zahl "div" als Divisor übergeben.
    - Die Methode liefert den boolschen Wert "true" zurück, falls das Ergebnis der Fakultätsberechnung durch den Divisor teilbar ist, ansonsten "false".
    - Testen Sie Ihr Programm im "main" mit verschiedenen Inputs und geben Sie das Ergebnis mit "System.out.println()" aus.

    Zusatzfragen:
    1) Warum verwendet man im allgemeinen Methoden? Warum nicht alles direkt in "main" programmieren?
*/
public class Aufgabe3 {

    public static void main(String[] args) {

        System.out.println(isFacultyDiv(5, 4));
    }

    public static boolean isFacultyDiv(int n, int div) {

        int fac = 1;
        while (n > 0) {
            fac *= n;
            n--;
            if (fac % div == 0 && n > 1) {
                return true;
            }
        }
        return false;
    }
}
/*
    1) Methoden sind kleine Unterprogramme sozusagen.
       Sie übernehmen Werte aus "main" und geben das gewünschte Ergebnis zurück. Das macht den Code übersichtlicher.
 */
