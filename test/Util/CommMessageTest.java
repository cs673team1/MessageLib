/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import data.AccountRequest;
import data.AccountRequestMessage;
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
public class CommMessageTest {
    
    public CommMessageTest() {
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
     * Test of getMessageData method, of class CommMessage.
     */
    @Test
    public void testGetMessageData() {
        System.out.println("getMessageData");
        AccountRequest accountRequest = new AccountRequest("username", "password", "email");
        CommMessage instance = new AccountRequestMessage(accountRequest) {};
        Object expResult = accountRequest;
        Object result = instance.getMessageData();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessageType method, of class CommMessage.
     */
    @Test
    public void testGetMessageType() {
        System.out.println("getMessageType");
        AccountRequest accountRequest = new AccountRequest("username", "password", "email");
        CommMessage instance = new AccountRequestMessage(accountRequest) {};
        CommMessage.MessageType expResult = CommMessage.MessageType.CREATE_ACCOUNT_REQUEST;
        CommMessage.MessageType result = instance.getMessageType();
        assertEquals(expResult, result);
    }

    public class Temp extends CommMessage<String> {

        public String getMessageData() {
            return null;
        }

        public MessageType getMessageType() {
            return CommMessage.MessageType.CREATE_ACCOUNT_REQUEST;
        }
    }
    
}
