/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.util.ArrayList;

/**
 *
 * @author nutkamonphunturat
 */
public class Cart {
    private ArrayList<Product> productItems;
    
    public Cart(){
        productItems = new ArrayList<>();
    }
    
    public void addProduct(Product item) {
        productItems.add(item);
    }
    
    public ArrayList<Product> getProduct(){
        return productItems;
    }
}
