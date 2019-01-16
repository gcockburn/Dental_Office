package Dental_Office;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {
    
    public static ArrayList<String> usernames = new ArrayList();
    public static ArrayList<String> passwords = new ArrayList();
    public static ArrayList<Appointment> appointments = new ArrayList();
    
    public static void main(String[] args) {
        //appointments.add(new Appointment("Elliot Gam", ));
        usernames.add("sec");
        passwords.add("ret");
        usernames.add("dent");
        passwords.add("ist");
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginWindow();
            }
        });
    }
    
}
