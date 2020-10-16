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
public class OrderItem {
    private int quality;
    private double salesPrice;
    private Product product;

    public int getQuantity() {
        return quality;
    }

    public void setQuantity(int quality) {
        this.quality = quality;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    @Override
    public String toString()
   {
       return product.getProdName();
    }
}
