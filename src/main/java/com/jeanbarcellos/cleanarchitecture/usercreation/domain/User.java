package com.jeanbarcellos.cleanarchitecture.usercreation.domain;

public interface User {
    boolean passwordIsValid();

    String getName();

    String getPassword();
}
