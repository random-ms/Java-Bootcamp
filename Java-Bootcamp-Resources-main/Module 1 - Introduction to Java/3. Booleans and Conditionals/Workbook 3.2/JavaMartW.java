public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        double toyCar = 5.99;

        System.out.println("\nCan I get this car?");
       
        if (wallet>=toyCar){
            System.out.println("Sure!");
            wallet -= toyCar;
        } else{
            System.out.println("Sorry, I only have " + wallet + " left."); 
        }

        double nike = 95.99;
        System.out.println("\nCan I get these nike shoes?");

        if (wallet>=nike){
            System.out.println("Sure!\n");
         //   wallet -= nike;
        } else{
            System.out.println("Sorry, I only have " + wallet + " left.\n"); 
        }
    }
}
