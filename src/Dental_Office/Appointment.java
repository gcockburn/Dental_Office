package Dental_Office;

public class Appointment {
    
    private String patientName;
    private String dentistName;
    private String procedure;
    private int day;
    private int month;
    private int year;
    private boolean checkedIn;
    
    public Appointment(String pn) {
        
        patientName = pn;
        checkedIn = false;
    }
    
    public void checkIn() {
        checkedIn = true;
        System.out.println("Checked In");
    }
}
