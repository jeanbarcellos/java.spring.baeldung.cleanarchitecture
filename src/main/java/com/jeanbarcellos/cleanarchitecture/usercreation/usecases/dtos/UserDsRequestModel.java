package com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos;

import java.time.LocalDateTime;

/**
 * Estrutura de dados que transitará entre o UseCase o a Persistência
 */
public class UserDsRequestModel {

    String name;
    String password;
    LocalDateTime creationTime;

    public UserDsRequestModel(String name, String password, LocalDateTime creationTime) {
        this.name = name;
        this.password = password;
        this.creationTime = creationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

}
