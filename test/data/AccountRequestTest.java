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
public class AccountRequestTest {
    
    public AccountRequestTest() {
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
     * Test of setUsername method, of class AccountRequest.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "original";
        AccountRequest instance = new AccountRequest(username, "test", "test");
        username = "new";
        instance.setUsername(username);
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of getUsername method, of class AccountRequest.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String username = "username";
        AccountRequest instance = new AccountRequest(username, "test", "test");;
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of setPassword method, of class AccountRequest.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        AccountRequest instance = new AccountRequest("test", "test", "test");
        String password = "new";
        instance.setPassword(password);
        String newPassword = instance.getPassword();
        assertEquals(password, newPassword);
    }

    /**
     * Test of getPassword method, of class AccountRequest.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String password = "password";
        AccountRequest instance = new AccountRequest("test", password, "test");;
        String newPassword = instance.getPassword();
        assertEquals(password, newPassword);
    }

    /**
     * Test of setEmail method, of class AccountRequest.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        AccountRequest instance = new AccountRequest("test", "test", "test");
        String email = "new";
        instance.setEmail(email);
        String newEmail = instance.getEmail();
        assertEquals(email, newEmail);
    }

    /**
     * Test of getEmail method, of class AccountRequest.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String email = "email";
        AccountRequest instance = new AccountRequest("test", "test", email);
        String newEmail = instance.getEmail();
        assertEquals(email, newEmail);
    }
    
}
