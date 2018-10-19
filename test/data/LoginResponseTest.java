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
public class LoginResponseTest {
    
    public LoginResponseTest() {
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
     * Test of setUsername method, of class LoginResponse.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "original";
        LoginResponse instance = new LoginResponse(username, true, "test");
        username = "new";
        instance.setUsername(username);
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of getUsername method, of class LoginResponse.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String username = "username";
        LoginResponse instance = new LoginResponse(username, true, "test");
        String newUsername = instance.getUsername();
        assertEquals(username, newUsername);
    }

    /**
     * Test of setSuccessful method, of class LoginResponse.
     */
    @Test
    public void testSetSuccessful() {
        System.out.println("setSuccessful");
        LoginResponse instance = new LoginResponse("test", true, "test");
        Boolean successful = false;
        instance.setSuccessful(successful);
        Boolean newSuccessful = instance.getSuccessful();
        assertEquals(successful, newSuccessful);
    }

    /**
     * Test of getSuccessful method, of class LoginResponse.
     */
    @Test
    public void testGetSuccessful() {
        System.out.println("getSuccessful");
        Boolean successful = false;
        LoginResponse instance = new LoginResponse("test", successful, "test");
        Boolean newSuccessful = instance.getSuccessful();
        assertEquals(successful, newSuccessful);
    }

    /**
     * Test of setComment method, of class LoginResponse.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        LoginResponse instance = new LoginResponse("test", true, "test");
        String expResult = "new";
        instance.setComment(expResult);
        String result = instance.getComment();
        assertEquals(expResult, result); 
    }

    /**
     * Test of getComment method, of class LoginResponse.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        String expResult = "comment";
        LoginResponse instance = new LoginResponse("test", true, expResult);
        String result = instance.getComment();
        assertEquals(expResult, result);
    }
    
}
