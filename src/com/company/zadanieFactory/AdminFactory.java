package com.company.zadanieFactory;

// Zakladamy ze admin musi byc dorosly
public class AdminFactory implements IUserFactory{
    @Override
    public IUser create(String firstName, String lastName, String email) {
        return null;
    }
}
