package com.company.zadanieFactory;

// Zakladamy ze moderator musi byc dorosly
public class ModeratorFactory implements IUserFactory {
    @Override
    public IUser create(String firstName, String lastName, String email) {
        return null;
    }
}
