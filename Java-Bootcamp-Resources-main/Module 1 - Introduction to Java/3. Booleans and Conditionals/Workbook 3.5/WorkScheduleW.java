
public class WorkSchedule {
    public static void main(String[] args) {

        // Test Case 1
        int day = 3;   //3rd day of the week...
        boolean holiday = true;
         
        if (holiday){
            System.out.println("Woohoo, no work");
        } else if (day == 6 || day ==7){
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }

        // Test Case 2
        day = 3;
        holiday = false;

        if (holiday){
            System.out.println("Woohoo, no work");
        } else if (day == 6 || day ==7){
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
        
        day = 6;
        holiday = false;
        
        if (holiday){
            System.out.println("Woohoo, no work");
        } else if (day == 6 || day ==7){
            System.out.println("It's the weekend, no work!");
        } else {
            System.out.println("Wake up at 7:00 :(");
        }
    }

}
