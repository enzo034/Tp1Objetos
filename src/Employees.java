public class Employees
{

    private int dni;
    private String name;
    private String surname;
    private double salary;

    public Employees(int dni, String name, String surname, double salary)
    {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setDni(int dni1)
    {
        this.dni = dni1;
    }
    public void setName(String name1)
    {
        this.name = name1;
    }
    public void setSurname(String surname1)
    {
        this.surname = surname1;
    }
    public void setSalary(double salary1)
    {
        this.salary = salary1;
    }

    public int getDni() { return dni; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getSalary() { return salary; }


    public double riseSalary(double percentage)
    {
        percentage = percentage * (1.0/100.0) + 1;

        return salary*percentage;
    }

    public double annualSalary()
    {
        return salary*12;
    }

    public void showDataEmployee()
    {
        System.out.println("\nEmployee[DNI = " + dni + ", Name = " + name + ", Surname = " + surname + ", Salary = " + salary + "]");
    }

}