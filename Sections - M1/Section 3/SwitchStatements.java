public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "sunny": 
            System.out.println("You can wear a shirt."); break;
            case "cloudy": 
            System.out.println("You should wear a sweater."); break;
            case "rainy": 
            System.out.println("You should wear a rain coat."); break;
            case "snowy": 
            System.out.println("You should wear a jacket."); break;
            default:
            System.out.println("You can wear whatever you want");
                break;
        }

        // Section 2: User role
        int role = 2;
        switch(role){
            case 1:
            System.out.println(" You are an admin"); break;
            case 2:
            System.out.println("You are an editor"); break;
            case 3:
            System.out.println("You are a user"); break;
            default: System.out.println("Please contact HR");
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60){
            System.out.println("It's too hot and humid.\n");
        } else if (temperature >= 80){
            System.out.println("It's too hot.\n");
        } else if(temperature <= 60 && humidity >= 60){
            System.out.println("It's too cold and humid.\n");
        } else if (temperature <= 60){
            System.out.println("It's too cold\n");
        } else {
            System.out.println("It's comfortable.\n");
        }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        String msgAI;

        if (age >= 18 && age <= 60 && income >= 30000){
            msgAI = "Congratulations! You are eligible for the credit card\n";
        } else {
            msgAI = "Sorry, you are not eligible for the credit card";
        }
        System.out.println(msgAI);

        // Section 1: Traffic light colors
        String lightColor = "green";
        String colour;
        switch (lightColor){
            case "green": colour = "GO!"; break;
            case "red": colour = "STOP!"; break;
            case "yellow": colour = "SLOW DOWN!"; break;
            default: colour = "Error"; break;
        } System.out.println(colour);

        // Section 2: Exam grade
        int grade = 85;
        String gradeOutput;

        if (grade>=80){
            gradeOutput = "You got an A!";
        } else if (grade>=70){
            gradeOutput = "You got a B!";
        } else if (grade>=60){
            gradeOutput = "You got a C.";
        } else if (grade>=50){
            gradeOutput = "You got a D.";
        } else {
            gradeOutput = "You failed :(";
        }
        System.out.println(gradeOutput);

        // Section 3: Browser type
        String browser = "Chrome";
        String browserType;

        switch(browser){
            case "Chrome": browserType = "Open Chrome."; break;
            case "Firefox": browserType = "Open Firefox"; break;
            case "Safari": browserType = "Open Safari"; break;
            default: browserType = "Open anything at this point bro!";
        }
        System.out.println(browserType);
    }
}
