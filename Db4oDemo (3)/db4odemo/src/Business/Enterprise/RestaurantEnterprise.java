/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sayu
 */
public class RestaurantEnterprise {
    public RestaurantEnterprise(String name,String address){
        super(name,address,Enterprise.EnterpriseType.Restaurant);
        
    }

 

   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
}
}
