import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {

        try{

            FileInputStream fis = new FileInputStream("Java-Bootcamp-Resources-main\\Module 2 - Object Oriented Programming" + 
                                                        "\\10. Exception Handling\\Lessons\\checked-exceptions\\greetings.txt");
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            
        } finally {
            System.out.println("Process complete!");
        }

    }
    
}