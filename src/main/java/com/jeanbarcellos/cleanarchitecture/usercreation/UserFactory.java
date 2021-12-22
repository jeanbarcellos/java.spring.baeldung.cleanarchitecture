package com.jeanbarcellos.cleanarchitecture.usercreation;

interface UserFactory {
    User create(String name, String password);
}
