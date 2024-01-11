public class Airline {
    
    Person[] people;

    public Airline(){
        this.people = new Person[11];
    }

    public Person getPerson(int index){
        Person person = this.people[index];
        return new Person(person); 
    }

    public void setPerson(Person person){
      int index = person.getSeatNumber() - 1;
      this.people[index] = new Person(person);
    }

}
