/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import src.testable.Animal;
import src.testable.House;

/**
 *
 * @author pravien
 */
public class Test_Testable {
    
    public Test_Testable() {
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
     public void upperBounddry() {
         int squareMeter = 151;
         int multiFaktor = 25;
         House house = new House("test-street",2,"red",squareMeter);
         assertEquals(house.calculateRent(),(squareMeter*multiFaktor));
     }
     @Test
     public void middelBounddry() {
         int squareMeter = 150;
         int multiFaktor = 10;
         House house = new House("test-street",2,"red",squareMeter);
         assertEquals(house.calculateRent(),(squareMeter*multiFaktor));
     }
     
      @Test
     public void lowerBounddry() {
         int squareMeter = 149;
         int multiFaktor = 10;
         House house = new House("test-street",2,"red",squareMeter);
         assertEquals(house.calculateRent(),(squareMeter*multiFaktor));
     }
     
     @Test
     public void shouldReturnFalse(){
         Animal animal = new Animal(4, true, "gecko", null);
         assertFalse(animal.willBeColdInWinter());
     }
     
     @Test
     public void shouldReturnTrue(){
         Animal animal = new Animal(4, false, "gecko", null);
         assertTrue(animal.willBeColdInWinter());
     }
}
