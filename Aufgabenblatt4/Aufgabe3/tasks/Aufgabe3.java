/*
    Aufgabe3) Darstellung rekursiver Aufrufe

    Wandeln Sie die Methode rec aus der Klasse TuermeVonHanoi (Vorlesung vom 9.11.2015) so ab, dass zusätzlich
    in jedem Aufruf von rec folgende Daten mittels System.out.print und System.out.println ausgegeben werden:

    - aktuelle Aufrufebene (bzw Rekursionstiefe) wie in der Vorlesung vom 5.11.2015
    - aktuelle Werte der Parameter i, a, b und c

    Außerdem soll rec die Anzahl aller rekursiven Aufrufe von rec während der Ausführung von rec zurückgeben.

    Ein Aufruf von rec(3, 'A', 'B', 'C', 1) soll beispielsweise 7 zurückgeben und folgende Zeilen ausgeben:

        Aufrufebene 1:  i = 2, a = A, b = B, c = C
        Aufrufebene 2:  i = 1, a = A, b = C, c = B
        Aufrufebene 3:  i = 0, a = A, b = B, c = C
        von A nach B
        Aufrufebene 3:  i = 0, a = C, b = A, c = B
        von A nach C
        Aufrufebene 2:  i = 1, a = B, b = A, c = C
        Aufrufebene 3:  i = 0, a = B, b = C, c = A
        von B nach C
        Aufrufebene 3:  i = 0, a = A, b = B, c = C

    Hinweis: Zur Ermittlung der Aufrufebene ist ein zusätzlicher Parameter 'level' nötig.

    Zusatzfragen:
    1. Wieso kann man die Aufrufebene nicht direkt aus dem Wert von i ermitteln?
        Weil i nicht immer bei 0 beginnt.
    2. Warum sind die Werte von a, b und c nicht in jedem Aufruf gleich?
        Weil sie geändert werden.
    3. Welche Ergebnisse gibt rec zurück, wenn der erste Parameter gleich 5, 10, 15 bzw. 20 ist?
        sehr lange..
    4. Hängt das zurückgegebene Ergebnis von den Parametern a, b und c ab?
        nein, nur von "i"
*/
public class Aufgabe3 {

    // just for testing ...
    public static void main(String[] args) {
        System.out.println("Anzahl ist;" + rec(3, 'A', 'B', 'C', 0, 0));
    }

    private static int rec(int i, char a, char b, char c, int ebene, int anzahl) {
        if (i > 0) {
            anzahl++;
            System.out.println("Aufrufebene" + (ebene + 1) + ": i = " + (i - 1) + ", a = " +a+ ", b = " +b+ ", c = " +c);
            anzahl = rec(i - 1, a, c, b, ebene + 1, anzahl);
            System.out.println("von " + a + " nach " + c);
            anzahl = rec(i - 1, b, a, c, ebene + 1, anzahl);
        }
        return anzahl;
    }
}
