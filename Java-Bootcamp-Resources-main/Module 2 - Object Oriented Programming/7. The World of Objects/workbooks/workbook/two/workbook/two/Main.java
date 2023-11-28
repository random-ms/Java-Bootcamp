package workbook.two;

public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Mpilo", "African", "July 19th", 7);
        
        System.out.println("Name: " + person.name + "\n" + "Nationality: " + person.nationality
                            + "\n" + "Date of Birth: " + person.dateOfBirth + "\n" + "Seat Number: " 
                            + person.seatNumber + "\n");

    }
  
  
}
