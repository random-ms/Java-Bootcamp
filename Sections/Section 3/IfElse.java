public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("\nMe: Hi Java, did I score better in biology?");

        if (chemistryGrade > biologyGrade){
            System.out.println("Yes you did, congrats!");
        } else {
            System.out.println("No you did not.");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");

        if(sales > costs){
            System.out.println("Yes you did, congrats!");
        } else {
            System.out.println("No, you did not.");
        }

        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");

          if(temperature < targetTemperature){
            System.out.println("Yes, indeed.");
        } else {
            System.out.println("No, it is not.");
        }

        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        if(currentSpeed < speedLimit){
            System.out.println("Yes you are!");
        } else {
            System.out.println("No, Please slow.");
        }

        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");

        if(age >= retirementAge){
            System.out.println("Please retire.");
        } else {
            System.out.println("No, still " + (retirementAge-age) + " years to go!");
        }

        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");

        if (myGrade==bestGrade){
            System.out.println("Yes, congrats!");
        } else {
            System.out.println("No, the best grade is " + bestGrade + "."); 
        }

        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");

        if (word.equals(secondWord)){
            System.out.println("They are the same.");
        } else {
            System.out.println("No, they are not!");
        }

        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different");

        if (!thirdWord.equals(fourthWord)){
            System.out.println("Yes, they are indeed different!");
        } else {
            System.out.println("No, they are not");
        }
    }
}
