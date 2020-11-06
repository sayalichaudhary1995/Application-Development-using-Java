/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    private HashMap<String,Double> menu;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();
        menu = new HashMap<>();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    public Restaurant createRestaurant(String name, String address, long contact, String email) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName(name);
        restaurant.setAddress(address);
        restaurant.setContact(contact);
        restaurant.setEmail(email);
        return restaurant;
    }
    
    public void updateRestaurantMenu(Restaurant restaurant, String name, Double price) {
        if(restaurant.getMenu() != null) {
            menu = restaurant.getMenu();
        }
        menu.put(name, price);
        restaurant.setMenu(menu);
    }
}
