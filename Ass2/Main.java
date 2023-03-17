package Q10;

public class Main {
    public static void main(String[] args)
    {
        Person a = new Person("Mido");
        Employee b = new Employee("Batrak");
        Student c = new Student("Timo");
        Staff d = new Staff("Ali");
        Faculty e = new Faculty("AboOmar");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
    }
}
