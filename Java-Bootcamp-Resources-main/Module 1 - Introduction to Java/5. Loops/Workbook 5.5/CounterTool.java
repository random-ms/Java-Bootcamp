import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("\nJimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.println("Pick a number to count by: ");
        int countBy = scan.nextInt();

        System.out.println("\nPick a number to start counting from: \t");
        int startCount = scan.nextInt();

        System.out.println("\nPick a number to count to: \t");
        int endCount = scan.nextInt();

        for(int i = startCount; i <= endCount; i += countBy){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
