import java.util.Scanner;

public class Interact2 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your first name? ");
        String fname = scanner.nextLine();

        System.out.println("\nHi " + fname + ", How old are you? ");
        int age = scanner.nextInt();

        String outcome;

        if (age >= 18){
             outcome = "You qualify to vote.";
        } else{
             outcome = "You do not qualify to vote.";
        }

        System.out.println("\nHi " + fname + ", " + outcome);
        scanner.close();
    }
}
