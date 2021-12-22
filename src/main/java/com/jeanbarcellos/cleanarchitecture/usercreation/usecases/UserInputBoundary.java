package com.jeanbarcellos.cleanarchitecture.usercreation.usecases;

public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
