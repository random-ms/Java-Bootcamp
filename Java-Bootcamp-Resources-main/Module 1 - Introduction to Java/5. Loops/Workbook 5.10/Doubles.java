public class Doubles {
    public static void main(String[] args) {

        int dice1 = rollDice();
        int dice2 = rollDice();

        while (dice1 != dice2){
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.println("Dice One: " + dice1); 
            System.out.println("Dice Two: " + dice2 + "\n");
        } 

        System.out.println("You rolled Doubles!");

    }

    public static int rollDice(){
        Double randomNumber = (Math.random() * 6);
        return (int)(randomNumber + 1);
    }

}





