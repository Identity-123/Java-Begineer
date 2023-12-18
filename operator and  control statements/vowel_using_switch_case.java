import java.util.Scanner;
public class vowel_using_switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a letter ;- ");
        char letter = sc.next().charAt(0);
        switch (letter){
            case 'a', 'e', 'i', 'o', 'u' :
                System.out.println("vowel letter");
                break;
            default:
                System.out.println("Consonant");
        }
    /*
    # enhanced switch case :-
    case 'a', 'i', 'o', 'u' ->
    {
        System.out.println(vowel);
    }
    default -> System.out.println("consonant")

    # another method :-
    case 'a':
    case 'e':
    case 'i't a
    case 'o':
    case 'u'
    System.out.println("Vowel ");
    break;
    default:
    System.out.println("Consonant");
     */
    }
}
