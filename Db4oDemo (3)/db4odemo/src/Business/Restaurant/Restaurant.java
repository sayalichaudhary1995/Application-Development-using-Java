/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.HashMap;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private int id;
    private static int count = 1;
    private HashMap<String, Double> menu;
    private String emp;
    private String address;
    private long contact;
    private String email;

    public Restaurant() {
        id = count;
        count++;
        menu = new HashMap<>();
    }
    
    public Restaurant(String emp) {
        this.emp = emp;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Double> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Double> menu) {
        this.menu = menu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
}
