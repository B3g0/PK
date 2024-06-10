/*
    Aufgabe3) Verschachtelte Schleifen

    Erweitern Sie die Klasse 'Aufgabe3' um eine statische Methode namens "drawNumDiamond(int h)", die einen Diamanten
    (Raute) mit Zahlen ausgibt. Der übergebene Parameter "h" entspricht der Höhe des Diamanten (Raute). Ein h=9 führt
    zu folgender Ausgabe:

        1
       222
      33333
     4444444
    555555555
     4444444
      33333
       222
        1

    Testen Sie Ihre Methode mit weiteren Höhen für "h"! Der Rückgabetyp der Methode ist "void".

    Zusatzfragen:
    1. Wie ist die Vorgangsweise abzuändern, wenn statt jedem Wert 1 der Buchstabe A, statt jedem Wert 2 der
    Buchstabe B, ... und statt jedem Wert 5 der Buchstabe E ausgegeben werden soll ?
    (Die Methode soll dann nur für h <= 9 funktionieren.)

    2. An welchen Stellen ist das Programm zu ändern wenn Rauten der Form
        1
        2
       333
       444
      55555
       444
       333
        2
        1
    generiert werden sollen ?
*/
public class Aufgabe3 {

    public static void main(String[] args) {
        drawNumDiamond(9);
    }

    public static void drawNumDiamond(int h) {
        int space = h/2;
        int k = 1;
        int num = 1;
        for(int row = 0; row < h/2; row++) {
            for(int i = 0; i < space; i++) {
                System.out.print("  ");
            }
            for(int col = 0; col < k; col++) {
                System.out.print(num+" ");
            }
            space--;
            num++;
            k += 2;
            System.out.println();
        }
        int rows = 0;
        int temp = h;
        if(h %2 == 0) {
            rows = (h)/2;
            num = h/2;
            temp = h-1;
            System.out.print("  ");
        } else {
            rows = (h+1)/2;
        }
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < temp; col++) {
                if(row > col) {
                    System.out.print("  ");
                } else {
                    System.out.print(num+" ");
            }
        }
        num--;
        temp--;
        System.out.println();
        if(h%2==0) {
            System.out.print("  ");
        }
    }
}
}
