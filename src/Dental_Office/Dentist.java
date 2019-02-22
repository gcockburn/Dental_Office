package Dental_Office;

public class Dentist extends Employee{
    
    private String Degrees;
    private double satisfaction;
    
    public Dentist(String n, String d, double sal) {
        
        super(n, "Dentist", sal);
        
        Degrees = d;
        satisfaction = 100; 
    }
    
    public String getDegrees(){
        return Degrees; 
    }
    
    public double getSatisfaction(){
        return satisfaction; 
    }

    public void setDegrees(String Degrees) {
        this.Degrees = Degrees;
    }

    public void setSatisfaction(double satisfaction) {
        this.satisfaction = satisfaction;
    }
}
