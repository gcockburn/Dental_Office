package Dental_Office;

public class Appointment {
    
    private String patientName;
    private String dentistName;
    private String procedure;
    private int day;
    private int month;
    private int year;
    private String details;
    private boolean checkedIn;
    
    public Appointment(String pn, String p, int d, int m, int y, String det) {
        
        patientName = pn;
        procedure = p;
        day = d;
        month = m;
        year = y;
        details = det;
        checkedIn = false;
    }
    
    public String getPName() {
        return patientName;
    }
    
    public String getDName() {
        return dentistName;
    }
    
    public String getProcedure() {
        return procedure;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }

    public void setPatientName(String pn) {
        patientName = pn;
    }

    public void setDentistName(String dn) {
        dentistName = dn;
    }

    public void setProcedure(String p) {
        procedure = p;
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }
    
    
    
    public void checkIn() {
        checkedIn = true;
    }
}
