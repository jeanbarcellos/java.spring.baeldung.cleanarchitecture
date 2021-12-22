package com.jeanbarcellos.cleanarchitecture.usercreation.adapters.database;

import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos.UserDsRequestModel;
import com.jeanbarcellos.cleanarchitecture.usercreation.usecases.interfaces.UserRegisterDsGateway;

/**
 * Serviço de Persistência
 * Repository (Interface)
 */
class JpaUser implements UserRegisterDsGateway {

    final JpaUserRepository repository;

    JpaUser(JpaUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel requestModel) {
        UserDataMapper accountDataMapper = new UserDataMapper(requestModel.getName(), requestModel.getPassword(),
                requestModel.getCreationTime());
        repository.save(accountDataMapper);
    }
}
