package com.rexnegotium.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;

public class User {

	private Integer id;
    private String name;
    private String email;
    private char[] password;
    private boolean enabled;
    private LocalDate registered;
    private Set<Role> roles;

    public User() {
    }

    public User(String name, String email, char[] password, boolean enabled, LocalDate registered, Set<Role> roles) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.registered = registered;
        this.roles = roles;
    }

    public Integer getId() {
    	return id;
    }
    public void setId(Integer id) {
    	this.id = id;
    }
    
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
    
    public LocalDate getRegistered() {
    	return registered;
    }
    public void setRegistered(LocalDate registered) {
    	this.registered = registered;
    }
    
    public Set<Role> getRoles() {
    	return roles;
    }
    public void setRoles(Set<Role> roles) {
    	this.roles = roles;
    }

    /**
     *  Обрати внимание - пароль мы не вываодим! Нигде и никогда!
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                ", roles=" + roles +
                '}';
    }
}
