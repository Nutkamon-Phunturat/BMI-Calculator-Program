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
public class Food extends Product {
    
    public Food (String product, String protein, String carbohydrate, String calories, String type, double price) {
        super.Product = product;
        super.Type = type;
        super.Price = price;
        super.Protein = protein;
        super.Carbohydrate = carbohydrate;
        super.Calories = calories;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String Product) {
        this.Product = Product;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getProtein() {
        return Protein;
    }

    public void setProtein(String Protein) {
        this.Protein = Protein;
    }

    public String getCarbohydrate() {
        return Carbohydrate;
    }

    public void setCarbohydrate(String Carbohydrate) {
        this.Carbohydrate = Carbohydrate;
    }

    public String getCalories() {
        return Calories;
    }

    public void setCalories(String Calories) {
        this.Calories = Calories;
    }
    
    
    
    public String[] toArray() {
        return new String[]{ super.Product, super.Protein, super.Carbohydrate, super.Calories, super.Type, Double.toString(super.Price)};
    }
    
}
