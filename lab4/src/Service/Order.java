/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Service;

import Customer.Customer;
import Restaurant.DeliveryAgent;

/**
 *
 * @author mandalore
 */
public class Order {
    private Customer customer;

    private DeliveryAgent deliveryAgent;

    private static int count = 0;

    private String orderId;

    private String status;
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }
    
    
    public Order(){
        this.customer = new Customer();
        this.deliveryAgent = new DeliveryAgent();
        this.status = "created";
        this.orderId = "orderNo" + count++;
    }

    public Order(Customer customer, DeliveryAgent deliveryAgent) {
        this.customer = new Customer();
        this.deliveryAgent = new DeliveryAgent();
        this.status = "created";
        this.orderId = "orderNo" + count++;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return this.orderId;
    }
    
}
