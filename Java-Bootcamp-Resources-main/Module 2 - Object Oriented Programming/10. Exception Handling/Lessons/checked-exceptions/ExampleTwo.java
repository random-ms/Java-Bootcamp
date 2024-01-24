import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {

        try{
            readFile("greetings.txt");
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process Complete!");
        }

    }
    
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("Java-Bootcamp-Resources-main\\Module 2 - Object Oriented Programming" + 
                                                        "\\10. Exception Handling\\Lessons\\checked-exceptions\\" + fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}