package com.nkydev;

import javax.smartcardio.CardTerminal;
import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner keyword = new Scanner(System.in);
        int option = 0;

        while (option != 8) {
            System.out.println("\n===== Sales Management System ======\n");
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
            case 3 -> createProduct();
            case 4 -> showProducts();
            case 8 -> System.out.println("Thank you & goodbye!");
            default -> System.out.println("Incorrect option. Try again...");
        }
        }
    }

    ArrayList<Customer> customers = new ArrayList<>();
    public void createCustomer() {
        Scanner keyword = new Scanner(System.in);

        System.out.println("========= Create customer =========");
        System.out.println("Enter the next information:");
        System.out.print("id: ");
        int id = keyword.nextInt();
        System.out.print("name: ");
        String name = keyword.next();
        System.out.print("email: ");
        String email = keyword.next();
        System.out.print("phone number: ");
        String phone = keyword.next();

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

    ArrayList<Product> products = new ArrayList<>();

    public void createProduct(){
        Scanner keyword = new Scanner(System.in);

        System.out.println("========= Create product =========");
        System.out.println("Enter the next information:");
        System.out.print("id: ");
        int id = keyword.nextInt();
        System.out.print("name: ");
        String name = keyword.next();
        System.out.print("price: ");
        float price = keyword.nextFloat();
        System.out.print("stock: ");
        int stock = keyword.nextInt();
        System.out.print("category of the product (electronics / home / sports / clothing): ");
        String kCategory = keyword.next();
        Category category = Category.valueOf(kCategory.trim().toUpperCase());

        Product product = new Product(id, name, price, stock, category);
        products.add(product);

        System.out.println("===================================");
        System.out.println("Great! Product was created");
    }

    public void showProducts(){
        if (!products.isEmpty()) {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i).toString());
            }
        } else {
            System.out.println("It doesn't exit products yet. Go back and select '3. Create product'");
        }
    }
}