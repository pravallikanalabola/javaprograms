import java.util.*;

public class area {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * String name = sc.next();
         * System.out.println(name);
         * int a=sc.nextInt();
         * int b=sc.nextInt();
         * System.out.println(a+b);
         */
        System.out.println("enter the radius");
        double r = sc.nextDouble();
        double pi = 2.17;
        double area = pi * r * r;
        System.out.println(area);

    }
}