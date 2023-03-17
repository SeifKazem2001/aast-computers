package Q10;

public class Person {
    String Name;
    String Address;
    int Number;
    String Email;

    public Person() {
    }
    public Person(String name) {
        Name = name;
    }

    public Person(String name, String address, int number, String email) {
        Name = name;
        Address = address;
        Number = number;
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
