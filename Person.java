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
public class Person {
    public static String username;
    public String password;
    public String RePassword;
    
    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Person(String username, String password, String RePassword) {
        this.username = username;
        this.password = password;
        this.RePassword = RePassword;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Person.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return RePassword;
    }

    public void setRePassword(String RePassword) {
        this.RePassword = RePassword;
    }
    
    public String[] toArray() {
        return new String[]{username, password, RePassword};
    }
}
