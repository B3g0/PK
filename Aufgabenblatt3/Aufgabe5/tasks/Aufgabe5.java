/*
    Aufgabe5)  Schleifenanwendung

    Erweitern Sie die Klasse 'Aufgabe5' um eine statische Methode namens "getSecretDigit(long n)", die einen ganzzahligen
    Parameter "n" übergeben bekommt, in dem sich eine geheime Ziffer befindet. Die Methode soll diese Ziffer finden und
    retournieren.
    Als Beispiel ist eine long-Zahl 528623274883745676 gegeben. Gehen Sie dabei folgendermassen vor: Betrachten Sie die
    letzte Ziffer der Zahl. Es ist die Zahl sechs. Rücken sie demgemäß 6 Positionen von diesem Sechser nach links.
    Betrachten Sie die dortige Ziffer. Es handelt sich um einen Dreier. Rücken Sie demgemäß drei Positionen von diesem
    Dreier nach links. Betrachten Sie die dortige Ziffer. Es ein Zweier. Rücken Sie demgemäß zwei Positionen nach links.
    usw. Wenn Sie aus der Zahl "hinausrücken" würden, beenden Sie dieses Verfahren. Ihre zuletzt gefundene Ziffer ist die
    gesuchte Geheimziffer.

    HINWEIS: Verwenden Sie keinerlei Methoden aus der String-Klasse, die die Aufgabe verkürzen würden!

    Zusatzfragen:
    1. Testen Sie Ihre Methode mit einer weiteren 18-stelligen Zahl ohne Nuller.
    2. Wie reagiert die derzeitige Methode wenn sie auf die Ziffer 0 trifft? Wie können Sie das Programm verändern,
       um auch Ziffern 0 im Eingabeparameter zu berücksichtigen?
*/
public class Aufgabe5 {

    public static void main(String[] args) {
        long n = 528623274883745679L;
        long toTheLeft = n%10;
        while(n>0) {
            for(int i = 0; i < toTheLeft && n != 0; i++) {
                n = n/10;
            }
            if(n==0) {
                break;
            }
            toTheLeft = n%10;
        }
        System.out.println(toTheLeft);
    }
    public static void getSecretDigit(long n) {

    }
}
