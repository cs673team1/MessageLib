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
public class LoginResponseMessage extends CommMessage<LoginResponse>  {
    public LoginResponse loginResponse;
    
    public CommMessage.MessageType getMessageType() {
        return CommMessage.MessageType.LOGIN_RESPONSE;
    }
    
    public LoginResponseMessage() {
        this.loginResponse = null;
    }
    public LoginResponseMessage(LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }

    public LoginResponse getMessageData() {
        //String username = accountResponse.getUsername();
        //String email = accountResponse.getEmail();
        //Boolean successful = accountResponse.getSuccessful();
        //String comment = accountResponse.getComment();
        //AccountResponse newAccountResponse = new AccountResponse(username,
        //email, successful, comment);
        return loginResponse;
    }
    
    public void setLoginResponse(LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }    
}
