package com.jeanbarcellos.cleanarchitecture.usercreation.domain;

class CommonUserFactory implements UserFactory {
    @Override
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
