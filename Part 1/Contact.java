public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01", 33);
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02", 31);
        Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03", 29);
        Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04", 27);

        Contact copyContact1 = new Contact(contact1);
        Contact copyContact2 = new Contact(contact3);
    
    }
    
}
