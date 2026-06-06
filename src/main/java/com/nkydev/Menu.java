package com.nkydev;

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
        }
        switch (option) {
            case 1 -> createCustomer();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 8 -> System.out.println("Thank you & goodbye!");
            default -> System.out.println("Incorrect option. Try again...");
        }
    }

    public void createCustomer() {
        System.out.println("Create customer");
    }
}