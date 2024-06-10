/*
    Aufgabe2) Eingabe

    Erweitern Sie die main-Methode so, dass wiederholt Werte eingelesen werden, bis die Zahl 0 eingegeben
    wird. Dann wird das Programm beendet. Zuvor wird noch die Summe aller eingelesenen Zahlen ausgegeben, falls alle
    eingelesenen Werte ganze Zahlen waren. In allen anderen F&auml;llen wird nichts ausgegeben.

    Zusatzfragen:
    1. Warum muss eine ung&uuml;ltige Eingabe (keine ganze Zahl) aus dem Input-Stream entfernt werden?
    2. Woran kann man erkennen, dass ein eingelesener Wert eine ganze Zahl ist?
    3. Woran kann man feststellen, ob eine fr&uuml;here Eingabe ung&uuml;ltig war?
*/
import java.util.Scanner;
public class Aufgabe2_copy {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        int m = 0;
        int zahl = eingabe.nextInt();

        if (zahl >= -10 && zahl <= 10 && zahl != 0) {
            do m += zahl;
            while (eingabe.hasNextInt());
            if (eingabe.nextInt() > 10 || -10 < eingabe.nextInt()) {
                System.out.println("Zahl leigt außerhalb des zugelassenen Bereiches. Bitte nochmal versuchen.");
                zahl = eingabe.nextInt();
            } else {
                if (eingabe.nextInt() == 0) {
                    System.out.println("Eingabe abgebrochen");
                    System.out.println("Summe der Zahlen: " + m);
                }
            }
        }
    }
}
