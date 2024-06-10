/*
    Aufgabe5) Schleifen und Methoden
    Erweitern Sie die Klasse "Aufgabe5" um folgende Funktionalität:
    - Schreiben Sie eine statische Methode "calcCrossSum", die die Quersumme einer übergebenen Zahl berechnet.
    - Der Methode wird ein positiver ganzzahliger Wert "value" übergeben.
    - Die Methode liefert das Ergebnis der Quersumme als ganzzahligen Wert zurück.
    - Testen Sie Ihr Programm im "main" mit verschiedenen Inputs und geben Sie das Ergebnis mit "System.out.println()" aus.

    Zusatzfragen:
    1) Welcher positiver ganzzahliger (Typ "int") Wert muss der Methode übergeben werden, damit die höchstmögliche Quersumme berechnet wird?
*/
public class Aufgabe5 {

    public static void main(String[] args) {

        calcCrossSum(435);
    }

    public static int calcCrossSum(int value) {
        int sum = 0;
        int input = value;
        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}

/*
    1) Der größte Wert wäre 1999999999, da integer nur bis 2147483647 geht.
 */
