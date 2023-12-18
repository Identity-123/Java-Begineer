import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number");
        int num = sc.nextInt();
        String check = num %2 == 0 ? "Even" : "Odd";
        System.out.println(check);
    }
}