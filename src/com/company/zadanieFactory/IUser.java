package com.company.zadanieFactory;

public interface IUser {
    Role getRole();
    String getFullName();
    String getEmail();
    boolean isAdult();
}
