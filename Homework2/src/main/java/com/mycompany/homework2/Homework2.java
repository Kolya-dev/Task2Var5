/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework2;

import java.util.Scanner;

/**
 *
 * @author krivosheevnikolaj
 */
public class Homework2 {

    public static void main(String[] args) {
        System.out.println("Дз 2. Вариант 5. Студент Кривошеев Н.А. Группа РИБО-04-21");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Объект какого класса создать? 1 - GroceryStore, 2 - ClothingStore");
        int choice = scanner.nextInt();
        if (choice == 1){
            System.out.println("Введите название магазина");
            String name = scanner.next();
            System.out.println("Введите адрес магазина");
            String address = scanner.next();
            System.out.println("Введите число сотрудников");
            int employess = scanner.nextInt();
            System.out.println("Введите количество товаров");
            int inventory = scanner.nextInt();
            System.out.println("Введите количество продуктов");
            int foodInventory = scanner.nextInt();
            GroceryStore GrocStore = new GroceryStore(foodInventory, name, address, employess, inventory);
            System.out.println(GrocStore.toString()); 
    } else {
            System.out.println("Введите название магазина");
            String name = scanner.next();
            System.out.println("Введите адрес магазина");
            String address = scanner.next();
            System.out.println("Введите число сотрудников");
            int employess = scanner.nextInt();
            System.out.println("Введите количество товаров");
            int inventory = scanner.nextInt();
            System.out.println("Введите количество продуктов");
            int ClothingInventory = scanner.nextInt();
            ClothingStore CloStore = new ClothingStore(ClothingInventory, name, address, employess, inventory);
            System.out.println(CloStore.toString());  
        }
       

    }
}
