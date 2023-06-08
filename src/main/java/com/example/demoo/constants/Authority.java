package com.example.demoo.constants;

public class Authority {
    public static final String[] CLIENT_AUTHORITIES = {"user:read"};
    public static final String[] AGENCY_AUTHORITIES = {"user:read"};
    public static final String[] SUPER_ADMIN_AUTHORITIES = {"user:read", "user:create", "user:update", "user:delete"};

}
