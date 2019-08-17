/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.aug17.Customer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITExps
 */
public class CustomerTest {
    Customer cust;
    
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cust = new Customer();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testName() {
        cust.setName("tom");
        assertEquals("tom", cust.getName());
    }
    
    @Test
    public void testId() {
        cust.setId(1);
        assertEquals(1, cust.getId());
    }
    
    @Test
    public void testEmail() {
        cust.setEmail("tom@abc.com");
        assertEquals("tom@abc.com", cust.getEmail());
    }
}
