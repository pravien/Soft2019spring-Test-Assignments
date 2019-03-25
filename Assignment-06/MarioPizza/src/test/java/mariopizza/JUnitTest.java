package mariopizza;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pravien
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void addOrderToQueueTest(){
     OrderQueue orderqueue = new OrderQueue();
     Order order = new Order(23,"14:02");
     orderqueue.addOrder(order);
     assertEquals(orderqueue.amountOfOrders(),1);
     }
     
     @Test
     public void addPizzaToOrderTest(){
     Order order = new Order(2,"13:02");
     Pizza p = new Pizza(54,200,"salata-Pizza");
     order.addPizza(p);
     assertEquals(order.getAmountPizzas(),1);
     }
     
     @Test
     public void removePizzaFromOrderTest(){
     Order order = new Order(3,"18:02");
     Pizza p = new Pizza(1,654,"Golden pizza - By Lovro");
     order.addPizza(p);
     order.removePizzaById(p);
     assertEquals(order.getAmountPizzas(),0);
     }
     
     
     
     @Test
     public void calculateOrderPriceTest(){
     Order order = new Order(3,"18:02");
     Pizza p = new Pizza(1,654,"Golden pizza - By Lovro");
     Pizza p2 = new Pizza(2,20,"shit - by sd");
     order.addPizza(p);
     order.addPizza(p2);
     order.removePizzaById(p2);
     int result = order.getOrderPrice();
     assertEquals(654,result);
     }
     
     @Test
     public void getAllOrdersFromOrderQueue(){
     OrderQueue orderQueue = new OrderQueue();
     Order order = new Order(3,"18:02");
     Pizza p = new Pizza(1,654,"Golden pizza - By Lovro");
     Pizza p2 = new Pizza(2,20,"shit - by sd");
     order.addPizza(p);
     order.addPizza(p2);
     orderQueue.addOrder(order);
     
     Order order2 = new Order(3,"18:02");
     Pizza p3 = new Pizza(1,654,"shitty pizza - By Lovro");
     order.addPizza(p3);
     orderQueue.addOrder(order2);
     
     int result = orderQueue.getAllorders().size();
     assertEquals(2,result);
     }
}
