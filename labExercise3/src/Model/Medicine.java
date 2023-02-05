/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

/**
 *
 * @author mandalore
 */
public class Medicine {

    private String medicineName;

    private double Dosage;

    public Medicine() {

    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getDosage() {
        return Dosage;
    }

    public void setDosage(double Dosage) {
        this.Dosage = Dosage;
    }
    
    @Override
    public String toString() {
        return this.medicineName;
    }

}
