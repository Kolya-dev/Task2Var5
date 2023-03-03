package com.company;


import java.util.Scanner;

class Store {
    private String name;
    private String address;
    private int employees;
    private int inventory;

    public Store(String name, String address, int employees, int inventory) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.inventory = inventory;
    }

    public void addInventory(int amount) {
        this.inventory += amount;
    }

    public void removeInventory(int amount) {
        this.inventory -= amount;
    }

    public void printDetails() {
        System.out.println(name + ", " + address + ", " + employees + ", " + inventory);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вариант: 5 \nГруппа: РИБО–04–21 \nФИО: Кривошеев Николай Александрович");

        System.out.print("Enter store name: ");
        String name = scanner.nextLine();

        System.out.print("Enter store address: ");
        String address = scanner.nextLine();

        System.out.print("Enter number of employees: ");
        int employees = scanner.nextInt();

        System.out.print("Enter inventory count: ");
        int inventory = scanner.nextInt();

        Store store = new Store(name, address, employees, inventory);
        store.printDetails();


    }}

class GroceryStore extends Store {
    private int foodInventory;

    public GroceryStore(String name, String address, int employees, int inventory, int foodInventory) {
        super(name, address, employees, inventory);
        this.foodInventory = foodInventory;
    }
}

class ClothingStore extends Store {
    private int clothingInventory;

    public ClothingStore(String name, String address, int employees, int inventory, int clothingInventory) {
        super(name, address, employees, inventory);
        this.clothingInventory = clothingInventory;
    }
}