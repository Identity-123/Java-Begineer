import java.util.Scanner;

public class relational {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int x = sc.nextInt();
        System.out.println("enter the second number");
        int y = sc.nextInt();
        if(x == y){
            System.out.println( x + " is greatest");

        }
        else {
            System.out.println(y + " is greatest");
        }
    }
}
