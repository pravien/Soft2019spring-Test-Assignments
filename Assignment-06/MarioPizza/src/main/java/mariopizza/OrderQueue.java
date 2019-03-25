/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariopizza;

import java.util.Stack;

/**
 *
 * @author pravien
 */
class OrderQueue {
    private Stack<Order> orders;
    
    public OrderQueue(){
         orders = new Stack();  
    }
    
    public void addOrder(Order o){
        orders.push(o);
    }
    
    public int amountOfOrders(){
        return orders.size();
    }
    public Stack<Order> getAllorders(){
        return orders;
    }
}
