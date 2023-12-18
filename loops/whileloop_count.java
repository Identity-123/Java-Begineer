import java.util.Scanner;
public class whileloop_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number -: \n");
        int num = sc.nextInt();
        int digit = 0;
        while (num >0){
            num/=10;
            digit++;
        }
System.out.println(digit);
    }
}
