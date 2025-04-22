package com.example.doctorsappointmentbooking;

/**
 * @author James Frink
 * Date: 4/14/2025
 * Section: CSC-331-001
 * Purpose: This class is an abstract template class which subclasses Doctor and Patient will inherit
 * key attributes from, including their name, phone number, and age.
 */

public abstract class Person {
    // Instance variables
    private String name;
    private String phoneNumber;
    private int age;

    /**
     * A three parameter constructor for Persons. This is called when either a new Doctor
     * or Patient is created.
     * @param name = the name of the person
     * @param phoneNumber = the person's phone number
     * @param age = the person's age
     */
    public Person(String name, String phoneNumber, int age){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }

    /**
     * This method gets the name of a person
     * @return String name
     */
    public String getName(){return name;}
    /**
     * This method gets the phone number of a person
     * @return String phoneNumber
     */
    public String getPhoneNumber(){return phoneNumber;}
    /**
     * This method gets the age of a person
     * @return int age
     */
    public int getAge(){return age;}

    /**
     * This method sets the name of a person
     * @param name = the person's name
     */
    public void setName(String name){this.name=name;}
    /**
     * This method sets the phone number of a person
     * @param phoneNumber = the person's phone number
     */
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}
    /**
     * This method sets the age of a person
     * @param age = the person's age
     */
    public void setAge(int age){this.age=age;}

    /**
     * This provides an output displaying basic information about a Person.
     * @return Person information
     */
    @Override
    public String toString(){
        return String.format("Name: %s%nPhone number: %s%nAge: %d", name, phoneNumber, age);
    }
}
