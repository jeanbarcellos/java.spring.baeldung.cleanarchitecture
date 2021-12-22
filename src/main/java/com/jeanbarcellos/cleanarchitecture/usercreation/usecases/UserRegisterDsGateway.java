package com.jeanbarcellos.cleanarchitecture.usercreation.usecases;

public interface UserRegisterDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);
}
