/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Tugume William Mutara.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String collegeName;
    private String nUID;

    Address currentAddress;
    Address permanentAddress;

    ContactInformation officeContact;
    ContactInformation personalContact;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.nUID = "";
        this.currentAddress = new Address();
        this.permanentAddress = new Address();
        this.officeContact = new ContactInformation();
        this.personalContact = new ContactInformation();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getnUID() {
        return nUID;
    }

    public void setnUID(String nUID) {
        this.nUID = nUID;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public ContactInformation getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(ContactInformation officeContact) {
        this.officeContact = officeContact;
    }

    public ContactInformation getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(ContactInformation personalContact) {
        this.personalContact = personalContact;
    }
}
