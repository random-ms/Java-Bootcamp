import java.util.Scanner;

//import Scanner

public class Chatbot {
    public static void main(String[] args) {
    

        Scanner scan = new Scanner(System.in);
        //set up scanner. 

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();
  
        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = scan.nextLine();
                        

        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();


        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm " + (400/(double)age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        scan.nextLine();
        String langauage = scan.nextLine(); 

        //add new a line here.
        System.out.println("\n" + langauage + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
    
        scan.close();
        //close scanner. 
    }
}
