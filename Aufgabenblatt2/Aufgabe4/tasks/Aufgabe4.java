/*
    Aufgabe4) Vorgegebene versus berechnete Zahlen

    Stellen Sie fest, was die Methode 'longish' macht. Schreiben Sie eine
    Methode 'simpler', die genau dasselbe wie 'longish' macht (und denselben
    Parametertyp und Ergebnistyp hat), aber ohne bedingte Anweisung und ohne
    bedingten Ausdruck auskommt. In 'simpler' darf auch kein Literal mit einem
    Wert größer 10 vorkommen. Anders ausgedrückt: Die in 'longish' als Literale
    vorgegebenen Werte sollen in 'simpler' zur Laufzeit berechnet werden. Das
    geschieht
    in einer Schleife, sodass bedingte Anweisungen und Ausdrücke nicht nötig 
    sind.

    Zusatzfragen:
    1. Was macht 'longish'? 
    2. Welche Art von Schleife kommt in 'simpler' am
    besten zum Einsatz? 
    3. Ist es immer möglich, bedingte Anweisungen und
    Ausdrücke durch Schleifen zu ersetzen?
    4. Warum ist 'simpler' wahrscheinlich kürzer als 'longish', obwohl zur 
    Laufzeit mehr berechnet wird?
*/
public class Aufgabe4 {

    // what does 'longish' do?
    private static long longish(short n) {
        long result = 0L;
        while (n > 0) {
            switch (n % 10) {
                case 0:
                    result += 1L;
                    break;
                case 1:
                    result += 10L;
                    break;
                case 2:
                    result += 100L;
                    break;
                case 3:
                    result += 1000L;
                    break;
                case 4:
                    result += 10000L;
                    break;
                case 5:
                    result += 100000L;
                    break;
                case 6:
                    result += 1000000L;
                    break;
                case 7:
                    result += 10000000L;
                    break;
                case 8:
                    result += 100000000L;
                    break;
                case 9:
                    result += 1000000000L;
                    break;
            }
            n /= 10;
        }
        return result;
    }

    // does the same as 'longish'
    private static long simpler(short n) {
        long result = 0L;
        while (n > 0) {
            int temp=1;
            for(int i = 1; i<= n%10;i++) {
                temp *= 10;
            }
            result+=temp;
            n/=10;
        }
        return result;
    }

    // just for testing ...
    public static void main(String[] args) {
        // den Rumpf dieser Methode können Sie beliebig verändern
        System.out.println(longish((short) 104));
        System.out.println(simpler((short) 104));
    }
}
