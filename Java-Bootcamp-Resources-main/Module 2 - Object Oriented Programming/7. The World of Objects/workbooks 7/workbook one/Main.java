package workbook.7;
public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.name = "Mr Simamane";
        person.nationality = "South African";
        person.dateOfBirth = "19 July 0000";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 5;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.dateOfBirth);
        System.out.println(Arrays.toString(person.passport));
        System.out.println(person.seatNumber);
            
    }

    

}
