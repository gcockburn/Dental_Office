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
    
    public static ArrayList<Employee> employees = new ArrayList<>(); 
    
    public static SelectionWindow sw;
    
    public static void main(String[] args) {
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
//        public static void loadFile(String filename, ArrayList tempList) {
//
//        String temp = "";
//
//        try {
//
//            BufferedReader file = new BufferedReader(new FileReader(filename));
//            while (file.ready()) {
//
//                temp = file.readLine();
//                String tempArray[] = temp.split(",");
//
//                //the next line is customized for whatever class you are creating.
//                tempList.add(new FirstEdition(tempArray[0], tempArray[1],
//                        Integer.parseInt(tempArray[2]), Integer.parseInt(tempArray[3]),
//                        Integer.parseInt(tempArray[4])));
//
//            }//End while
//
//        } catch (IOException e) {
//
//            System.out.println(e);
//
//        }//End catch
//
//    }//End loadFile
//
//    //You will need to change the type of the arraylist here   ↓
//    public static void saveFile(String filename, ArrayList<Employee> tempList) {
//
//        try {
//
//            PrintWriter file = new PrintWriter(new FileWriter(filename));
//
//            for (int i = 0; i < tempList.size(); i++) {
//
//                //the next lines are customized for whatever data you are getting.
//                String toSave = "";
//                toSave = tempList.get(i).name;
//                toSave += "," + tempList.get(i).wheelType;
//                toSave += "," + tempList.get(i).toyNum;
//                toSave += "," + tempList.get(i).numIn2003;
//                toSave += "," + tempList.get(i).seriesNum;
//                toSave += "," + tempList.get(i).retailPrice;
//
//                file.println(toSave);
//
//            }//End for loop
//
//            file.close();
//
//        } catch (IOException ex) {
//
//            System.out.println(ex.toString());
//
//        }//End catch
//
//    }//End saveFile
}
