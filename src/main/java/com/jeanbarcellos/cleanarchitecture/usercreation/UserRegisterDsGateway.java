package com.jeanbarcellos.cleanarchitecture.usercreation;

interface UserRegisterDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);
}
