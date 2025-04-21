/**
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/14/2025
 * Purpose: Controller file for the main menu screen of the program. This contains
 * mutliple buttons for the user to access the main functions of the program.
 */

package com.example.doctorsappointmentbooking;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private Button btnCancelAppt;

    @FXML
    private Button btnCreateAppt;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnViewAppts;

    @FXML
    private Label lblGreeting;

    // Variables for scene switching
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Upon clicking "Create Appointment", takes the user to the Appointment Creation screen
     * to create a new appointment.
     * @param event
     * @throws IOException
     */
    @FXML
    void onCreateApptClick(ActionEvent event) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ApptCreationScreen.fxml"));
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
     * Upon clicking the "View Appointments" button, takes the user to the View Appointments screen
     * to see their list of scheduled appointments.
     * @param event
     * @throws IOException
     */

    @FXML
    void onViewApptClick(ActionEvent event) throws IOException{
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ApptViewScreen.fxml"));
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
     * Upon clicking the "Cancel Appointment" button, takes the user to the Cancel Appointment
     * screen to cancel an appointment.
     * @param event
     * @throws IOException
     */
    @FXML
    void onCancelApptClick(ActionEvent event) throws IOException{
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ApptCancelScreen.fxml"));
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
     * Upon clicking the "Exit" button, exits the program.
     * @param event
     */
    @FXML
    public void onExitButtonClick(ActionEvent event){
        Stage stage = (Stage)btnExit.getScene().getWindow();
        stage.close();
    }

    /**
     * Given the user's name from the log-in screen, this method sets the greeting
     * label to display a greeting to the user's name
     * @param username User's name
     */
    public void displayName(String username){
        lblGreeting.setText("Hello " + username + "!");
    }
}

