package com.nkydev;
import java.time.LocalDate;

public class Order {
    private int id;
    private Customer customer;
    private LocalDate creationDate;
    private Status status;
    private float totalAmount;

    public Order(int id, Customer customer, LocalDate creationDate, Status status, float totalAmount) {
        this.id = id;
        this.customer = customer;
        this.creationDate = creationDate;
        this.status = status;
        this.totalAmount = totalAmount;
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
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }
}