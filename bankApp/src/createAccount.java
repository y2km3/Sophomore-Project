import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class createAccount extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
  
    public createAccount() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        street = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        zipCode = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        contactNumber = new javax.swing.JLabel();
        firstField = new javax.swing.JTextField();
        lastField = new javax.swing.JTextField();
        dateOfBirthField = new javax.swing.JTextField();
        streetField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        stateField = new javax.swing.JTextField();
        countryField = new javax.swing.JTextField();
        zipCodeField = new javax.swing.JTextField();
        contactNumberField = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        createButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        middle = new javax.swing.JLabel();
        middleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pinField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setText("Create an Account");

        first.setText("First:");

        last.setText("Last:");

        street.setText("Street:");

        dateOfBirth.setText("Date of Birth (yyyy-mm-dd):");

        city.setText("City:");

        state.setText("State:");

        country.setText("Country:");

        zipCode.setText("Zip Code:");

        gender.setText("Gender:");

        contactNumber.setText("Contact Number:");

        countryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryFieldActionPerformed(evt);
            }
        });

        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setText("Female");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Return to Login Page");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        email.setText("Email:");

        password.setText("Password:");

        middle.setText("Middle:");

        jLabel1.setText("4 Digit Pin:");

        pinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(street)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(streetField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(city)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(country)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(countryField)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(zipCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zipCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(state)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stateField))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateOfBirthField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(contactNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactNumberField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(password)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(first)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(title))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maleButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(femaleButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(last)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(middle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(middleField)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(createButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first)
                    .addComponent(firstField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(middle)
                    .addComponent(middleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last)
                    .addComponent(lastField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street)
                    .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(state)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country)
                    .addComponent(zipCode)
                    .addComponent(countryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(maleButton)
                    .addComponent(femaleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactNumber)
                    .addComponent(contactNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        femaleButton.setSelected(false);           
    }//GEN-LAST:event_maleButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        bankLogin login = new bankLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void countryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryFieldActionPerformed

    }//GEN-LAST:event_countryFieldActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        // establish connection with database 
        conn = mySQLConnect.ConnectDB();
        
        // first query, create a row that inserts the following information from the user form
        String insertAccount = "Insert into Bank.Account (firstName, middleName, lastName, dateOfBirth, street, city, state, country, "
                + "zipCode, gender, contactNumber, email, password)" 
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        String insertBank = "Insert into Bank.Bank (userID, pin) values (?, ?)";
        
        // conditional string used for gender
        String g; 
        // int used to indicate missing fields
        int y = 0;
       
        //<editor-fold defaultstate="collapsed" desc="conditional statements used to indicate missing fields">
            if (firstField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter first name.");
            }
            if (middleField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter middle name.");
            }
            if (lastField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter last name.");
            }
            if (dateOfBirthField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter date of birth.");
            }
            if (streetField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter street.");
            }
            if (cityField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter city.");
            }
            if (stateField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter state.");
            }
            if (countryField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter country.");
            }
            if (zipCodeField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter zip code.");
            }
            if (!maleButton.isSelected() && !femaleButton.isSelected()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null, "Please select a gender.");
            }
            if (contactNumberField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter a contact number.");
            }
            if (emailField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter an email.");
            }
            if (passwordField.getText().trim().isEmpty()) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Enter a password.");
            }
            if (pinField.getDocument().getLength() != 4) {
                y =+ 1;
                JOptionPane.showMessageDialog(null,"Please enter a 4 digit pin.");
            }
        //</editor-fold>
        
        // in the case that all fields are filled
        if (y == 0) {
            try {
                // a prepared statement (query) that will be generated with the established connection that uses the the "Sql" string
                PreparedStatement preparedStmt = conn.prepareStatement(insertAccount, Statement.RETURN_GENERATED_KEYS);
                
                // parameters being set for the ? in the "Sql" string
                preparedStmt.setString (1, firstField.getText());
                preparedStmt.setString (2, middleField.getText());
                preparedStmt.setString (3, lastField.getText());     
                Date sqldate = Date.valueOf(dateOfBirthField.getText());
                preparedStmt.setDate (4, sqldate);
                preparedStmt.setString (5, streetField.getText());
                preparedStmt.setString (6, cityField.getText());
                preparedStmt.setString (7, stateField.getText());
                preparedStmt.setString (8, countryField.getText());
                preparedStmt.setString (9, zipCodeField.getText());

                // conditional for deciding gender as sending it as a single char
                if(maleButton.isSelected())
                        g = "m";
                else g = "f";

                preparedStmt.setString (10, g);
                preparedStmt.setString (11, contactNumberField.getText());
                preparedStmt.setString (12, emailField.getText());
                preparedStmt.setString (13, passwordField.getText());
                
                // executes the finalized statement with the parameters inserted into the string
                preparedStmt.executeUpdate();
                
                ResultSet rs = preparedStmt.getGeneratedKeys();
                int id = 0;
                
                if(rs.next())
                    id = rs.getInt(1);
                    
                
                System.out.println(id);
                  
                PreparedStatement preparedStmt2 = conn.prepareStatement(insertBank);
                preparedStmt2.setInt (1, id);
                preparedStmt2.setInt (2, Integer.valueOf(pinField.getText()));
                
                preparedStmt2.executeUpdate();

                // message box informing user that their account has been created
                JOptionPane.showMessageDialog(null, "Accounted created!");
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_createButtonActionPerformed
   
    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        maleButton.setSelected(false);
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void pinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel contactNumber;
    private javax.swing.JTextField contactNumberField;
    private javax.swing.JLabel country;
    private javax.swing.JTextField countryField;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel first;
    private javax.swing.JTextField firstField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel last;
    private javax.swing.JTextField lastField;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel middle;
    private javax.swing.JTextField middleField;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField pinField;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel state;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel street;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel title;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
