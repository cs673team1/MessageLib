/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Util.CommMessage;
import data.LoginRequest;

/**
 *
 * @author lynnc
 */
public class AccountRequestMessage extends CommMessage<AccountRequest> {
    public AccountRequest accountRequest = null;
    public MessageType getMessageType() {
        return MessageType.CREATE_ACCOUNT_REQUEST;
    }
    public AccountRequestMessage() {
        this.accountRequest = null;
    }
    public AccountRequestMessage(AccountRequest accountRequest) {
        this.accountRequest = accountRequest;
    }
    public AccountRequest getMessageData() {
        //String username = accountRequest.getUsername();
        //String password = accountRequest.getPassword();
       //String email = accountRequest.getEmail();
        //AccountRequest newAccountRequest = new AccountRequest(username,
        //password, email);
        return accountRequest;
    }
    public void setAccountRequest(AccountRequest accountRequest) {
        this.accountRequest = accountRequest;
    }
    
}
