package com.example.doctorsappointmentbooking;

/**
 * @author James Frink
 * Section: CSC-331-001
 * Date: 4/14/2025
 * Purpose: This is a subclass of Person, used to create Doctor objects.
 */
public class Doctor extends Person{
    // Instance variables
    private String specialty;
    private int yearsExp;

    /**
     * A five parameter constructor
     * @param name = the doctor's name
     * @param phoneNumber = the doctor's phone number
     * @param age = the doctor's age
     * @param specialty = the doctor's specialty
     * @param yearsExp = the doctor's years of experience
     */
    public Doctor(String name, String phoneNumber, int age, String specialty, int yearsExp){
        super(name, phoneNumber, age);
        this.specialty=specialty;
        this.yearsExp=yearsExp;
    }

    /**
     * This method gets the doctor's specialty
     * @return String specialty
     */
    public String getSpecialty(){return specialty;}
    /**
     * This method gets the doctor's years of experience
     * @return int yearsExp
     */
    public int getYearsExp(){return yearsExp;}

    /**
     * This method sets the doctor's specialty
     * @param specialty = the doctor's specialty
     */
    public void setSpecialty(String specialty){this.specialty=specialty;}
    /**
     * This method sets the doctor's years of experience
     * @param yearsExp = the doctor's years of experience
     */
    public void setYearsExp(int yearsExp){this.yearsExp=yearsExp;}

    @Override
    public String toString(){
        return String.format("%s%nSpecialty: %s%nYears experience: %d%n", super.toString(), specialty, yearsExp);
    }
}
