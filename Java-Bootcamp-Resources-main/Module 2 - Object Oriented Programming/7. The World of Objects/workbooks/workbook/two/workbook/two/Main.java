package workbook.two;

public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Mpilo", "African", "July 19th", 7);

        person.setName("Melusi");
        person.setNationality("South African");
        
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality()
                            + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " 
                            + person.getSeatNumber() + "\n");

    }
  
  
}
