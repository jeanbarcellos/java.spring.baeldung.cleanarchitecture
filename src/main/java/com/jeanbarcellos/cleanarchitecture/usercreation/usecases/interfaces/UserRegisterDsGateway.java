package com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserDsRequestModel;

/**
 * Data Source Gateway - Fonte de dados do gateway
 * Repository (Interface)
 * Serviço de Banco de Dados
 */
public interface UserRegisterDsGateway {
    boolean existsByName(String identifier);

    void save(UserDsRequestModel requestModel);
}
