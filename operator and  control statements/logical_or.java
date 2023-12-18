import java.util.Scanner;
public class logical_or {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("From how many days you are working here :-");
    int work = sc.nextInt();
    sc.nextLine();

    System.out.print("Which organization are you from :-");
    String organization = sc.nextLine();
    if (organization.equals("cod with coffee") || work >50){
        System.out.println("__User is permitted __");
    }
    else {
        System.out.println("User blocked");
    }

}
}
