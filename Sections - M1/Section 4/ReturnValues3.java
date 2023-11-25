import java.util.Scanner;

public class ReturnValues3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = 0;
        double width = 0;
        
        System.out.println("\nHi, please enter prefered output 1-3: \n" +
        "\n1. English \n2. French \n3. Spanish \n");

        int choice = scan.nextInt();

        while(!(choice > 0) || !(choice < 4)){
            System.out.println("\n" + choice + " is out of range, Please try again!\n"
                                    + "\t1. English \t2. French \t3. Spanish \t");
            choice = scan.nextInt();
        }

        switch (choice) {
            case 1: System.out.println("\nArea equals length * width");
                    System.out.println("\nPlease enter length: \t");
                    length = scan.nextDouble();
                    System.out.println("\nPlease enter width: \t");
                    width = scan.nextDouble();
                    break;
            
            case 2: System.out.println("\nLa surface est egale a la longueur * la largeur");
                    System.out.println("\nVeuillez entrer la longueur: \t");
                    length = scan.nextDouble();
                    System.out.println("\nVeuillez entrer la largeur: \t");
                    width = scan.nextDouble();
                    break;

            case 3: System.out.println("a\nrea es igual a largo * ancho");
                    System.out.println("\nPor favor ingrese la longitud \t");
                    length = scan.nextDouble();
                    System.out.println("\nPor favor ingrese el ancho: \t");
                    width = scan.nextDouble();
                    break; 
                
            default: System.exit(0);
        }
        
        scan.close();

        Double area = calculateArea(choice, length, width);
        printArea(choice, length, width, area);

    }
    
        public static double calculateArea(int choice, double length, double width){
            for (int i = choice; length < 0 || width < 0; i++){
                if(i == 1){
                    System.out.println("Invalid Dimension.");
                    break;
                }
                if (i == 2){
                    System.out.println("Dimension invalide.");
                    break;
                }
                if (i == 3){
                    System.out.println("Dimensión no válida");
                    break;
                }
            }
                double area = length * width;
                return area;
        }
        
        public static void printArea(int choice, double length, double width, double area){
                switch (choice) {
                    case 1: 
                    System.out.println("\nA rectangle with a length of " + length + 
                                        ", and a width of " + width + ", has an area of " + area);
                    break;
                    
                    case 2:
                    System.out.println("\nUn rectangle d'une longueur de " + length + 
                                        ", et une largeur de " + width + ", a une superficie de " + area);
                    break;

                    case 3: 
                    System.out.println("\nUn rectángulo con una longitud de " + length + 
                                        ", y un ancho de " + width + ", tiene un área de " + area);
                    break;

                    default: System.exit(0);
                }
        }
}