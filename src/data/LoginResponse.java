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
public class LoginResponse {
    private String username;
    private Boolean successful;
    private String comment;

    public LoginResponse(String username, Boolean successful, String comment) {
        this.username = username;
        this.successful = successful;
        this.comment = comment;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
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
