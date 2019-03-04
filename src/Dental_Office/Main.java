package Dental_Office;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    
    public static ArrayList<String> usernames = new ArrayList<>();
    public static ArrayList<String> passwords = new ArrayList<>();
    public static ArrayList<Appointment> appointments = new ArrayList<>();


    public static ArrayList<Appointment> finishedAppointments = new ArrayList<>(); 


    public static String[] inventory = {"Surgical Masks", "Nitrile Gloves", "Molding Clay", "Dental Wire", "Dental Elastics", "Cotton Balls", "Floss", "Filling Metal"};
    public static int[] stocks = {};
    public static double[] prices = {};
    public static double clinicMoney;
    
    public static ArrayList<Employee> employees = new ArrayList<>(); 
    
    public static SelectionWindow sw;
    
    public static void main(String[] args) {
        loadAppointFile("Current Appointment List.txt", appointments);
        employees.add(new Dentist("John Hammerstein", "MD", 12000));
        employees.add(new Secretary("Jane Doe", 4, 7000));
        employees.add(new Dentist("Stacy Lue", "Phd", 15000));
        usernames.add("sec");
        passwords.add("ret");
        usernames.add("dent");
        passwords.add("ist");
        usernames.add("admin");
        passwords.add("admin");
        

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                sw = new SelectionWindow();
            }
        });
    }
    
        public static void loadAppointFile(String filename, ArrayList<Appointment> tempList) {

        String temp = "";

        try {

            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {

                temp = file.readLine();
                String tempArray[] = temp.split(",");

                //the next line is customized for whatever class you are creating.
                tempList.add(new Appointment(tempArray[0], Integer.parseInt(tempArray[1]), Integer.parseInt(tempArray[2]), tempArray[3], Integer.parseInt(tempArray[4]), Integer.parseInt(tempArray[5]), Integer.parseInt(tempArray[6]), tempArray[7]));

            }//End while

        } catch (IOException e) {

            System.out.println(e);

        }//End catch

    }//End loadFile
//
        
//    //You will need to change the type of the arraylist here   ↓
    public static void saveAppointFile(String filename, ArrayList<Appointment> tempList) {

        try {

            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {

                //the next lines are customized for whatever data you are getting.
                String toSave = "";
                toSave = tempList.get(i).getPName();
                toSave += "," + tempList.get(i).getDName();
                toSave += "," + tempList.get(i).getProcedure();
                toSave += "," + tempList.get(i).getTime();
                toSave += "," + tempList.get(i).getDay();
                toSave += "," + tempList.get(i).getMonth();
                toSave += "," + tempList.get(i).getYear();
                toSave += "," + tempList.get(i).getDetails();

                file.println(toSave);

            }//End for loop

            file.close();

        } catch (IOException ex) {

            System.out.println(ex.toString());

        }//End catch

    }//End saveFile
    
            public static void loadEmployeeFile(String filename, ArrayList<Employee> tempList) {

        String temp = "";

        try {

            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {

                temp = file.readLine();
                String tempArray[] = temp.split(",");

                //the next line is customized for whatever class you are creating.
                tempList.add(new Employee(tempArray[0], tempArray[1], Double.parseDouble(tempArray[2])));

            }//End while

        } catch (IOException e) {

            System.out.println(e);

        }//End catch

    }//End loadFile
//
        
//    //You will need to change the type of the arraylist here   ↓
    public static void saveEmployeeFile(String filename, ArrayList<Employee> tempList) {

        try {

            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {

                //the next lines are customized for whatever data you are getting.
                String toSave = "";
                toSave = tempList.get(i).getName();
                toSave += "," + tempList.get(i).getPosition();
                toSave += "," + tempList.get(i).getSalary();

                file.println(toSave);

            }//End for loop

            file.close();

        } catch (IOException ex) {

            System.out.println(ex.toString());

        }//End catch

    }//End saveFile
}
