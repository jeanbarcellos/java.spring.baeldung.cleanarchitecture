package com.jeanbarcellos.cleanarchitecture.usercreation.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.jeanbarcellos.cleanarchitecture.usercreation.domain.CommonUser;
import com.jeanbarcellos.cleanarchitecture.usercreation.domain.User;

import org.junit.jupiter.api.Test;

class UserUnitTest {

    @Test
    void given123Password_whenPasswordIsNotValid_thenIsFalse() {
        User user = new CommonUser("Baeldung", "123");

        assertThat(user.passwordIsValid()).isFalse();
    }
}
