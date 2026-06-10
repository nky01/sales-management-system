package com.nkydev;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner keyword = new Scanner(System.in);
        int option = 0;

        while (option != 8) {
            System.out.println("\n===== Sales Management System =====\n");
            System.out.println("1. Create customer");
            System.out.println("2. Show customers");
            System.out.println("3. Create product");
            System.out.println("4. Show products");
            System.out.println("5. Create order");
            System.out.println("6. Show orders");
            System.out.println("7. Add product to order");
            System.out.println("8. Exit");
            System.out.println("===================================");
            System.out.print("\nSelect an option: ");
            option = keyword.nextInt();

        switch (option) {
            case 1 -> createCustomer();
            case 2 -> showCustomers();
            case 3 -> System.out.println();
            case 8 -> System.out.println("Thank you & goodbye!");
            default -> System.out.println("Incorrect option. Try again...");
        }
        }
    }

    ArrayList<Customer> customers = new ArrayList<>();
    public void createCustomer() {
        Scanner idKeyword = new Scanner(System.in);
        Scanner nameKeyword = new Scanner(System.in);
        Scanner emailKeyword = new Scanner(System.in);
        Scanner phoneKeyword = new Scanner(System.in);

        System.out.println("======== Create customer ========");
        System.out.println("Enter the next information:");
        System.out.print("id: ");
        int id = idKeyword.nextInt();
        System.out.print("name: ");
        String name = nameKeyword.next();
        System.out.print("email: ");
        String email = emailKeyword.next();
        System.out.print("phone number: ");
        String phone = phoneKeyword.next();

        Customer customer= new Customer(id, name, email, phone);
        customers.add(customer);

        System.out.println("===================================");
        System.out.println("Great! Customer was created");
    }

    public void showCustomers(){
        if (!customers.isEmpty())  {
            for (int i = 0; i < customers.size(); i++) {
                System.out.println(customers.get(i));
            }
        } else {
            System.out.println("It doesn't exist customers yet. Go back and select '1. Create customer'");
        }
    }
}