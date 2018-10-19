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
public class LoginRequestMessageTest {
    
    public LoginRequestMessageTest() {
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
     * Test of getMessageType method, of class LoginRequestMessage.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");
        LoginRequestMessage instance = new LoginRequestMessage();
        CommMessage.MessageType expResult = CommMessage.MessageType.LOGIN_REQUEST;
        CommMessage.MessageType result = instance.getMessageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessageData method, of class LoginRequestMessage.
     */
    @Test
    public void testGetMessageData() {
        System.out.println("getMessageData");
        LoginRequest expResult = new LoginRequest("username", "email");
        LoginRequestMessage instance = new LoginRequestMessage(expResult);
        LoginRequest result = instance.getMessageData();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLoginRequest method, of class LoginRequestMessage.
     */
    @Test
    public void testSetLoginRequest() {
        System.out.println("setLoginRequest");
        LoginRequest expResult = new LoginRequest("username", "email");
        LoginRequestMessage instance = new LoginRequestMessage();
        instance.setLoginRequest(expResult);
        LoginRequest result = instance.getMessageData();
        assertEquals(expResult, result);
    }
    
}
