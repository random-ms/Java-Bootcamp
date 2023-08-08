import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
   
        int value = scan.nextInt();
        String[][] database = new String[value][3];       
        
        scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            String name = scan.nextLine();

            System.out.print("\t - Date of birth (dd/mm/yyyy): ");
            String date = scan.nextLine();

            System.out.print("\t - Occupation: ");
            String occupation = scan.nextLine();

            database[i][0] = name;
            database[i][1] = date; 
            database[i][2] = occupation; 

            System.out.print("\n");
        }
        
        System.out.println("These are the values you stored:"); 
            print2DArray(database);

        System.out.print("\nWho do you want information on? ");
        String info = scan.nextLine();

        if(info.equalsIgnoreCase("Marco Polo")){
            System.out.println("\tName: Marco Polo");
            System.out.println("\tdate of birth: 08/01/1324");
            System.out.println("\tOccupation: Merchant");
        } 
            else if(info.equalsIgnoreCase("Shakespeare")){
            System.out.println("\tName: Shakespeare");
            System.out.println("\tdate of birth: 26/03/1564");
            System.out.println("\tOccupation: Playwright");
            } else{
                System.out.println("Data not avaliable!");
            }

        scan.close();
    }

        public static void print2DArray(String[][] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print("\t");

                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.print("\n");
            }
        }

}
