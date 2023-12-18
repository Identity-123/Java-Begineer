// largest of n number

import java.util.Scanner;

public class forloops_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number you want");
        // Integer .MIN_VALUE will store the minimum value that exist in java
        // i.e -(infinity)
        int n = sc.nextInt();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.println("enter the value"+i );
            int current = sc.nextInt();
            //Math.max will compare the largest number between maxvalue and current variables
            maxValue = Math.max(maxValue,current);
            //max value will be changed and stored outside thw for loop
        }
        System.out.println(maxValue);

    }
}
