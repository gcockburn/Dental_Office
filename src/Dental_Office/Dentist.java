package Dental_Office;

public class Dentist {
    private String name;
    private String Degrees;
    private double salary;
    private double satisfaction; 
    
    public Dentist(String n, String D, double sal, double sat) {
        name = n;
        Degrees = D;
        salary = sal;
        satisfaction = sat; 
    }
    
    public String getName(){
        return name; 
    }
    public String getDegrees(){
        return Degrees; 
    }
    public double getSalary(){
        return salary;
    }
    public double getSatisfaction(){
        return satisfaction; 
    }
}
