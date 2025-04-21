/**
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/14/2025
 * Purpose: Controller file for the login screen of the program. This screen asks the user
 * for their name. If their name is in ProgramData, they are granted access to the Main Menu,
 * where they can access the main functions of the program.
 */

package com.example.doctorsappointmentbooking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtPatientName;

    @FXML
    private Label lblError;

    // Variables for scene switching to MainMenuController
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Upon the click of the Log-in button, the program does two things:
     * 1. Verify that the given name exists in the "database" (i.e. Patient ArrayList) of the program
     * 2. If it exists, log-in the user and pass their name onto the greeting label of the main menu.
     * @param event
     * @throws IOException
     */
    @FXML
    public void onLoginClick(ActionEvent event) throws IOException {

        // Get the name given by the user and store this in a temporary String variable
        String username = txtPatientName.getText();

        // Variables to help with name searching
        boolean nameFound = false;
        int counter = 0;
        Patient currentPatient;

        // Until either the name is found in the Patient ArrayList or the counter
        // exceeds the size of the ArrayList, search it for the name given by the user.
        // If the name is found, mark nameFound equal to true, store the patient's data
        // into userPatient, and break out of the loop.
        while (!nameFound && counter < ProgramData.patientsList.size()){
            currentPatient = ProgramData.patientsList.get(counter);
            if (currentPatient.getName().equalsIgnoreCase(username)){
                nameFound = true;
                ProgramData.userPatient = currentPatient;
            } else {
                counter += 1;
            }
        }

        // If the name was found in the ArrayList, load the Main Menu, passing
        // their name to be displayed in the program greeting label.
        if (nameFound){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenuScreen.fxml"));
            root = loader.load();
            MainMenuController mainController = loader.getController();
            mainController.displayName(username);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        // If the name was not found, display an error message on the GUI.
        } else {
            lblError.setVisible(true);
        }
    }

}

