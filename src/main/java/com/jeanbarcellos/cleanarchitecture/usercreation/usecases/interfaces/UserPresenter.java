package com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserResponseModel;

public interface UserPresenter {
    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
