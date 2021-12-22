package com.jeanbarcellos.cleanarchitecture.usercreation.usecases.dtos;

public class UserRequestModel {

    String name;
    String password;

    public UserRequestModel() {
        super();
    }

    public UserRequestModel(String name, String password) {
        super();
        this.name = name;
        this.password = password;
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
}
