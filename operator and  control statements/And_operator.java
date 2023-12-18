import java.util.Scanner;
public class And_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your age :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Which country are you from");
        String Citizenship = sc.nextLine();
        if (age >= 18 && Citizenship.equalsIgnoreCase("Indian")){
            System.out.println("you are allowed to vote");

        }
        else {
            System.out.println("nope you are too young");
        }

    }
}
