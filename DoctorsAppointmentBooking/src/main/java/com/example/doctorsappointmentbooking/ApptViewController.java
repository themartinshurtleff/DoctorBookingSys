/**
 * @author Daniel Novak
 * Date: 4/17/2025
 * Course: CSC-331-003
 * Purpose: This is the controller for ApptViewScreen. This shows the user their currently
 * scheduled appointments.
 */

package com.example.doctorsappointmentbooking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApptViewController implements Initializable {

    @FXML
    private ListView<Appointment> lstApptList;

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
     * Upon bringing up ApptViewScreen, populate lstApptList with data.
     * @param url
     * @param bund
     */
    @Override
    public void initialize(URL url, ResourceBundle bund){
        Appointment currentAppt;

        // Search apptsList to see if the user patient has any appointments scheduled.
        // If there are any, add them to lstApptList.
        for (int i=0; i<ProgramData.apptsList.size(); i++){
            currentAppt = ProgramData.apptsList.get(i);
            if (currentAppt.getApptPat().getName().equalsIgnoreCase(ProgramData.userPatient.getName())){
                lstApptList.getItems().add(currentAppt);
            }
        }
    }
}

