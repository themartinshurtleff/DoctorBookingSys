/**
 * @author Daniel Novak
 * Date: 4/16/2025
 * Course: CSC-331-003
 * Purpose: This is the controller for ApptConfirmScreen. It is responsible for actually
 * adding the user's new appointment to apptsList.
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

public class ApptConfirmController {

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
    private Doctor apptDoc;
    private String apptDate;
    private String apptTime;

    // Variables for scene switching
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Upon clicking the cancel button, the program returns back to the main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    void onCancelBtnClick(ActionEvent event) throws IOException {
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
     * Upon clicking the "Confirm" button, add the user's new appointment to apptsList
     * and return to the main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    void onConfirmBtnClick(ActionEvent event) throws IOException{
        try{
            // Using the user's given appointment information, create a new
            // Appointment object and add it to apptsList.
            ProgramData.apptsList.add(new Appointment(apptLocation, apptType, apptDate, apptTime, apptDoc, ProgramData.userPatient));

            // Upon successful creation of Appointment object, return to the Main Menu
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
     * 1. Assigns them to local variables for creating an Appointment object
     * 2. Changes the corresponding label texts to display appointment info
     * @param apptLocation
     * @param apptType
     * @param apptDoc
     * @param date
     * @param time
     */
    public void displayApptInfo(String apptLocation, String apptType, Doctor apptDoc, String date, String time){
        this.apptLocation = apptLocation;
        lblLocation.setText("Location: " + apptLocation);

        this.apptType = apptType;
        lblType.setText("Type: " + apptType);

        this.apptDoc = apptDoc;
        lblDoctor.setText("Doctor: " + apptDoc.getName());

        this.apptDate = date;
        lblDate.setText("Date: " + date);

        this.apptTime = time;
        lblTime.setText("Time: " + time);
    }
}

