package com.nkydev;

import java.util.Scanner;

public class Menu {

    public void showMenu() {
        Scanner keyword = new Scanner(System.in);
        System.out.println("\n===== Sales Management System =====\n");
        System.out.println("1. Create customer");
        System.out.println("2. Create product");
        System.out.println("3. Create order");
        System.out.println("4. Add product to the order");
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