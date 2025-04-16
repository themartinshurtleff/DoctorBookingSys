/**
 * Doctor.java
 *
 * This is a subclass of Person, used to create Doctor objects
 *
 * @author James Frink
 * Section: CSC-331-001
 *
 * Purpose: to create Doctor objects
 */
public class Doctor extends Person{
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
    //Accessors
    /**
     * This method gets specialty
     * @return String specialty
     */
    public String getSpecialty(){return specialty;}
    /**
     * This method gets yearsExp
     * @return int yearsExp
     */
    public int getYearsExp(){return yearsExp;}
    //Mutators
    /**
     * This method sets specialty
     * @param specialty = the doctor's specialty
     */
    public void setSpecialty(String specialty){this.specialty=specialty;}
    /**
     * This method sets yearsExp
     * @param yearsExp = the doctor's years of experience
     */
    public void setYearsExp(int yearsExp){this.yearsExp=yearsExp;}
    /**
     *
     */
    //@Override

}
