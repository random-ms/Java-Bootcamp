import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        int secret = 4;
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess != secret){
            System.out.print("Guess again! " + guess);
            guess = scan.nextInt();
        } 
            System.out.print("You got it! " + secret);
        scan.close();
    }

}
