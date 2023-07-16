import java.util.Scanner;

public class JavaRollsWb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int diceRoll = rollDice();
        int score = 0;

        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:\n");
        System.out.println("- If you roll a 6, the game stops.\n");
        System.out.println("- If you roll a 4, nothing happens.\n");
        System.out.println("- Otherwise, you get 1 point.\n");
        System.out.print("You must collect at least 3 points to win. Enter anything to roll: ");
        
        while (true) {
            scan.nextLine();
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll + ".");
            if (diceRoll==6){
                System.out.println("End of game.");
                break;
            } else if (diceRoll==4){
                System.out.println("\nZero points. Keep rolling.");
            } else {
                score++;
                System.out.println("One point. Keep rolling.");
            }
        }

        if(score>=3){
            System.out.println("\nWow, that's lucky. You win!");
        } else {
            System.out.println("\nTough luck, you lose :(");
        }
        scan.close();

    }

    public static int rollDice(){
        double randomNumber = Math.random() * 6;
        randomNumber +=1;
        return (int)randomNumber;
    }
}
