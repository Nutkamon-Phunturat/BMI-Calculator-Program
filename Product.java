/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;


/**
 *
 * @author nutkamonphunturat
 */
public abstract class Product {
    public String Product;
    public double Price;
    public String Type;
    public String Protein;
    public String Carbohydrate;
    public String Calories;
    
    public abstract String getProduct();
    public abstract double getPrice();
    public abstract String getType();
    public abstract String getProtein();
    public abstract String getCarbohydrate();
    public abstract String getCalories();
}
