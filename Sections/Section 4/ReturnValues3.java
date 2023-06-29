import java.util.Scanner;

public class ReturnValues3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, please enter prefered language output 1-3: \t" +
        "\n1. English \n2. French \n3. Spanish\t");

        int choice = scan.nextInt();
        String langChoice = explainArea(choice);
        System.out.println("\n" + langChoice);

        System.out.println("\nPlease enter length: \t");
        Double length = scan.nextDouble();
        
        System.out.println("\nPlease enter width: \t");
        Double width = scan.nextDouble();

        Double area = calculateArea(length, width);
        printArea(length, width, area);

        scan.close();
        }

        public static String explainArea(int language){
            switch (language) {
                case 1: return "Area equals length * width"; //English
                case 2: return "La surface est egale a la longueur * la largeur"; //French
                case 3: return "area es igual a largo * ancho"; //Spanish
                default: return "Language not available.";
            }
        }
    
        public static double calculateArea(double length, double width){
            if (length < 0 || width < 0){
                System.out.println("Invalid Dimension.");
            } 
                double area = length * width;
                return area;
        } 


        public static void printArea(double length, double width, double area){
            System.out.println("\nA rectangle with a length of " + length + ", and a width of " + width + ", has an area of " + area);
        }
    }