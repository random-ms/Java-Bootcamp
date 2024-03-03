import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Creating Stream from Datasource: Array
        String[] greetings = new String[]{"Hello!", "Hola!", "Bonjour!", "Hallo!"};
        Arrays.stream(greetings).forEach(x -> System.out.println(x));

        System.out.println("\n");

        // Creating Stream from Datasource: File
        String path1 = "Java-Bootcamp-Resources-main\\Module 2 - Object Oriented Programming\\16. Higher Order Functions\\Lessons\\Lesson Six\\";
        try {
            Path path = Paths.get(path1 + "chorus.txt");
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}