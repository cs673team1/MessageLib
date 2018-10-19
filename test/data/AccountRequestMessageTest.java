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
public class AccountRequestMessageTest {
    
    public AccountRequestMessageTest() {
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
     * Test of getMessageType method, of class CreateAccountRequest.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");
        AccountRequestMessage instance = new AccountRequestMessage();
        CommMessage.MessageType expResult = CommMessage.MessageType.CREATE_ACCOUNT_REQUEST;
        CommMessage.MessageType result = instance.getMessageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessageData method, of class CreateAccountRequest.
     */
    @Test
    public void testGetMessageData() {
        System.out.println("getMessageData");
        AccountRequest expResult = new AccountRequest("username", "password", "email");
        AccountRequestMessage instance = new AccountRequestMessage(expResult);
        AccountRequest result = instance.getMessageData();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccountRequest method, of class CreateAccountRequest.
     */
    @Test
    public void testSetAccountRequest() {
        System.out.println("setAccountRequest");
        AccountRequest expResult = new AccountRequest("username", "password", "email");
        AccountRequestMessage instance = new AccountRequestMessage();
        instance.setAccountRequest(expResult);
        AccountRequest result = instance.getMessageData();
        assertEquals(expResult, result);
    }
    
}
