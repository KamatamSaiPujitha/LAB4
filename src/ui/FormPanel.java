package ui;


import java.awt.CardLayout;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author pooja
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel1
     */
    private JPanel BottomPanel;
    private String filename;
    public FormPanel(JPanel inputPanel) {
        initComponents();
        this.BottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        patientRegistrationForm = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        patientType = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        typeDropdown = new javax.swing.JComboBox<>();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        othersButton = new javax.swing.JRadioButton();
        message = new javax.swing.JLabel();
        messageScrollPane = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        uploadPhotoButton = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        fnError = new javax.swing.JLabel();
        lnError = new javax.swing.JLabel();
        ageError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        imagepath = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        patientRegistrationForm.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        patientRegistrationForm.setForeground(new java.awt.Color(51, 51, 51));
        patientRegistrationForm.setText("FORM PANEL");

        firstName.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        firstName.setForeground(new java.awt.Color(51, 51, 51));
        firstName.setText("FIRST NAME");

        lastName.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lastName.setForeground(new java.awt.Color(51, 51, 51));
        lastName.setText("LAST NAME");

        age.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        age.setForeground(new java.awt.Color(51, 51, 51));
        age.setText("AGE");

        email.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setText("EMAIL ID");

        patientType.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        patientType.setForeground(new java.awt.Color(51, 51, 51));
        patientType.setText("TYPE");

        gender.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(51, 51, 51));
        gender.setText("GENDER");

        firstNameField.setBackground(new java.awt.Color(255, 255, 204));
        firstNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyReleased(evt);
            }
        });

        lastNameField.setBackground(new java.awt.Color(255, 255, 204));
        lastNameField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyReleased(evt);
            }
        });

        ageField.setBackground(new java.awt.Color(255, 255, 204));
        ageField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageFieldKeyReleased(evt);
            }
        });

        emailField.setBackground(new java.awt.Color(255, 255, 204));
        emailField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        typeDropdown.setBackground(new java.awt.Color(255, 255, 204));
        typeDropdown.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        typeDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEW USER", "EXISTING USER", " ", " " }));
        typeDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeDropdownActionPerformed(evt);
            }
        });

        maleButton.setBackground(new java.awt.Color(255, 255, 204));
        maleButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        maleButton.setForeground(new java.awt.Color(51, 51, 51));
        maleButton.setText("MALE");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setBackground(new java.awt.Color(255, 255, 204));
        femaleButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        femaleButton.setForeground(new java.awt.Color(51, 51, 51));
        femaleButton.setText("FEMALE");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        othersButton.setBackground(new java.awt.Color(255, 255, 204));
        othersButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        othersButton.setForeground(new java.awt.Color(51, 51, 51));
        othersButton.setText("NOT PREFERRED");

        message.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(51, 51, 51));
        message.setText("MESSAGE");

        messageArea.setBackground(new java.awt.Color(255, 255, 204));
        messageArea.setColumns(20);
        messageArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        messageArea.setRows(5);
        messageScrollPane.setViewportView(messageArea);

        uploadPhotoButton.setBackground(new java.awt.Color(255, 255, 204));
        uploadPhotoButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        uploadPhotoButton.setText("UPLOAD PHOTO");
        uploadPhotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoButtonActionPerformed(evt);
            }
        });

        photo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        photo.setForeground(new java.awt.Color(51, 51, 51));
        photo.setText("PHOTO");

        submitButton.setBackground(new java.awt.Color(255, 255, 204));
        submitButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        fnError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        fnError.setForeground(new java.awt.Color(255, 0, 0));

        lnError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lnError.setForeground(new java.awt.Color(255, 0, 0));

        ageError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ageError.setForeground(new java.awt.Color(255, 0, 0));

        emailError.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailError.setForeground(new java.awt.Color(255, 0, 0));

        imagepath.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleButton)
                                        .addGap(27, 27, 27)
                                        .addComponent(femaleButton))
                                    .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fnError, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                            .addComponent(lnError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(patientType, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(othersButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(ageError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(patientRegistrationForm)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadPhotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(patientRegistrationForm)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnError)
                    .addComponent(lastName)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientType)
                    .addComponent(typeDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnError)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(maleButton)
                    .addComponent(femaleButton)
                    .addComponent(othersButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ageError)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailError)
                            .addComponent(message))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(photo)
                            .addComponent(uploadPhotoButton)))
                    .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(134, 134, 134)
                .addComponent(imagepath)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void firstNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(firstNameField.getText());
        if(!match.matches()){
            fnError.setText("ENTER ONLY ALPHABETS!");
        }
        else
        {
            fnError.setText(null);
        }
    }//GEN-LAST:event_firstNameFieldKeyReleased

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void lastNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(lastNameField.getText());
        if(!match.matches()){
            lnError.setText("ENTER ONLY ALPHABETS!");
        }
        else
        {
            lnError.setText(null);
        }
    }//GEN-LAST:event_lastNameFieldKeyReleased

    private void ageFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(ageField.getText());
        if(!match.matches()){
            ageError.setText("ENTER ONLY NUMBERS!");
        }
        else
        {
            ageError.setText(null);
        }
    }//GEN-LAST:event_ageFieldKeyReleased

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(emailField.getText());
        if(!match.matches()){
            emailError.setText("ENTER VALID EMAIL ID!");
        }
        else
        {
            emailError.setText(null);
        }
    }//GEN-LAST:event_emailFieldKeyReleased

    private void typeDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeDropdownActionPerformed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void uploadPhotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("image" , "png" , "jpg" , "jpeg");
        chooser.addChoosableFileFilter(fnef);
        int showOpenDialogue = chooser.showOpenDialog(null);

        if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = chooser.getSelectedFile();
            filename = selectedImageFile.getAbsolutePath();
            imagepath.setText(filename);
        }
    }//GEN-LAST:event_uploadPhotoButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        newUser.setFirstname(firstNameField.getText());
        newUser.setLastname(lastNameField.getText());
        newUser.setAge(ageField.getText());
        newUser.setEmail(emailField.getText());
        newUser.setType(typeDropdown.getSelectedItem().toString());
        newUser.setMessage(messageArea.getText());
        newUser.setFilename(filename);

        if(maleButton.isSelected()==true){
            newUser.setGender("Male");
        }
        else if(femaleButton.isSelected()==true)
        {
            newUser.setGender("Female");
        }
        else{
            newUser.setGender("Others");
        }

        ViewPanel newViewPanel = new ViewPanel(newUser);
        BottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) BottomPanel.getLayout();
        layout.next(BottomPanel);
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel ageError;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailError;
    private javax.swing.JTextField emailField;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel fnError;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel imagepath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lnError;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel message;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JRadioButton othersButton;
    private javax.swing.JLabel patientRegistrationForm;
    private javax.swing.JLabel patientType;
    private javax.swing.JLabel photo;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> typeDropdown;
    private javax.swing.JButton uploadPhotoButton;
    // End of variables declaration//GEN-END:variables
}
