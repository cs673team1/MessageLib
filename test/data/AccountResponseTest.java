/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lynnc
 */
public class AccountResponseTest {
    
    public AccountResponseTest() {
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

    /**
     * Test of setUsername method, of class AccountResponse.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "original";
        AccountResponse instance = new AccountResponse(username, "test", true, "test");
        username = "new";
        instance.setUsername(username);
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of getUsername method, of class AccountResponse.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String username = "username";
        AccountResponse instance = new AccountResponse(username, "test", true, "test");
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of setEmail method, of class AccountResponse.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        AccountResponse instance = new AccountResponse("test", "test", true, "test");
        String email = "new";
        instance.setEmail(email);
        String newEmail = instance.getEmail();
        assertEquals(email, newEmail);
    }

    /**
     * Test of getEmail method, of class AccountResponse.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String email = "email";
        AccountResponse instance = new AccountResponse("test", email, true, "test");
        String newEmail = instance.getEmail();
        assertEquals(email, newEmail);
    }

    /**
     * Test of setSuccessful method, of class AccountResponse.
     */
    @Test
    public void testSetSuccessful() {
        System.out.println("setSuccessful");
        AccountResponse instance = new AccountResponse("test", "test", true, "test");
        Boolean successful = false;
        instance.setSuccessful(successful);
        Boolean newSuccessful = instance.getSuccessful();
        assertEquals(successful, newSuccessful);
    }

    /**
     * Test of getSuccessful method, of class AccountResponse.
     */
    @Test
    public void testGetSuccessful() {
        System.out.println("getSuccessful");
        Boolean successful = false;
        AccountResponse instance = new AccountResponse("test", "test", successful, "test");
        Boolean newSuccessful = instance.getSuccessful();
        assertEquals(successful, newSuccessful);
    }

    /**
     * Test of setComment method, of class AccountResponse.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        AccountResponse instance = new AccountResponse("test", "test", true, "test");
        String expResult = "new";
        instance.setComment(expResult);
        String result = instance.getComment();
        assertEquals(expResult, result); 
    }

    /**
     * Test of getComment method, of class AccountResponse.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        String expResult = "comment";
        AccountResponse instance = new AccountResponse("test", "test", true, expResult);
        String result = instance.getComment();
        assertEquals(expResult, result);
    }
    
}
