package com.jeanbarcellos.cleanarchitecture.usercreation.usecases;

public interface UserPresenter {
    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
