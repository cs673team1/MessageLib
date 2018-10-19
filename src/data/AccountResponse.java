/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author lynnc
 */
public class AccountResponse {
    private String username;
    private String email;
    private Boolean successful;
    private String comment;
    
    public AccountResponse(String username, String email, Boolean successful,
            String comment) {
        this.username = username;
        this.email = email;
        this.successful = successful;
        this.comment = comment;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }
    
    public Boolean getSuccessful() {
        return successful;
    }    
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public String getComment() {
        return this.comment;
    }    
}
