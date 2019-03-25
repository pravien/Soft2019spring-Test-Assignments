package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import src.Account;
import src.Bank;
import java.time.Duration;
import java.util.Random;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runners.Parameterized;

/**
 *
 * @author pravien
 */
public class NewEmptyJUnitTest {

    static Bank bank;

    static Boolean random_b;

    public NewEmptyJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {

        bank = new Bank();
        Random random = new Random();
        random_b = random.nextBoolean();
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
    public void shouldReturnThreepercent() {
        Account account = new Account(90);
        double rate = 0.03;
        double interest = bank.calculateYearlyInterest(account);
        double expected = rate * account.getBalance();
        assertEquals(expected, interest, 0);

        account.setBalance(-1);
        interest = bank.calculateYearlyInterest(account);
        expected = rate * account.getBalance();
        assertNotEquals(expected, interest, 0);

        account.setBalance(100);
        interest = bank.calculateYearlyInterest(account);
        expected = rate * account.getBalance();
        assertNotEquals(expected, interest, 0);

    }

    @Test
    public void shouldReturnFivePercent() {

        Account account = new Account(100);
        double rate = 0.05;
        double interest = bank.calculateYearlyInterest(account);
        double expected = rate * account.getBalance();
        assertEquals(expected, interest, 0);

        account.setBalance(99);
        interest = bank.calculateYearlyInterest(account);
        expected = rate * account.getBalance();
        assertNotEquals(expected, interest, 0);

        account.setBalance(1000);
        interest = bank.calculateYearlyInterest(account);
        expected = rate * account.getBalance();
        assertNotEquals(expected, interest, 0);

    }

    @Test
    public void shouldReturnSevenPercent() {

        Account account = new Account(1000);
        double rate = 0.07;
        double interest = bank.calculateYearlyInterest(account);
        double expected = rate * account.getBalance();
        assertEquals(expected, interest, 0);

        account.setBalance(999);
        interest = bank.calculateYearlyInterest(account);
        expected = rate * account.getBalance();
        assertNotEquals(expected, interest, 0);

    }

    @Test
    @DisplayName("yolo")
    //@Ignore("eightDifferentAssertions")
    public void eightDifferentAssertions() {

        Account account = new Account(100);
        assertEquals(5.00, bank.calculateYearlyInterest(account), 0);
        assertNotEquals(10, bank.calculateYearlyInterest(account), 0);
        assertTrue(bank.calculateYearlyInterest(account) == 5.00);
        assertFalse(bank.calculateYearlyInterest(account) != 5.00);
        Assertions.assertAll(("header String"),
                () -> assertTrue(bank.calculateYearlyInterest(account) == 5.00),
                () -> assertFalse(bank.calculateYearlyInterest(account) != 5.00)
        );
        Bank bank2 = null;
        assertNull(bank2);
        assertNotNull(account);
        assertArrayEquals(new int[3], new int[3]);
        // Enable this to check if random work
        //assertTrue(random_b);

        // enable to check sleep
//        Assertions.assertTimeout(Duration.ofMillis(10), () -> {
//            // Simulate task that takes more than 10 ms.
//            Thread.sleep(100);
//        });

        //Change to false to verify task 8.
        Assertions.assertTrue(true,() -> {
            String temp = "Lambda message";
            System.out.println(temp);
            return temp;
        });
        
       
    }
    @Test
    public void task9(){
         Assertions.assertAll(this::eightDifferentAssertions);
    }
}
