/**
 * @author: Ayushman Singh.
 * Course: CSC-331-001.
 * Date: 04/16/2024.
 * Purpose:This is the appointment class.
 */
public class Appointment {
    //Instance Variables.
    private String apptLocation;
    private String apptType;
    private String apptDate;
    private String apptTime;
    private Doctor apptDoc;
    private Patient apptPat;
    //Constructor.

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
     * Getter method for apptLocation.
     * @return String apptLocation.
     */
    public String getApptLocation(){
        return this.apptLocation;
    }

    /**
     * Getter method for Appointment Type.
     * @return String apptType.
     */
    public String getApptType(){
        return this.apptType;
    }

    /**
     * Getter method for Appointment Date.
     * @return String apptDate.
     */
    public String getApptDate(){
        return this.apptDate;
    }

    /**
     * Getter Method for Appointment Time.
     * @return String apptTime.
     */
    public String getApptTime(){
        return this.apptTime;
    }

    /**
     * Getter Method for Appointment Doctor.
     * @return Doctor apptDoc.
     */
    public Doctor getApptDoc(){
        return this.apptDoc;
    }

    /**
     * Getter method for Appointment Patient.
     * @return Patient apptPat.
     */
    public Patient getApptPat(){
        return this.apptPat;
    }

    /**
     * Setter method for Appointment Location.
     * @param apptLocation
     */
    public void setApptLocation(String apptLocation){
        this.apptLocation=apptLocation;
    }

    /**
     * Setter method for Appointment Type.
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
     * Setter Method for Appointment Doctor.
     * @param apptDoc
     */
    public void setApptDoc(Doctor apptDoc){
        this.apptDoc=apptDoc;
    }

    /**
     * Setter method for Appointment Patient.
     * @param apptPat
     */
    public void setApptPat(Patient apptPat){
        this.apptPat=apptPat;
    }
    //Override.
    @Override
    /**
     * The toString() method of the Appointment class.
     * @return A formatted string displaying the required appointment details.
     */
    public String toString(){
        return String.format("Patient: %s%nDoctor: %s%nType: %s%nDate: %s%nTime: %s%nLocation: %s%n",apptPat,apptDoc,apptType,apptDate,apptTime,apptLocation);
    }
}
