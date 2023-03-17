package Q10;

import java.util.Date;

public class Faculty extends Employee{
    int OfficeHours;
    String Rank;

    public Faculty(String name, String address, int number, String email, String office, Date dateHired, Double salary, int officeHours, String rank) {
        super(name, address, number, email, office, dateHired, salary);
        OfficeHours = officeHours;
        Rank = rank;
    }
    public Faculty(String Name)
    {
        super(Name);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
