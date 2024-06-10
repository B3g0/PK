/*
    Aufgabe4) Schleifenanwendung

    Erweitern Sie die Klasse 'Aufgabe4' um eine statische Methode namens "encodeBin(long n)", die als Parameter einen
    positiven ganzzahlingen Wert übergeben bekommt. Dieser ganzzahlige Wert stellt eine Binärzahl dar und wird in dieser
    Methode codiert. Es wird das Vorkommen von Nullen und Einsen gezählt und die Anzahl ausgegeben. Bei jedem Wechsel
    von 0 auf 1 oder 1 auf 0 beginnt der Zähler neu zu zählen.

    z.B.:  Die Zahl "1101111000100111011L" generiert folgenden codierten Output:

        1 -> 2
        0 -> 1
        1 -> 3
        0 -> 2
        1 -> 1
        0 -> 3
        1 -> 4
        0 -> 1
        1 -> 2

    HINWEIS: Verwenden Sie keinerlei Methoden aus der String-Klasse, die die Aufgabe verkürzen würden!

    Zusatzfragen:
    1. Funktioniert dieses Programm nur für Binärzahlen oder können Zahlen mit anderer Zahlenbasis ebenfalls codiert werden? Wenn ja/nein - warum?
    2) Wieviele Stellen darf der Inputparameter der Methode maximal besitzen?
*/
public class Aufgabe4 {

    public static void main(String[] args) {
        encodeBin(1010011010);
    }

    public static void encodeBin(long n) {
        int output = 0;
        while(n>0) {
            if(n%10==1) {
                while(n%10==1) {
                    output++;
                    n /= 10;
                }
                System.out.println("1->"+ output);
                output = 0;
            } else if(n %10 == 0) {
                while(n %10 == 0) {
                    output++;
                    n /= 10;
                }
                System.out.println("0->"+ output);
                output = 0;
            }
        }
    }
}
