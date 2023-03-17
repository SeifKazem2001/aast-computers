package Q10;

import java.util.Date;

public class Employee extends Person{
    public Employee(String name, String address, int number, String email, String office, Date dateHired, Double salary) {
        super(name, address, number, email);
        Office = office;
        DateHired = dateHired;
        Salary = salary;
    }
    public Employee(String Name) {
        super(Name);
    }

    String Office;
    Date DateHired;
    Double Salary;

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
