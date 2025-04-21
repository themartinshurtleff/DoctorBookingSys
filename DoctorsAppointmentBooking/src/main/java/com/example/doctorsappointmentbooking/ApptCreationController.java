/**
 * @author Daniel Novak
 * Date: 4/16/2025
 * Course: CSC-331-003
 * Purpose: This is the controller for ApptCreationScreen.
 * It will get appointment data from the user for a potential new appointment.
 */

package com.example.doctorsappointmentbooking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApptCreationController implements Initializable {

    @FXML
    private ChoiceBox<String> cbxApptLocation;

    @FXML
    private ChoiceBox<String> cbxApptType;

    @FXML
    private ChoiceBox<Doctor> cbxDoctorType;

    @FXML
    private DatePicker dteDate;

    @FXML
    private TextField txtTime;

    @FXML
    private Label lblError;

    // Variables for scene switching
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Upon clicking the back button, the program returns back to the main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    void onBackBtnClick(ActionEvent event) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenuScreen.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            System.out.println("ERROR: FXML file not found!");
        }
    }

    /**
     * Upon clicking the "Continue" button, the program will try to get appointment data
     * provided by the user from the controls. If all data is provided, it is passed
     * onto ApptConfirmScreen.
     * @param event
     * @throws IOException
     */
    @FXML
    void onContinueBtnClick(ActionEvent event) throws IOException{
        try {
            // Get appointment data provided by the user
            String locationSelected = cbxApptLocation.getValue();
            String typeSelected = cbxApptType.getValue();
            Doctor docSelected = cbxDoctorType.getValue();
            String dateSelected = dteDate.getValue().toString();
            String timeSelected = txtTime.getText();

            // Check to make sure that the time provided by the user contains
            // AM or PM.
            // If it does not, throw an IllegalArgumentException error.
            if (!(timeSelected.contains("AM") || timeSelected.contains("PM"))){
                throw new IllegalArgumentException();
            }

            // Next, check to make sure that user provided the appropriate data
            // If at least one spot is empty, throw an NullPointerException error.
            if (locationSelected.isEmpty() || typeSelected.isEmpty() || docSelected.toString().isEmpty() ||
                dateSelected.isEmpty() || timeSelected.isEmpty()){
                throw new NullPointerException();
            }

            // If the data provided has no errors, load ApptConfirmScreen, passing the provided data
            // onto that screen for appointment confirmation.
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ApptConfirmScreen.fxml"));
            root = loader.load();
            ApptConfirmController confirmControl = loader.getController();
            confirmControl.displayApptInfo(locationSelected, typeSelected, docSelected, dateSelected, timeSelected);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (NullPointerException e) {
            // If a piece of appointment information is missing, display the error message
            // in lblError.
            lblError.setText("ERROR: Please provide all appointment details.");
            lblError.setVisible(true);
        } catch (IllegalArgumentException e){
            // If the time provided did not specify AM or PM, display the error message
            // in lblError.
            lblError.setText("ERROR: Time provided must contain either AM or PM.");
            lblError.setVisible(true);
        } catch (IOException e){
            System.out.println("ERROR: FXML file not found!");
        }
    }

    /**
     * Upon creation of the ApptCreationScreen, populate the choiceboxes with data.
     * @param url
     * @param bund
     */
    @Override
    public void initialize(URL url, ResourceBundle bund){

        // Populate choiceboxes with data regarding where patients can schedule appointments
        // and what appointment types they can choose from
        cbxApptLocation.getItems().addAll("In-person", "Virtual");
        cbxApptType.getItems().addAll("New Patient Establishment", "Physical Exam", "Medical Test", "Urgent Care", "Consultation");

        // Populate the doctors choicebox with names of doctors currently within doctorsList
        Doctor currentDoctor;
        for (int i=0; i<ProgramData.doctorsList.size(); i++){
            currentDoctor = ProgramData.doctorsList.get(i);
            cbxDoctorType.getItems().add(currentDoctor);
        }

        // Upon this screen being loaded, set the error label to be invisible
        lblError.setVisible(false);
    }
}
