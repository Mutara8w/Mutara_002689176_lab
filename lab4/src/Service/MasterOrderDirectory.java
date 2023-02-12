/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Service;

import Customer.Customer;
import Restaurant.DeliveryAgent;
import java.util.ArrayList;

/**
 *
 * @author mandalore
 */
public class MasterOrderDirectory {

    private ArrayList<Order> orderList;
    
    public MasterOrderDirectory(){
        this.orderList = new ArrayList<Order>();
    }

    public MasterOrderDirectory(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public Order createOrder(Customer customer, DeliveryAgent del) {
        Order o = new Order(customer, del);
        this.orderList.add(o);
        return o;
       
    }

    public Order requestOrder(Customer customer) {
        Order o = new Order();
        o.setCustomer(customer);

        this.orderList.add(o);
        return o;
    }

    public Order assignOrder(Order o, DeliveryAgent del) {
        o.setDeliveryAgent(del);
        return o;
    }

}
