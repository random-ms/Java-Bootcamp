public class HighScore1 {
    public static void main(String[] args) {
        
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                        randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        int highScore = 0;
        
        for (int i = 0; i < scores.length; i++){
            System.out.println("Here are the scores: \n");
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int randomNumber(){
        double rn = Math.random() * 5000;
        int rnumber = (int)rn;
        return rnumber;
    }

}
