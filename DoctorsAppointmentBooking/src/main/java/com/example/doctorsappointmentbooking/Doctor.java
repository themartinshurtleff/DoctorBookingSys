package com.example.doctorsappointmentbooking;

/**
 * @author James Frink, Ayushman Singh
 * Section: CSC-331-001
 * Date: 4/14/2025
 * Purpose: This is a subclass of Person, used to create Doctor objects.
 */
public class Doctor extends Person{
    // Instance variables
    private String specialty;
    private int yearsExp;

    /**
     * A five parameter constructor for Doctor.
     * This takes in the attributes inherited from Person and also adds
     * information about the doctor's specialty and their years of experience
     * working at this hospital.
     * @param name = the doctor's name
     * @param phoneNumber = the doctor's phone number
     * @param age = the doctor's age
     * @param specialty = the doctor's specialty
     * @param yearsExp = the doctor's years of experience
     */
    public Doctor(String name, String phoneNumber, int age, String specialty, int yearsExp){
        // Call the constructor of Person
        super(name, phoneNumber, age);

        // Set up specific Doctor attributes
        this.specialty=specialty;
        this.yearsExp=yearsExp;
    }

    /**
     * This method gets the doctor's specialty
     * @return The doctor's specialty
     */
    public String getSpecialty(){return specialty;}
    /**
     * This method gets the doctor's years of experience working at this hospital
     * @return The doctor's years of experience
     */
    public int getYearsExp(){return yearsExp;}

    /**
     * This method sets the doctor's specialty
     * @param specialty = the doctor's specialty
     */
    public void setSpecialty(String specialty){this.specialty=specialty;}
    /**
     * This method sets the doctor's years of experience working at this hospital
     * @param yearsExp = the doctor's years of experience
     */
    public void setYearsExp(int yearsExp){this.yearsExp=yearsExp;}

    /**
     * Doctor's toString simply returns the doctor's name.
     * This is used in FXML scenes such as ApptCreationScreen, where
     * we need a Doctor object to store in a potential Appointment, but
     * we only want the Doctor's name to be visible to the user in the doctor choicebox.
     * @return Doctor name
     */
    @Override
    public String toString(){
        return String.format("%s", getName());
    }
}
