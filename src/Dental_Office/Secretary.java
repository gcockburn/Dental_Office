package Dental_Office;

public class Secretary extends Employee{
    
    private int yearsExp;
    
    public Secretary(String n, double sal, int exp) {
        
        super(n, "Secretary", sal);
        
        yearsExp = exp;
    }

    public int getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(int yearsExp) {
        this.yearsExp = yearsExp;
    }
}
