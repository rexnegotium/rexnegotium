package com.rexnegotium.model;

public enum Role {
    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

}
