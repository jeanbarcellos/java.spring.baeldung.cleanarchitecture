package com.jeanbarcellos.cleanarchitecture.usercreation.usecases;

import java.time.LocalDateTime;

import com.jeanbarcellos.cleanarchitecture.usercreation.domain.User;
import com.jeanbarcellos.cleanarchitecture.usercreation.domain.UserFactory;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserDsRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserResponseModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces.UserInputBoundary;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces.UserPresenter;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces.UserRegisterDsGateway;

public class UserRegisterInteractor implements UserInputBoundary {

    final UserRegisterDsGateway userDsGateway;
    final UserPresenter userPresenter;
    final UserFactory userFactory;

    UserRegisterInteractor(
            UserRegisterDsGateway userRegisterDfGateway,
            UserPresenter userPresenter,
            UserFactory userFactory) {
        this.userDsGateway = userRegisterDfGateway; // Data Souce Gateway de Banco de dados (Service)
        this.userPresenter = userPresenter; // Presenter
        this.userFactory = userFactory;
    }

    @Override
    public UserResponseModel create(UserRequestModel requestModel) {
        // Validação do RequestModel
        if (userDsGateway.existsByName(requestModel.getName())) {
            return userPresenter.prepareFailView("User already exists.");
        }

        // Criação da Entity
        User user = userFactory.create(requestModel.getName(), requestModel.getPassword());
        if (!user.passwordIsValid()) {
            return userPresenter.prepareFailView("User password must have more than 5 characters.");
        }

        // Criação da estrutura de dados para persistência
        LocalDateTime now = LocalDateTime.now();
        UserDsRequestModel userDsModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);

        // Persistência
        userDsGateway.save(userDsModel);

        // Criação do ResponseModel
        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());

        return userPresenter.prepareSuccessView(accountResponseModel);
    }
}