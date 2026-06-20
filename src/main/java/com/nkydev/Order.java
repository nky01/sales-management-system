package com.nkydev;
import java.awt.color.ProfileDataException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int id;
    private Customer customer;
    private LocalDate creationDate;
    private Status status;
    ArrayList<Product> products;

    public Order(int id, Customer customer, LocalDate creationDate, Status status, ArrayList<Product> products) {
        this.id = id;
        this.customer = customer;
        this.creationDate = creationDate;
        this.status = status;
        this.products = products;
    }

    public int getId() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "--------------------------------" +
                "\nID: " + id +
                "\nCustomer: " + customer.getName() +
                "\nCreation date: " + creationDate +
                "\nStatus: " + status +
                "\nProducts: " + products +
                "\n--------------------------------\n";
    }
}