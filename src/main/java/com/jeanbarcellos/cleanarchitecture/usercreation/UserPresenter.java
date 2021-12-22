package com.jeanbarcellos.cleanarchitecture.usercreation;

interface UserPresenter {
    UserResponseModel prepareSuccessView(UserResponseModel user);

    UserResponseModel prepareFailView(String error);
}
