/**
 * ProgramData.java
 *
 * This is the central hub for collected data.
 *
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/16/2025
 * Purpose: ProgramData is the central spot for data regarding Doctors, Patients,
 * and Appointments that the entire program will have access to.
 * This ensures that data can be passed between controllers without needing
 * to initialize variables for each controller.
 */

package com.example.doctorsappointmentbooking;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ProgramData {
    // Make ArrayLists for program data
    // doctorsList will store all Doctors within the program
    // patientsList will store all Patients within the program
    // apptsList will store all Appointments scheduled within the program
    public static ArrayList<Doctor> doctorsList = new ArrayList<>();
    public static ArrayList<Patient> patientsList = new ArrayList<>();
    public static ArrayList<Appointment> apptsList = new ArrayList<>();

    // Make a dedicated Patient variable to hold the data of the user patient
    // while they use the program.
    public static Patient userPatient;

    /**
     * This method populates the Doctor and Patient ArrayLists with data
     * upon starting the program. It also provides a sample Appointment for
     * testing purposes.
     */
    public static void populateData(){

        // Add doctor data to doctorsList
        doctorsList.add(new Doctor("Mario Mario", "453-674-3234", 40, "Internal Medicine", 35));
        doctorsList.add(new Doctor("Luigi Mario", "453-679-1239", 40, "Internal Medicine", 12));
        doctorsList.add(new Doctor("Peach Mario", "453-695-3429", 40, "Internal Medicine", 35));

        // Add patient data to patientsList
        // Patient names can be used to log into the system
        patientsList.add(new Patient("Tom Servo", "134-345-2342", 37, new ArrayList<>() {{add("Headache"); add("Fatigue");}}));
        patientsList.add(new Patient("Crow T. Robot", "123-342-3452" , 36, new ArrayList<>() {{add("Mechanical Issues"); add("Fatigue");}}));
        patientsList.add(new Patient("GPC", "124-345-3452", 36, new ArrayList<>() {{add("Anxiety"); add("Fatigue");}}));

        // Add a sample appointment for Tom Servo
        apptsList.add(new Appointment("In-Person", "Physical Exam", "2025-04-17", "4:00 PM", doctorsList.get(1), patientsList.get(0)));
    }
}
