package com.jeanbarcellos.cleanarchitecture.usercreation.adapters.http;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.UserPresenter;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.UserResponseModel;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserResponseFormatter implements UserPresenter {

    @Override
    public UserResponseModel prepareSuccessView(UserResponseModel response) {
        LocalDateTime responseTime = LocalDateTime.parse(response.getCreationTime());
        response.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return response;
    }

    @Override
    public UserResponseModel prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }
}
