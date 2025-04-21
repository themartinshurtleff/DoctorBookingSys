/**
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/14/2025
 * Purpose: Main starter file that the program is run from. This starts the program to
 * the log-in screen.
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

        // Populate the ProgramData ArrayLists with data
        ProgramData.populateData();

        // Load the program, starting from the log-in screen.
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("LoginScreen.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Doctor's Appointment Booking System");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            // If the corresponding FXML file is missing, display an error message in the console.
            System.out.println("ERROR: FXML not found!");
        }
    }

    /**
     * Simply call the launch method to begin the program.
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}