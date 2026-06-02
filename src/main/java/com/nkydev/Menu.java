package com.nkydev;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner keyword = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("            Welcome to Sales Management System!            ");
        System.out.println("===========================================================\n");
        System.out.println("1. Create a client");
        System.out.println("2. Create a product");
        System.out.println("3. Create an order");
        System.out.println("4. Add a product to the order");
        System.out.println("5. Show orders");
        System.out.println("6. Show products");
        System.out.println("7. Exit");

        System.out.print("\nSelect an option: ");
        int option = keyword.nextInt();

        switch (option) {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            case 4 -> System.out.println();
            default -> System.out.println("Incorrect option. Try again...");
        }
    }
}