package com.jeanbarcellos.cleanarchitecture.usercreation;

interface User {
    boolean passwordIsValid();

    String getName();

    String getPassword();
}
