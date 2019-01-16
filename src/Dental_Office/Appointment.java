package Dental_Office;

public class Appointment {
    
    private String patientName;
    private int dentist;
    private int procedure;
    private String time;
    private int day;
    private int month;
    private int year;
    private String details;
    private boolean checkedIn;
    
    public Appointment(String pn, int dn, int p, String t, int d, int m, int y, String det) {
        
        patientName = pn;
        dentist = dn;
        procedure = p;
        time= t;
        day = d;
        month = m;
        year = y;
        details = det;
        checkedIn = false;
    }
    
    public String getPName() {
        return patientName;
    }
    
    public int getDName() {
        return dentist;
    }
    
    public int getProcedure() {
        return procedure;
    }
    
    public String getTime() {
        return time;
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
    
    public String getDetails() {
        return details;
    }

    public void setPatientName(String pn) {
        patientName = pn;
    }

    public void setDentistName(int dn) {
        dentist = dn;
    }

    public void setProcedure(int p) {
        procedure = p;
    }
    
    public void setTime(String t) {
        time = t;
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
    
    public void setDetails(String d) {
        details = d;
    }
    
    public void checkIn() {
        checkedIn = true;
    }
}
