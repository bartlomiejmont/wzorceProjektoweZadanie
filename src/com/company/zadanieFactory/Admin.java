package com.company.zadanieFactory;

public class Admin implements IUser{
    @Override
    public Role getRole() {
        return Role.ADMIN;
    }

    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public boolean isAdult() {
        return false;
    }
}
