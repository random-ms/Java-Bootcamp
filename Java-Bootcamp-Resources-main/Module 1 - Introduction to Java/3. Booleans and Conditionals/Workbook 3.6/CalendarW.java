public class Calendar {
    public static void main(String[] args) {
        
        //Test case 1
        String day = "Friday"; //Can be any day.
        String response1;
        System.out.println("Hey, are you free on " + day + "?");
        System.out.println("Hmm, let me check my calendar.");

        switch(day){
            case "Monday": response1 = "Sorry, I have to stay at work late."; break;
            case "Tuesday": response1 = "It looks like I have meetings all day."; break;
            case "Wednesday": response1 = "I have a dentist appointment.Some other time!"; break;
            case "Thursday": response1 = "Sorry, Thursday is date night."; break;
            case "Friday": response1 = "I'm free, Friyay!"; break;
            case "Saturday": response1 = "I'm free, Sat!"; break;
            case "Sunday": response1 = "I'm free"; break;
            default: response1 = "That's not a day.";
        } System.out.println(response1 + "\n");

         //Test case 2
         day = "Saturday"; //Can be any day.
         System.out.println("Hey, are you free on " + day + "?");
         System.out.println("Hmm, let me check my calendar.");
 
         switch(day){
             case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
             case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
             case "Wednesday": System.out.println("I have a dentist appointment.Some other time!"); break;
             case "Thursday": System.out.println("Sorry, Thursday is date night."); break;
             case "Friday": System.out.println("I'm free, Friyay!"); break;
             case "Saturday": System.out.println("I'm free, Sat!"); break;
             case "Sunday": System.out.println("I'm free"); break;
             default: System.out.println("That's not a day.");
         }
                //Test case 3
                day = "Moynday"; //Can be any day.
                System.out.println("Hey, are you free on " + day + "? \n");
                System.out.println("Hmm, let me check my calendar.\n");

                switch(day){
                    case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
                    case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
                    case "Wednesday": System.out.println("I have a dentist appointment.Some other time!"); break;
                    case "Thursday": System.out.println("Sorry, Thursday is date night."); break;
                    case "Friday": System.out.println("I'm free, Friyay!"); break;
                    case "Saturday": System.out.println("I'm free, Sat!"); break;
                    case "Sunday": System.out.println("I'm free"); break;
                    default: System.out.println("That's not a day.");
                }
         
              
    }
}
