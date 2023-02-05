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
public class VitalSignHistory {

    ArrayList<Observation> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Observation createObservation(int observationId, double bloodPressure, double temperature) {
        Observation observation = new Observation();
        observation.setObservationId(observationId);
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(temperature);

        this.vitalSignHistory.add(observation);
        return observation;
    }

    public Boolean checkIfObservationIdUnique(int id) { // check uniquness
        for (Observation ob : this.vitalSignHistory) {
            if (ob.getObservationId() == id) {
                return false;
            }
        }

        return true;
    }

    public Observation searchForObservationById(int id) { // find particular observation by ob id
        for (Observation ob : this.vitalSignHistory) {
            if (ob.getObservationId() == id) {
                return ob;
            }
        }

        return null;
    }

}
