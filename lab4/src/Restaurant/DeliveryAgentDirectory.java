/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Restaurant;

import java.util.ArrayList;

/**
 *
 * @author mandalore
 */
public class DeliveryAgentDirectory {
    private ArrayList<DeliveryAgent> deliveryAgentList;

    

    public DeliveryAgentDirectory() {
        this.deliveryAgentList = new ArrayList<DeliveryAgent>();
    }

    public ArrayList<DeliveryAgent> getDeliveryAgentList() {
        return deliveryAgentList;
    }

    public void setDeliveryAgentList(ArrayList<DeliveryAgent> deliveryAgentList) {
        this.deliveryAgentList = deliveryAgentList;
    }
    
     public DeliveryAgent findByID(String id) {
        for(DeliveryAgent d : this.deliveryAgentList) {
            if(d.getPersonId().equals(id)) {
                return d;
            }
        }
        return null;
    }
    
    public DeliveryAgent createDeliveryAgent(String id, String name, String age) {
        DeliveryAgent d = new DeliveryAgent();
        d.setAge(age);
        d.setPersonId(id);
        d.setName(name);
        
        this.deliveryAgentList.add(d);
        return d;
    }
}
