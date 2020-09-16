/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sayu
 */
public class Product {
    
    private String name;
    private String price;
    private String availabNum;
    private String description;



    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailabNum() {
        return availabNum;
    }

    public String getDescription() {
        return description;
    }
        public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailabNum(String availabNum) {
        this.availabNum = availabNum;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
