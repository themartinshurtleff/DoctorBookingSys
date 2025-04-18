/**
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/14/2025
 * Purpose: Main starter file that boots up the program to the log-in screen.
 */

package com.example.doctorsappointmentbooking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApplication extends Application {
    /**
     * Start method that starts the program from the log-in screen.
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {

        // Populate the ArrayLists with data
        ProgramData.populateData();

        // Load the program
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("LoginScreen.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Doctor's Appointment Booking System");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println("ERROR: FXML not found!");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}