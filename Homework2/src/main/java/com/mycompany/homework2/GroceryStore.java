/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2;

/**
 *
 * @author krivosheevnikolaj
 */
public class GroceryStore extends Store {
    private int foodInventory;

    public GroceryStore(int foodInventory, String name, String address, int employess, int inventory) {
        super(name, address, employess, inventory);
        this.foodInventory = foodInventory;
    }

    @Override
    public String toString(){
        return "name = " + getName() + "address = " + getAddress() + "employess =  "
                + getEmployess() + "inventory = " + getInventory() + " foodInventory = " + this.foodInventory;
    }  
}
