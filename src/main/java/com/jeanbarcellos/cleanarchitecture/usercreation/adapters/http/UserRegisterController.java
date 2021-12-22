package com.jeanbarcellos.cleanarchitecture.usercreation.adapters.http;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserResponseModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces.UserInputBoundary;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserRegisterController {

    final UserInputBoundary userInput;

    UserRegisterController(UserInputBoundary accountGateway) {
        this.userInput = accountGateway;
    }

    @PostMapping("/user")
    UserResponseModel create(@RequestBody UserRequestModel requestModel) {
        return userInput.create(requestModel);
    }
}
