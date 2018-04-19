/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18april12assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author rodrigolima
 */
public class EcouffController implements Initializable {

    @FXML
    private ComboBox<String> sportComboBox;
    @FXML
    private ComboBox<String> genderComboBox;
    @FXML
    private ComboBox<String> shiftComboBox;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField streetTextField;
    @FXML
    private TextField stateTextField;
    @FXML
    private TextField cityTextField;
    @FXML
    private TextField postalCodeTextField;
    @FXML
    private TextField studentNumberTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private DatePicker enterigDatePicker;
    @FXML
    private DatePicker dateofBirthDatePicker;
    @FXML
    private DatePicker dateEnrolledDatePicker;
    @FXML
    private CheckBox checkBox;
    @FXML
    private Label expLabel;

    public void createContactButtonPushed() throws IOException {

        try {
            if (checkBox.isSelected()) {
                
                /*Creating a new instance of File to write in a .txt */
                File file = new File("Athlete.txt");
                FileWriter escrever = new FileWriter(file, true);
                PrintWriter printar = new PrintWriter(escrever);
                
                /*If's so none of the fields it's empty when submitting */

                if (genderComboBox.getSelectionModel().isEmpty()) {
                    this.genderComboBox.setValue("");
                }

                if (sportComboBox.getSelectionModel().isEmpty()) {
                    this.sportComboBox.setValue("");
                }

                if (heightTextField.getText().isEmpty()) {
                    this.heightTextField.setText("0");
                }

                if (dateofBirthDatePicker.getValue() == null) {
                    this.dateofBirthDatePicker.setValue(LocalDate.now().plusDays(2));
                }

                if (enterigDatePicker.getValue() == null) {
                    this.enterigDatePicker.setValue(LocalDate.now().plusDays(2));
                }

                if (dateEnrolledDatePicker.getValue() == null) {
                    this.dateEnrolledDatePicker.setValue(LocalDate.now().plusDays(2));
                }
                
                /*Creating a new instance of Athlete class*/
                Athlete newAthlete = new Athlete(this.firstNameTextField.getText(),
                        this.lastNameTextField.getText(),
                        this.genderComboBox.getValue(),
                        this.shiftComboBox.getValue(),
                        this.sportComboBox.getValue(),
                        Integer.parseInt(this.heightTextField.getText()),
                        this.phoneTextField.getText(),
                        this.streetTextField.getText(),
                        this.stateTextField.getText(),
                        this.cityTextField.getText(),
                        this.postalCodeTextField.getText(),
                        this.enterigDatePicker.getValue(),
                        this.dateofBirthDatePicker.getValue(),
                        this.dateEnrolledDatePicker.getValue(),
                        this.studentNumberTextField.getText());

                /*Printing to a .txt file */
                
                printar.println(newAthlete.toString());
                printar.close();

                JOptionPane.showMessageDialog(null, "Athlete saved!");

            } else {
                throw new IllegalArgumentException("You should click in the check box");
            }
            
            /*Catching the exceptions*/
        } catch (IllegalArgumentException | FileNotFoundException e) {
            this.expLabel.setText(e.getMessage());
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        /* Filling the comboBox with data */

        List sports = Arrays.asList("Basketball", "Handball", "Volleyball", "Soccer", "Swimming", "Table Tennis");
        this.sportComboBox.getItems().addAll(sports);

        List gender = Arrays.asList("Male", "Female", "Other", "Prefer not to say");
        this.genderComboBox.getItems().addAll(gender);

        List shift = Arrays.asList("Morning", "Night");
        this.shiftComboBox.getItems().addAll(shift);

    }
}
