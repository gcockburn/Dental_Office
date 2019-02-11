package Dental_Office;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory; 
    
    public Patient(String n, int a, String mH) {
        name = n;
        age = a;
        medicalHistory = mH; 
    }
    
    public void chargeFees(){
        
    }
    public String getName(){
        return name; 
    }
    public int getAge(){
        return age; 
    }
    public String getHistory(){
        return medicalHistory; 
    }
}
