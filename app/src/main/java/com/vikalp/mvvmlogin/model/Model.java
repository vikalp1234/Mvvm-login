package com.vikalp.mvvmlogin.model;

import androidx.annotation.Nullable;

public class Model {
    @Nullable
    String mobile,password;

    // constructor to initialize
    // the variables
    public Model(String mobile , String password){
        this.mobile = mobile;
        this.password = password;
    }

    // getter and setter methods
    // for email variable
    @Nullable
    public String getMobile() {
        return mobile;
    }

    public void setMobile(@Nullable String mobile) {
        this.mobile = mobile;
    }

    // getter and setter methods
    // for password variable
    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }
}
