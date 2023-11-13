import java.util.Scanner;

public class ReturnValues3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = 0;
        double width = 0;
        
        System.out.println("Hi, please enter prefered language output 1-3: \t" +
        "\n1. English \n2. French \n3. Spanish \t");

        int choice = scan.nextInt();

            if (choice == 1){
                System.out.println("\nArea equals length * width");
                System.out.println("\nPlease enter length: \t");
                length = scan.nextDouble();
                System.out.println("\nPlease enter width: \t");
                width = scan.nextDouble();
            }

            if (choice == 2) {
                System.out.println("\nLa surface est egale a la longueur * la largeur");
                System.out.println("\nVeuillez entrer la longueur: \t");
                length = scan.nextDouble();
                System.out.println("\nVeuillez entrer la largeur: \t");
                width = scan.nextDouble();
            } 

            if (choice == 3){
                System.out.println("a\nrea es igual a largo * ancho");
                System.out.println("\nPor favor ingrese la longitud \t");
                length = scan.nextDouble();
                System.out.println("\nPor favor ingrese el ancho: \t");
                width = scan.nextDouble();
            }
            
            Double area = calculateArea(choice, length, width);
            printArea(choice, length, width, area);

            scan.close();
        
    }
    
        public static double calculateArea(int choice, double length, double width){
            if (length < 0 || width < 0){
                if(choice==1){
                        System.out.println("Invalid Dimension.");
                }
                if (choice == 2){
                System.out.println("Dimension invalide.");
                }
                if (choice ==3){
                System.out.println("Dimensión no válida");
                }
            }
                double area = length * width;
                return area;
        }
        
        public static void printArea(int choice, double length, double width, double area){
            if (choice == 1){
                System.out.println("\nA rectangle with a length of " + length + ", and a width of " + width + ", has an area of " + area);
            }
            if (choice == 2) {
                System.out.println("\nUn rectangle d'une longueur de " + length + ", et une largeur de " + width + ", a une superficie de " + area);
            }
            if (choice ==3){
                System.out.println("\nUn rectángulo con una longitud de " + length + ", y un ancho de " + width + ", tiene un área de " + area);
            }
        }
}