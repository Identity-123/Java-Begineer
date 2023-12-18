import java.util.Scanner;

public class gcd_or_hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int on1 = n1;
        int on2 = n2;
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;

            /*
             In above code,
             we put n1 = n2 because n2 will be dividend
            in a/b where a = numerator/dividend and b is denominator/divisor
            */

            n2 = rem;
            //  we assign n2 value as rem because remainder will be the next divisor

        }
        int gcd = n2;
        int lcm = on1*on2 /gcd;
    System.out.println("gcd ="+gcd);
    System.out.println("lcm="+lcm);
    }

}
