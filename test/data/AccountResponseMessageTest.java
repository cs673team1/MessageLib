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
public class AccountResponseMessageTest {
    
    public AccountResponseMessageTest() {
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
     * Test of getMessageType method, of class CreateAccountResponse.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");
        AccountResponseMessage instance = new AccountResponseMessage();
        CommMessage.MessageType expResult = CommMessage.MessageType.CREATE_ACCOUNT_RESPONSE;
        CommMessage.MessageType result = instance.getMessageType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessageData method, of class CreateAccountResponse.
     */
    @Test
    public void testGetMessageData() {
        System.out.println("getMessageData");
        AccountResponse expResult = new AccountResponse("username", "email", true, "comment");
        AccountResponseMessage instance = new AccountResponseMessage(expResult);
        AccountResponse result = instance.getMessageData();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAccountResponse method, of class CreateAccountResponse.
     */
    @Test
    public void testSetAccountResponse() {
        System.out.println("setAccountResponse");
        AccountResponse expResult = new AccountResponse("username", "email", false, "comment");
        AccountResponseMessage instance = new AccountResponseMessage();
        instance.setAccountResponse(expResult);
        AccountResponse result = instance.getMessageData();
        assertEquals(expResult, result);
    }
    
}
