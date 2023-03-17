package Q10;

import java.util.Date;

public class Staff extends Employee{
    String Title;

    public Staff(String name, String address, int number, String email, String office, Date dateHired, Double salary, String title) {
        super(name, address, number, email, office, dateHired, salary);
        Title = title;
    }
    public Staff(String name)
    {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
