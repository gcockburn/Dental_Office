package Dental_Office;

import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Main {
    
    public static ArrayList<String> usernames = new ArrayList();
    public static ArrayList<String> passwords = new ArrayList();
    public static ArrayList<Appointment> appointments = new ArrayList();
    
    public static void main(String[] args) {
<<<<<<< HEAD
        appointments.add(new Appointment("Elliot Gam", "John Hammerstein", "Tooth Cleaning", 23, "October", 2019, "" ));
=======
        //appointments.add(new Appointment("Elliot Gam", ));
>>>>>>> 53dd836ec8cfefd7709df57ca0f66023e73dc89a
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
