package com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserResponseModel;

/**
 * Limite de entrada do Use Case
 */
public interface UserInputBoundary {
    UserResponseModel create(UserRequestModel requestModel);
}
