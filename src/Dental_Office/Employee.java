package Dental_Office;

public class Employee {
    
    private String name;
    protected String position;
    private double salary;
    
    public Employee(String n, String pos, double sal) {
        
        name = n;
        position = pos;
        salary = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
