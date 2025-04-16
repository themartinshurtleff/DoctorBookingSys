/**
 * Person.java
 *
 * This class is an abstract parent class which will encompass subclasses Doctor and Patient
 *
 * @author James Frink
 * Section: CSC-331-001
 *
 * Purpose: to create the main template for person objects
 */
public abstract class Person {
    private String name;
    private String phoneNumber;
    private int age;

    /**
     * A three parameter constructor
     * @param name = the name of the person
     * @param phoneNumber = the person's phone number
     * @param age = the person's age
     */
    public Person(String name, String phoneNumber, int age){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    //Accessors
    /**
     * This method gets the name
     * @return String name
     */
    public String getName(){return name;}
    /**
     * This method gets the phone number
     * @return phoneNumber
     */
    public String getPhoneNumber(){return phoneNumber;}
    /**
     * This method gets the age
     * @return age
     */
    public int getAge(){return age;}
    //Mutators
    /**
     * This method sets the name
     * @param name = the person's name
     */
    public void setName(String name){this.name=name;}
    /**
     * This method sets the phone number
     * @param phoneNumber = the person's phone number
     */
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
    /**
     * This method sets the age
     * @param age = the person's age
     */
    public void setAge(int age){this.age=age;}
}
