/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eval;

/**
 *
 * @author zlkid
 */
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("loginBean")
@SessionScoped
public class LoginBean implements Serializable {
    private String username;
    private String password;
    private boolean loggedIn;

    public String login() {
        if ("student".equals(username) && "java".equals(password)) {
            loggedIn = true;
            return "welcome.xhtml?faces-redirect=true";
        }
        return "login.xhtml";
    }

    public String getUsername() { 
        return username; 
    }
    public void setUsername(String username) { 
        this.username = username; 
    }
    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }
    public boolean isLoggedIn() { 
        return this.loggedIn; 
    }
    
    
    
}
