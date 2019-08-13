package com.rexnegotium.model;

import java.util.Date;
import java.util.Set;

public class User {

    private String name;
    private String email;
    private char[] password;
    private boolean enabled;
    private Date registered;
    private Set<Role> roles;
    
    public String getName() {
    	return name;
    }    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getEmail() {
    	return email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public char[] getPassword() {
    	return password;
    }
    public void setPassword(char[] password) {
    	this.password = password;
    }
    
    /**
     * ATTENTION - IS_enabled
     * Why? Hint: search for "codeconventions-150003.pdf"
     */
    public boolean isEnabled() {
    	return enabled;
    }
    public void setEnabled(boolean enabled) {
    	this.enabled = enabled;
    }
    
    public Date getRegistered() {
    	return registered;
    }
    public void setRegistered(Date registered) {
    	this.registered = registered;
    }
    
    public Set<Role> getRoles() {
    	return roles;
    }
    public void setRoles(Set<Role> roles) {
    	this.roles = roles;
    }
}
