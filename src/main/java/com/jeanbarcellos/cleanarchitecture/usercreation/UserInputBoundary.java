package com.jeanbarcellos.cleanarchitecture.usercreation;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
