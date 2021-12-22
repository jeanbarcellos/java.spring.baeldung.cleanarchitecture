package com.jeanbarcellos.cleanarchitecture.usercreation.domain;

public interface UserFactory {
    User create(String name, String password);
}
