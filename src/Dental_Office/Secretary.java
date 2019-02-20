package Dental_Office;

public class Secretary extends Employee{
    
    private int yearsExp;
    
    public Secretary(String n, int exp, double sal) {
        
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
