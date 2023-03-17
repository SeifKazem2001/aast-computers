package Q10;

public class Student extends Person{
    String Class;
    final String[] Status = new String []{"freshman", "sophomore", "junior", "senior"};

    public Student(String name, String address, int number, String email, String aClass) {
        super(name, address, number, email);
        Class = aClass;
    }
    public Student(String Name)
    {
        super(Name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
