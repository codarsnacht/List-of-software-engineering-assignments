/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joseph
 */
public class ShopItem {
    
    Product product;
    short quantity;
  String make;
    String weight;
    String price;
    String life;
    

    public ShopItem(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

//    public double getTotal() {
//        double amount = 0;
//        amount = (this.getQuantity() * product.getRetailPrice().doubleValue());
//        return amount;
//    }

}
    

