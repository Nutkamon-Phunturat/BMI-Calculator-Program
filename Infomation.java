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
public class Infomation {
    private String date;
    private String username;
    private String sex;
    private double age;
    private double weight;
    private double height;
    private double frequency;
    private double fatPercent;
    private double BMR;
    private double TDEE;

    public Infomation(String date, String username, String sex, double age, double weight, double height, double frequency, double fatPercent, double BMR, double TDEE) {
        this.date = date;
        this.username = Person.username;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.frequency = frequency;
        this.fatPercent = fatPercent;
        this.BMR = BMR;
        this.TDEE = TDEE;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(double fatPercent) {
        this.fatPercent = fatPercent;
    }

    public double getBMR() {
        return BMR;
    }

    public void setBMR(double BMR) {
        this.BMR = BMR;
    }

    public double getTDEE() {
        return TDEE;
    }

    public void setTDEE(double TDEE) {
        this.TDEE = TDEE;
    }
    
    public String[] toArray() {
        return new String[]{String.valueOf(date), username, sex, String.valueOf(age), String.valueOf(weight), 
            String.valueOf(height), String.valueOf(frequency), String.valueOf(fatPercent), String.valueOf(BMR), String.valueOf(TDEE)};
    }
}
