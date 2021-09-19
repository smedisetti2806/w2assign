/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboard;


public class CardBoardBox extends Price {
    
     private String size;
     private String purpose;
     private double price;

    public CardBoardBox(String size, String purpose, double price) {
        this.size = size;
        this.purpose = purpose;
        this.price= price;
    }

    public String getSize() {
        return size;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getPrice() {
        return price;
    }
    
    

    @Override
    public double Price() {
    
        return getPrice();
        
    }

    @Override
    public String toString() {
        return "CardBoardBox{" + 
                "\n size=" + size + 
                "\n purpose=" + purpose + 
                "\n price=" + price + '}';
    }
     

    
    
   

    
}
