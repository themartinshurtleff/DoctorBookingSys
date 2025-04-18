/**
 * @author Daniel Novak
 * Date: 4/14/2025
 * Course: CSC-331-003
 * Purpose: The Patient subclass holds details about patients, including their name,
 *          phone number, age, and list of health issues.
 */

package com.example.doctorsappointmentbooking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Patient extends Person{
    // Instance variables
    private ArrayList<String> healthIssues = new ArrayList<>();

    /**
     * Constructor for Patient
     * @param name
     * @param phoneNumber
     * @param age
     * @param healthIssues
     */
    public Patient(String name, String phoneNumber, int age, ArrayList<String> healthIssues){
        super(name, phoneNumber, age);
        this.healthIssues = healthIssues;
    }

    /**
     * Simply returns the patient's list of health issues.
     * @return Patient's list of health issues
     */
    public ArrayList<String> getHealthIssues(){
        return healthIssues;
    }

    /**
     * Given a user-provided health issue, this method adds it to the patient's list of
     * health issues.
     * @param issue A user-provided health issue
     */
    public void addIssue(String issue){
        healthIssues.add(issue);
    }

    /**
     * Given a user-provided health issue, this method removes it from the patient's list of
     * health issues if it exists in the list.
     * @param issue A user-provided health issue
     */
    public void removeIssue(String issue){
        String currentIssue;

        for (int i=0; i<healthIssues.size(); i++){
            currentIssue = healthIssues.get(i);
            if (currentIssue.equals(issue)){
                healthIssues.remove(i);
            }
        }
    }

    @Override
    public String toString(){
        return String.format("%s%nHealth issues: %s%n", super.toString(), healthIssues.toString());
    }
}
