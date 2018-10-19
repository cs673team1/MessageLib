/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author lynnc
 * @param <T>
 */
public abstract class CommMessage<T> implements java.io.Serializable {
   public enum MessageType {
    CREATE_ACCOUNT_REQUEST, CREATE_ACCOUNT_RESPONSE, DELETE_ACCOUNT_REQUEST, 
    DELETE_ACCOUNT_RESPONSE, LOGIN_REQUEST, LOGIN_RESPONSE 
    }
      
   public abstract T getMessageData();
   public abstract MessageType getMessageType();
       
}
