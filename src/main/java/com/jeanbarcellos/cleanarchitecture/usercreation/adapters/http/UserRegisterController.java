package com.jeanbarcellos.cleanarchitecture.usercreation.adapters.http;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.UserInputBoundary;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.UserRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.UserResponseModel;

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
