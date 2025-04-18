/**
 * @author Daniel Novak
 * Course: CSC-331-003
 * Date: 4/16/2025
 * Purpose: ProgramData holds data for Doctors, Patients, and Appointments that the
 * program can have access to for its controllers.
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
    public static ArrayList<Doctor> doctorsList = new ArrayList<>();
    public static ArrayList<Patient> patientsList = new ArrayList<>();
    public static ArrayList<Appointment> apptsList = new ArrayList<>();

    // Make a dedicated Patient variable to hold patient's data while they are using the program
    public static Patient userPatient;

    /**
     * Method that populates the Doctor and Patient ArrayLists with example data.
     */
    public static void populateData(){

        // Add doctor data
        doctorsList.add(new Doctor("Mario Mario", "453-674-3234", 40, "Internal Medicine", 35));
        doctorsList.add(new Doctor("Luigi Mario", "453-679-1239", 40, "Internal Medicine", 12));
        doctorsList.add(new Doctor("Peach Mario", "453-695-3429", 40, "Internal Medicine", 35));

        // Add patient data
        patientsList.add(new Patient("Tom Servo", "134-345-2342", 37, new ArrayList<>() {{add("Headache"); add("Fatigue");}}));
        patientsList.add(new Patient("Crow T. Robot", "123-342-3452" , 36, new ArrayList<>() {{add("Mechanical Issues"); add("Fatigue");}}));
        patientsList.add(new Patient("GPC", "124-345-3452", 36, new ArrayList<>() {{add("Anxiety"); add("Fatigue");}}));

        apptsList.add(new Appointment("In-Person", "Physical Exam", "2025-04-17", "4:00 PM", doctorsList.get(1), patientsList.get(0)));
    }
}
