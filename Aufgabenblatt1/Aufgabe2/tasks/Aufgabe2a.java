/**
 * Created by mensu on 16.10.2015.
 */
public class Aufgabe2a {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            if (count % 2 == 1) {
                if (count % 3 == 0) {
                    sum += count;
                    count++;
                }
            }
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                if (i % 7 == 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        System.out.println("Hallo");
    }
}
