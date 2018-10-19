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
public class LoginRequestTest {
    
    public LoginRequestTest() {
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
     * Test of setUsername method, of class LoginRequest.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "original";
        LoginRequest instance = new LoginRequest(username, "test");
        username = "new";
        instance.setUsername(username);
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of getUsername method, of class LoginRequest.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String username = "username";
        LoginRequest instance = new LoginRequest(username, "test");
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of setPassword method, of class LoginRequest.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        LoginRequest instance = new LoginRequest("test", "test");
        String password = "new";
        instance.setPassword(password);
        String newPassword = instance.getPassword();
        assertEquals(password, newPassword);
    }

    /**
     * Test of getPassword method, of class LoginRequest.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String password = "password";
        LoginRequest instance = new LoginRequest("test", password);
        String newPassword = instance.getPassword();
        assertEquals(password, newPassword);
    }
    
}
