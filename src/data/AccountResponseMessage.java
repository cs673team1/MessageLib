/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Util.CommMessage;
import data.AccountResponse;

/**
 *
 * @author lynnc
 */
public class AccountResponseMessage extends CommMessage<AccountResponse> {
    public AccountResponse accountResponse;
    
    public MessageType getMessageType() {
        return MessageType.CREATE_ACCOUNT_RESPONSE;
    }
    
    public AccountResponseMessage() {
        this.accountResponse = null;
    }
    public AccountResponseMessage(AccountResponse accountResponse) {
        this.accountResponse = accountResponse;
    }

    public AccountResponse getMessageData() {
        //String username = accountResponse.getUsername();
        //String email = accountResponse.getEmail();
        //Boolean successful = accountResponse.getSuccessful();
        //String comment = accountResponse.getComment();
        //AccountResponse newAccountResponse = new AccountResponse(username,
        //email, successful, comment);
        return accountResponse;
    }
    
    public void setAccountResponse(AccountResponse accountResponse) {
        this.accountResponse = accountResponse;
    }
    
}
