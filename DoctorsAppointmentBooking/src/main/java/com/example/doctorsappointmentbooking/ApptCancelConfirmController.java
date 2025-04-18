/**
 * @author Daniel Novak, [NAME HERE]
 * Date: 4/17/2025
 * Course: CSC-355-003
 * Purpose: This is the controller for ApptCancelConfirmScreen. It handles the actual cancellation of
 * appointments, thereby removing the appointment from apptsList.
 */

package com.example.doctorsappointmentbooking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ApptCancelConfirmController {

    @FXML
    private Label lblDate;

    @FXML
    private Label lblDoctor;

    @FXML
    private Label lblLocation;

    @FXML
    private Label lblTime;

    @FXML
    private Label lblType;

    // Variables to hold appointment info
    private String apptLocation;
    private String apptType;
    private String apptDocName;
    private String apptDate;
    private String apptTime;

    // Variable to hold the current appointment
    private Appointment currentAppt;

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
    void onBackBtnClick(ActionEvent event) {
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
     * Upon clicking the "Confirm" button, remove the user's selected appointment from apptsList
     * and return to the main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    void onConfirmBtnClick(ActionEvent event) throws IOException{
        try{
            // Using the currentAppt variable, remove the user's selected appointment
            // from the program data.
            // Use ProgramData.apptsList to access the program's list of appointments.
            System.out.println("*****CODE HERE!!!!!*****");

            // Upon successful removal of Appointment object, return to the Main Menu
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
     * Takes the appointment data given in the previous screen does 2 things:
     * 1. Assign the selected Appointment to a local variable
     * 2. Changes the label texts to display appointment info
     * @param apptLocation
     * @param apptType
     * @param docName
     * @param date
     * @param time
     */
    public void displayApptInfo(String apptLocation, String apptType, String docName, String date, String time, Appointment currentAppt){
        // Assign the user's selected appointment to a local Appointment variable.
        this.currentAppt = currentAppt;

        // Set the text for the detail labels.
        lblLocation.setText("Location: " + apptLocation);
        lblType.setText("Type: " + apptType);
        lblDoctor.setText("Doctor: " + docName);
        lblDate.setText("Date: " + date);
        lblTime.setText("Time: " + time);
    }
}

