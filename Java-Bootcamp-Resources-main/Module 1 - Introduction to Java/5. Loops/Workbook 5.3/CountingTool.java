import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! Choose a number to count to: \t");
        int response = scan.nextInt();

        for (int i = 0; i <= response; i++){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
