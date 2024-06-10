/**
 * Created by mensu on 16.10.2015.
 */
public class bsp {

    public static void main(String[] args) {
        divide(5, 2);
        divide(9, 5);
    }

    private static void divide(int dividend, int divisor) {
        System.out.println(dividend / divisor);
        System.out.println(dividend % divisor);
    }
}
