import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PatientRegistrationSystemApp extends JFrame implements ActionListener {
    private
     JTextField
            firstNameField, lastNameField, ageField, genderField, birthdayField, allergyField, addressField,
            contactNumberField, patientIDField, emailField, passwordField;

    public PatientRegistrationSystemApp() {
        setTitle("Patient Registration System");
        setSize(800, 690);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12, 4));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        JLabel genderLabel = new JLabel("Gender:");
        genderField = new JTextField();
        JLabel birthdayLabel = new JLabel("Birthday (dd/mm/yyyy):");
        birthdayField = new JTextField();
        JLabel allergyLabel = new JLabel("Allergies:");
        allergyField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        JLabel contactNumberLabel = new JLabel("Contact Number:");
        contactNumberField = new JTextField();
        JLabel patientIDLabel = new JLabel("ID Number:");
        patientIDField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(this);

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(genderField);
        add(birthdayLabel);
        add(birthdayField);
        add(allergyLabel);
        add(allergyField);
        add(addressLabel);
        add(addressField);
        add(contactNumberLabel);
        add(contactNumberField);
        add(patientIDLabel);
        add(patientIDField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(registerButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PatientRegistrationSystemApp();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Register")) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = genderField.getText();
            int birthday =Integer.parseInt(birthdayField.getText());
            String allergy = allergyField.getText();
            String address = addressField.getText();
            int contactNumber = Integer.parseInt(contactNumberField.getText());
            int identificationNumber = Integer.parseInt(patientIDField.getText());
            String email = emailField.getText();
            String password = passwordField.getText();

            String patientInfo = "Name: " + firstName + " " + lastName + "\n" +
                    "Age: " + age + "\n" +
                    "Gender: " + gender + "\n" +
                    "Birthday: " + birthday + "\n" +
                    "Allergies: " + allergy + "\n" +
                    "Address: " + address + "\n" +
                    "Contact Number: " + contactNumber + "\n" +
                    "Identification Number: " + identificationNumber + "\n" +
                    "Email: " + email + "\n" +
                    "Password: " + password;

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("patient_info.txt"));
                writer.write(patientInfo);
                writer.close();
                JOptionPane.showMessageDialog(this, "Registration Complete! Patient information saved to file.");
                clearFields();
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error saving patient information to file.");
            }
        }
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        genderField.setText("");
        birthdayField.setText("");
        allergyField.setText("");
        addressField.setText("");
        contactNumberField.setText("");
        patientIDField.setText("");
        emailField.setText("");
        passwordField.setText("");
    }
}