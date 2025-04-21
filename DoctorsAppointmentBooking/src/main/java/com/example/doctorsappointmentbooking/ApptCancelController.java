/**
 * @author Daniel Novak
 * Date: 4/17/2025
 * Course: CSC-331-003
 * Purpose: This is the controller for ApptCancelScreen.
 * It displays a list of the user's currently scheduled appointments like
 * ApptViewScreen, but the user can select one to cancel.
 */

package com.example.doctorsappointmentbooking;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ApptCancelController implements Initializable {

    @FXML
    private Button btnContinue;

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
     * Upon clicking the "Continue" button, get info from the appointment selected
     * by the user and pass it onto ApptCancelConfirmScreen.
     * @param event
     */
    @FXML
    void onContinueBtnClick(ActionEvent event) throws IOException{
        try{
            // Get the user's currently selected appointment.
            Appointment selectedAppt = lstApptList.getSelectionModel().getSelectedItem();

            // Given that an appointment was selected, grab appointment info and
            // assign it to local variables for passing to ApptCancelConfirmScreen
            // for cancellation confirmation.
            if (selectedAppt != null){
                String locationSelected = selectedAppt.getApptLocation();
                String typeSelected = selectedAppt.getApptType();
                String docSelected = selectedAppt.getApptDoc().getName();
                String dateSelected = selectedAppt.getApptDate();
                String timeSelected = selectedAppt.getApptTime();

                // Load ApptCancelConfirmScreen and pass the appointment data onto that screen
                FXMLLoader loader = new FXMLLoader(getClass().getResource("ApptCancelConfirmScreen.fxml"));
                root = loader.load();
                ApptCancelConfirmController confirmControl = loader.getController();
                confirmControl.displayApptInfo(locationSelected, typeSelected, docSelected, dateSelected, timeSelected, selectedAppt);
                stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        } catch (IOException e){
            System.out.println("ERROR: FXML file not found!");
        }
    }

    /**
     * Upon bringing up ApptViewScreen, populate the appointment list with
     * the user's appointments, if there are any.
     * @param url
     * @param bund
     */
    @Override
    public void initialize(URL url, ResourceBundle bund){
        // Instance variable of Appointment for appointment search
        Appointment currentAppt;

        // Search apptsList to see if the user patient has any appointments scheduled.
        // If there are any, add them to lstApptList.
        for (int i=0; i<ProgramData.apptsList.size(); i++){
            currentAppt = ProgramData.apptsList.get(i);
            if (currentAppt.getApptPat().getName().equalsIgnoreCase(ProgramData.userPatient.getName())){
                lstApptList.getItems().add(currentAppt);
            }
        }

        // If there was at least one appointment found, enable the Continue button so that it can
        // be clicked on.
        if (!lstApptList.getItems().isEmpty()){
            btnContinue.setDisable(false);
        }
    }
}

