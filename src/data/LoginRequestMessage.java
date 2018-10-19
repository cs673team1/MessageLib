/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Util.CommMessage;

/**
 *
 * @author lynnc
 */
public class LoginRequestMessage extends CommMessage<LoginRequest> {
    public LoginRequest loginRequest = null;
    public CommMessage.MessageType getMessageType() {
        return CommMessage.MessageType.LOGIN_REQUEST;
    }
    public LoginRequestMessage() {
        this.loginRequest = null;
    }
    public LoginRequestMessage(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }
    public LoginRequest getMessageData() {
        //String username = accountRequest.getUsername();
        //String password = accountRequest.getPassword();
       //String email = accountRequest.getEmail();
        //AccountRequest newAccountRequest = new AccountRequest(username,
        //password, email);
        return loginRequest;
    }
    public void setLoginRequest(LoginRequest loginRequest) {
        this.loginRequest = loginRequest;
    }    
}
