import java.util.Scanner;

/*
    Aufgabe2) Eingabe

    Erweitern Sie die main-Methode so, dass wiederholt Werte eingelesen werden,
    bis die Zahl 0 eingegeben
    wird. Dann wird das Programm beendet. Zuvor wird noch die Summe aller 
    eingelesenen Zahlen ausgegeben, falls alle eingelesenen Werte ganze Zahlen
    waren. In allen anderen Fällen wird nichts ausgegeben.

    Zusatzfragen:
    1. Warum muss eine ungültige Eingabe (keine ganze Zahl) aus dem
    Input-Stream entfernt werden?
    2. Woran kann man erkennen, dass ein eingelesener Wert eine ganze Zahl ist?
    3. Woran kann man feststellen, ob eine frühere Eingabe ungültig war?
*/
public class Aufgabe2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int zahl = 1;
        int sum = 0;
        System.out.println("Geben Sie eine ganze Zahl ein!");
        while ((zahl != 0) && (scanner.hasNext())) {
            if (scanner.hasNextInt()) {
                zahl = scanner.nextInt();
                sum += zahl;
            } else {
                scanner.next();
                System.out.println("Das war keine ganze Zahl!");
            }
        }
        System.out.println(sum);
    }
}
