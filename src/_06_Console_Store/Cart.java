package _06_Console_Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("unchecked")
public class Cart {
	
	
	private Food[] cart;

    public Cart() {
        cart = (Food[]) new Object[5];
    }

    // Adds an item to the cart
    public void add(Food item) {
    	
    	
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 5 items");
    }

    // Displays everything currently in the cart
    public void showCart() {
        
    	System.out.println("Here are the things in your cart: ");
    	
    	for(int i = 0; i < cart.length; i++) {
    		System.out.println(cart[i].type());
    	}
    	
    }
    
    public void checkOut() {
    	
    	int sum = 0;
    	
    	for(int i = 0; i < cart.length; i++) {
    		sum += cart[i].getPrice();
    	}
    	
    	if(sum > 30) {
    		System.out.println("Checked out!");
    		System.exit(-1);
    	}
    	else {
    		System.out.println("OVER BUDGET: YOU ARE GOING TO JAIL");
    		System.exit(-1);
    	}
    	
    }
    

    public int length() {
        return cart.length;
    }
	
}
