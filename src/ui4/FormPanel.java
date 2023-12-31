/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui4;

import javax.swing.JOptionPane;

/**
 *
 * @author bahatizhuliduosi
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    public FormPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        MessageLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        LastNameTextField = new javax.swing.JTextField();
        AgeTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MessageTextArea = new javax.swing.JTextArea();
        SubmitButton = new javax.swing.JButton();
        GenderLabel = new javax.swing.JLabel();
        MaleRadio = new javax.swing.JRadioButton();
        FemaleRadio = new javax.swing.JRadioButton();
        NotMentionedRadio = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(700, 443));

        mainPanel.setBackground(new java.awt.Color(102, 204, 0));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Customer Registration Form");

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        AgeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AgeLabel.setText("Age");

        EmailLabel.setText("Email");

        MessageLabel.setText("Message");

        FirstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextFieldActionPerformed(evt);
            }
        });

        MessageTextArea.setColumns(20);
        MessageTextArea.setRows(5);
        jScrollPane1.setViewportView(MessageTextArea);

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        GenderLabel.setText("Gender");

        GenderGroup.add(MaleRadio);
        MaleRadio.setText("Male");
        MaleRadio.setActionCommand("MALE USER");
        MaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioActionPerformed(evt);
            }
        });

        GenderGroup.add(FemaleRadio);
        FemaleRadio.setText("Female");
        FemaleRadio.setActionCommand("FEMALE USER");

        GenderGroup.add(NotMentionedRadio);
        NotMentionedRadio.setText("Prefer not to say");
        NotMentionedRadio.setActionCommand("NOT SPECIFIED");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LastNameLabel)
                            .addComponent(FirstNameLabel)
                            .addComponent(AgeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(AgeTextField)
                                    .addComponent(LastNameTextField)
                                    .addComponent(EmailTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(MessageLabel))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FemaleRadio)
                                    .addComponent(MaleRadio)
                                    .addComponent(NotMentionedRadio)
                                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MessageLabel)
                                .addComponent(LastNameLabel))
                            .addComponent(LastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeLabel)
                            .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(MaleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FemaleRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NotMentionedRadio)
                .addGap(49, 49, 49)
                .addComponent(SubmitButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTextFieldActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        String FirstName = FirstNameTextField.getText();
        String LastName = LastNameTextField.getText();
        String Age = AgeTextField.getText();
        String Email = EmailTextField.getText();
        String Message = MessageTextArea.getText();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if(FirstName.equals("")|| LastName.equals("")|| Age.equals("")|| Email.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter ALL Used Information", "Blank Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!FirstName.matches("[a-zA-Z]+")&& (!LastName.matches("[a-zA-Z]+"))){
            JOptionPane.showMessageDialog(this,"Names must contain only alphabetical characters.","Validation Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (!Age.matches("\\d+")){
            JOptionPane.showMessageDialog(this,"Age must be a number.","Validation Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (Integer.parseInt(Age) <= 0 || Integer.parseInt(Age) > 120){

            JOptionPane.showMessageDialog(this,"Age must be a positive number between 1 and 120\n.","Validation Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (!Email.matches(emailRegex)){
            JOptionPane.showMessageDialog(this,"Enter a valid email address\n.","Validation Error",JOptionPane.ERROR_MESSAGE);
        }

        else {

            JOptionPane.showConfirmDialog(this,FirstName + "  " +LastName+ "  "+Age+ "  "+Email+"  "+ Message , "User Information", HEIGHT);}

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void MaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleRadioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleRadio;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.ButtonGroup GenderGroup;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTextField;
    private javax.swing.JRadioButton MaleRadio;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JTextArea MessageTextArea;
    private javax.swing.JRadioButton NotMentionedRadio;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
