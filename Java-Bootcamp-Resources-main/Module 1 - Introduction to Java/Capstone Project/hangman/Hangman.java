import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};


    public static String randomWord(){
        int numWords = words.length;
        double random = Math.random();
        int randomIndex = (int)(numWords * random);
        return words[randomIndex];
    }

    public static void printPlaceHolders(String word){
        char[] placeHolder = word.toCharArray();
        System.out.print("\nPlace Holder: ");

        for(char c : placeHolder){
            c = '_';
            System.out.print(c + " ");
        }
    }

    public static Boolean checkGuess(String word, char letter){
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static char[] updatePlaceholders(String word, char letter, Boolean guess){
        char[] placeHolder = word.toCharArray();

        if (guess == true){
            for (int i = 0; i < word.length(); i++) {
                if(placeHolder[i] == letter){
                    placeHolder[i] = letter;
                    continue;
                } 
                return printPlaceHolders(word);
            }
        }        
            return placeHolder;
    } 


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String randomWord = randomWord();
        
        System.out.println("\nThe Word is:\t" + randomWord.toUpperCase());

        printPlaceHolders(randomWord);


        System.out.print("\nTry to guess.\t");
        char inputGuess = scan.next().charAt(0);

        boolean checkGuess = checkGuess(randomWord, inputGuess);
        System.out.println("Correct guess?\t" + checkGuess);

        System.out.println("Updated Shandis: " + updatePlaceholders(randomWord, inputGuess, checkGuess));

        scan.close();
    }

}





