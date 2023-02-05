/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

import java.util.ArrayList;

/**
 *
 * @author mandalore
 */
public class MedicineCatalog {

    private ArrayList<Medicine> listOfMedicines;

    public MedicineCatalog() {
        this.listOfMedicines = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getListOfMedicines() {
        return listOfMedicines;
    }

    public void setListOfMedicines(ArrayList<Medicine> listOfMedicines) {
        this.listOfMedicines = listOfMedicines;
    }

    public Medicine createMedicine(int dosage, String MedicineName) {
        Medicine medicine = new Medicine();
        medicine.setMedicineName(MedicineName);
        medicine.setDosage(dosage);
        return null;

    }

    public Boolean checkIfMedicineNameUnique(String medName) {
        for (Medicine m : this.listOfMedicines) {
            if (m.getMedicineName().equals(medName)) {
                return false;
            }
        }

        return true;
    }

    public void removeMedicine(String name) {

        for (Medicine med : this.listOfMedicines) {
            if (med.getMedicineName().equals(name)) {
                this.listOfMedicines.remove(med);
                break;
            }
        }
    }

}
