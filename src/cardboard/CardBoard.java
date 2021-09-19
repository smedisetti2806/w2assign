/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboard;

import java.util.Scanner;



public class CardBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner sc = new Scanner(System.in);

        Scanner ac= new Scanner(System.in);

        System.out.println("Enter Customer Information");
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        
        Customer customer = new Customer(name,email);
        
        System.out.println("");
        
        System.out.println("Enter Purchase Information");
        System.out.println("Enter Card Board Size: ");
        String size = sc.nextLine();
        
        System.out.println("Enter Purpose of Shipping");
        String purpose = sc.nextLine();
        
        System.out.println("Enter Price: ");
        double price = ac.nextDouble();
        
        CardBoardBox box = new CardBoardBox(size, purpose, price);
        
        System.out.println("Information You Entered is: ");
        
        System.out.println(customer.toString());
        
        
        System.out.println(box.toString());
        
        
        
    }
    
}
