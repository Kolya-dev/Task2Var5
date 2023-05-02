/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

/**
 *
 * @author krivosheevnikolaj
 */
public class ClothingStore extends Store {
    private int ClothingInventory;

    public ClothingStore(int ClothingInventory, String name, String address, int employess, int inventory) {
        super(name, address, employess, inventory);
        this.ClothingInventory = ClothingInventory;
    }
    
    @Override
    public String toString(){
        return " name = " + getName() + ", address = " + getAddress() + ", employess =  "
                + getEmployess() + ", inventory = " + getInventory() + ", ClothingInventory = " + this.ClothingInventory;
    }
}
