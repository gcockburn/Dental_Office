package Dental_Office;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MakeAppointment extends JFrame {

    public MakeAppointment() {

        setTitle("Make Appointment");
        setResizable(false);
        setVisible(true);

        initComponents();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        aDentist.removeAllItems();
        for (int i = 0; i < Main.employees.size(); i++) {
            if(Main.employees.get(i) instanceof Dentist) {
                aDentist.addItem(Main.employees.get(i).getName());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        patientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aMonth = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        aYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aDay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aProcedure = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        aDentist = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aDetails = new javax.swing.JTextArea();
        createApp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        aTime = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Year:");

        aMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October ", "November", "December" }));

        jLabel3.setText("Month:");

        jLabel4.setText("Day: ");

        jLabel5.setText("Procedure to be performed:");

        aProcedure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tooth Cleaning", "Filling", "Crowning", "Wisdom Teeth Removal", "Braces Checkup", "Braces Removal", "Braces Implementation" }));

        jLabel6.setText("Assigned Dentist");

        aDentist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John Hammerstein" }));
        aDentist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aDentistActionPerformed(evt);
            }
        });

        jLabel7.setText("Details: ");

        aDetails.setColumns(20);
        aDetails.setRows(5);
        jScrollPane1.setViewportView(aDetails);

        createApp.setText("Create Appointment");
        createApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAppActionPerformed(evt);
            }
        });

        jLabel8.setText("Time:");

        aTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(aDay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(aMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(aYear, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(patientName)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aDentist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(createApp)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aTime, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(aTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(aMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(aYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(aProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(aDentist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createApp)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAppActionPerformed
        int error = 0;

        for (int i = 0; i < Main.appointments.size(); i++) {
            if (Integer.parseInt(aYear.getText()) == (Main.appointments.get(i).getYear())) {
                if (aMonth.getSelectedIndex() == Main.appointments.get(i).getMonth()) {
                    if (Integer.parseInt(aDay.getText()) == (Main.appointments.get(i).getDay())) {
                        if (aTime.getText().equals(Main.appointments.get(i).getTime())) {
                            if (aDentist.getSelectedIndex() == Main.appointments.get(i).getDName()) {
                                JOptionPane.showMessageDialog(null, "Error: Dentist already booked", "error", 0);
                                error = 1;
                            }
                        }
                    }
                }
            }
        }//really long for loop for checking if appointments overlap
        if (error == 0) {
            if (!patientName.getText().equals("") && (Integer.parseInt(aDay.getText()) != 0 && !aDay.getText().equals("")) && (Integer.parseInt(aYear.getText()) != 0 && !aYear.getText().equals("")) && !aTime.getText().equals("")) {
                Main.appointments.add(new Appointment(patientName.getText(), aDentist.getSelectedIndex(), aProcedure.getSelectedIndex(), aTime.getText(), Integer.parseInt(aDay.getText()), aMonth.getSelectedIndex(), Integer.parseInt(aYear.getText()), aDetails.getText()));
                Main.sw.lw.aw.appointList.removeAppoint();
                Main.sw.lw.aw.appointList.updateList();
            }
        }
    }//GEN-LAST:event_createAppActionPerformed

    private void aTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aTimeActionPerformed

    private void aDentistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aDentistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aDentistActionPerformed
    private void Error_Message(int type) {
        JOptionPane.showMessageDialog(null, "Incorrect username or password.", "error", 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aDay;
    private javax.swing.JComboBox<String> aDentist;
    private javax.swing.JTextArea aDetails;
    private javax.swing.JComboBox<String> aMonth;
    private javax.swing.JComboBox<String> aProcedure;
    private javax.swing.JTextField aTime;
    private javax.swing.JTextField aYear;
    private javax.swing.JButton createApp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField patientName;
    // End of variables declaration//GEN-END:variables
}
