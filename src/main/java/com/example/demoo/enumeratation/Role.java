package com.example.demoo.enumeratation;

import static com.example.demoo.constants.Authority.*;

public enum Role {
    ROLE_USER(CLIENT_AUTHORITIES),
    ROLE_ADMIN(SUPER_ADMIN_AUTHORITIES);

    private String[] authorities;
    Role(String... authorities) {
        this.authorities = authorities;
    }

    public String[] getAuthorities() {
        return authorities;
    }


}
