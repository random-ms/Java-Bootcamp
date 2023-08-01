import java.util.Scanner;

public class RockPaperScissorsC {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLet's play Rock Paper Scissors.");
        System.out.println("\nWhen I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("\nAre you ready? Write 'yes' if you are.\t");

        String userDecidesToPlay = scan.nextLine();
        playGame(userDecidesToPlay);

        System.out.println("\nrock - paper - scissors, shoot!");

        String yourChoice = scan.nextLine();
        String computerChoice = computerChoice();

        String result = result(yourChoice, computerChoice);
        printResult(yourChoice, computerChoice, result);

        scan.close();
    }

        public static void playGame(String decision){
            if (decision.equals("yes")){
                System.out.println("Great");
            } else {
                System.out.println("Darn, some other time...! ");
            }
        }
    
        public static String computerChoice(){
        Double randomGen = Math.random() * 4;
        int rn_choice = randomGen.intValue();
      
       switch (rn_choice) {
        case 0: return "rock";
        case 1: return "paper";
        case 2: return "scissors";
        default: return "";
                            } 
        }


        public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result = "You win!";
            } else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
                result = "You win!";
            } else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
                result = "You win!"; 
            } else if (yourChoice.equals("rock") && computerChoice.equals("scissors")){
                result = "You lose!";
            } else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
                result = "You lose!";
            } else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
                result = "You lose!";
            } else if (yourChoice.equals(computerChoice)){
                result = "It's a tie!";
            } else {
                result = "INVALID CHOICE";
                System.exit(0);
            }
        return result;
      }

      public static void printResult(String yourChoice, String computerChoice, String result){
        System.out.println("\nYou chose: " + yourChoice + 
                            ".\nThe computer chose: " + computerChoice + result);
      }
}
