package com.example.doctorsappointmentbooking;

/**
 * Appointment.java
 *
 * This class stores information created by the user.
 *
 * @author: Ayushman Singh.
 * Course: CSC-331-001.
 * Date: 04/16/2024.
 * Purpose: The Appointment class holds important information about appointments
 * created by patients. It also stores Doctor and Patient objects, according to
 * what patient scheduled it and what doctor will be seen.
 */
public class Appointment {
    //Instance Variables.
    private String apptLocation;
    private String apptType;
    private String apptDate;
    private String apptTime;
    private Doctor apptDoc;
    private Patient apptPat;

    /**
     * The appointment constructor with 6 parameters.
     * @param apptLocation:String.
     * @param apptType:String.
     * @param apptDate:String.
     * @param apptTime:String.
     * @param apptDoc:Doctor.
     * @param apptPat:Patient.
     */
    public Appointment(String apptLocation,String apptType,String apptDate,String apptTime,Doctor apptDoc,Patient apptPat){
        this.apptLocation=apptLocation;
        this.apptType=apptType;
        this.apptDate=apptDate;
        this.apptTime=apptTime;
        this.apptDoc=apptDoc;
        this.apptPat=apptPat;
    }

    /**
     * Getter method for Appointment Location (In-person or virtual).
     * @return String apptLocation.
     */
    public String getApptLocation(){
        return apptLocation;
    }

    /**
     * Getter method for Appointment Type (New Patient Establishment, Physical Exam,
     * Medical Test, Urgent Care, or Consultation).
     * @return String apptType.
     */
    public String getApptType(){
        return apptType;
    }

    /**
     * Getter method for Appointment Date.
     * @return String apptDate.
     */
    public String getApptDate(){
        return apptDate;
    }

    /**
     * Getter Method for Appointment Time.
     * @return String apptTime.
     */
    public String getApptTime(){
        return apptTime;
    }

    /**
     * Getter Method for which Doctor is being seen at the appointment.
     * @return Doctor apptDoc.
     */
    public Doctor getApptDoc(){
        return apptDoc;
    }

    /**
     * Getter method for which Patient scheduled the appointment.
     * @return Patient apptPat.
     */
    public Patient getApptPat(){
        return apptPat;
    }

    /**
     * Setter method for Appointment Location (In-person or virtual).
     * @param apptLocation
     */
    public void setApptLocation(String apptLocation){
        this.apptLocation=apptLocation;
    }

    /**
     * Setter method for Appointment Type (New Patient Establishment, Physical Exam,
     *      * Medical Test, Urgent Care, or Consultation).
     * @param apptType
     */
    public void setApptType(String apptType){
        this.apptType=apptType;
    }

    /**
     * Setter method for Appointment Date.
     * @param apptDate
     */
    public void setApptDate(String apptDate){
        this.apptDate=apptDate;
    }

    /**
     * Setter method for Appointment Time.
     * @param apptTime
     */
    public void setApptTime(String apptTime){
        this.apptTime=apptTime;
    }

    /**
     * Setter Method for which Doctor is being seen at the appointment.
     * @param apptDoc
     */
    public void setApptDoc(Doctor apptDoc){
        this.apptDoc=apptDoc;
    }

    /**
     * Setter method for which Patient scheduled the appointment.
     * @param apptPat
     */
    public void setApptPat(Patient apptPat){
        this.apptPat=apptPat;
    }

    @Override
    /**
     * The toString() method of the Appointment class.
     * This is used in ApptViewScreen and ApptCancelScreen to list appointment details.
     * @return Appointment details.
     */
    public String toString(){
        return String.format("%s with Dr. %s --- %s --- %s at %s", apptType, apptDoc.getName(),
                            apptLocation, apptDate, apptTime);
    }
}
