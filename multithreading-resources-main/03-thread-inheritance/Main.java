public class Main {

    public static void main(String[] args) {
        AthleteThread firstAthlete = new AthleteThread("John", Thread.MAX_PRIORITY, 1234);
        AthleteThread secondAthlete = new AthleteThread("Peter",Thread.MIN_PRIORITY ,5432);
 
        // Starting the threads
        firstAthlete.start(); // start will automatically call run() from AthleteThread
        secondAthlete.start();
    }
}