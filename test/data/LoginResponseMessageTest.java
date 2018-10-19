/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Util.CommMessage;
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
public class LoginResponseMessageTest {
    
    public LoginResponseMessageTest() {
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
     * Test of getMessageType method, of class LoginResponseMessage.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");
        LoginResponseMessage instance = new LoginResponseMessage();
        CommMessage.MessageType expResult = CommMessage.MessageType.LOGIN_RESPONSE;
        CommMessage.MessageType result = instance.getMessageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessageData method, of class LoginResponseMessage.
     */
    @Test
    public void testGetMessageData() {
        System.out.println("getMessageData");
        LoginResponse expResult = new LoginResponse("username", true, "comment");
        LoginResponseMessage instance = new LoginResponseMessage(expResult);
        LoginResponse result = instance.getMessageData();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLoginResponse method, of class LoginResponseMessage.
     */
    @Test
    public void testSetLoginResponse() {
        System.out.println("setLoginResponse");
        LoginResponse expResult = new LoginResponse("username", false, "comment");
        LoginResponseMessage instance = new LoginResponseMessage();
        instance.setLoginResponse(expResult);
        LoginResponse result = instance.getMessageData();
        assertEquals(expResult, result);
    }
    
}
