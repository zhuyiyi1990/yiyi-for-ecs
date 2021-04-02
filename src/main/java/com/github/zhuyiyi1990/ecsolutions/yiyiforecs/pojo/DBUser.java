package com.github.zhuyiyi1990.ecsolutions.yiyiforecs.pojo;

import java.io.Serializable;

public class DBUser implements Serializable {

    private String username;

    private String password;

    private String information;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "DBUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", information='" + information + '\'' +
                '}';
    }

}
