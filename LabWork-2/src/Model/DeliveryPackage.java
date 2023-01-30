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
public class DeliveryPackage {

    int packageId;
    double packageWeight;
    ArrayList<Product> productList;
    Customer customer;

    public DeliveryPackage() {
        this.customer = new Customer();
        this.productList = new ArrayList<Product>();
    }

    public int getPackageId() {
        return packageId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // add a Product to the productList
    public Product createProduct(int productId, String productName, double productPrice) {
        // create new prod object
        Product product = new Product();

        // set the attributes
        product.setProductId(productId);
        product.setProductName(productName);
        product.setProductPrice(productPrice);

        // add it to list
        this.productList.add(product);

        return product;
    }

    public Product findProduct(int pid) {
        for (Product prod : this.productList) {
            if (prod.getProductId() == pid) {
                return prod;
            }
        }
        return null;
    }

}
