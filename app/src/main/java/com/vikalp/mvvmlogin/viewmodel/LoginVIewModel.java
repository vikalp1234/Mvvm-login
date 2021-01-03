package com.vikalp.mvvmlogin.viewmodel;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.vikalp.mvvmlogin.BR;
import com.vikalp.mvvmlogin.model.Model;

public class LoginVIewModel extends BaseObservable {

    private final Model model;


    @Bindable
    private String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getUserMobile() {
        return model.getMobile();
    }

    public void setUserMobile(String mobile) {
        model.setMobile(mobile);
        notifyPropertyChanged(BR.userMobile);
    }

    @Bindable
    public String getUserPassword() {
        return model.getPassword();
    }

    public void setUserPassword(String password) {
        model.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

      public LoginVIewModel() {

        model = new Model("","");
      }

    public void onButtonClicked() {
        String successMessage = "Login successful";
        String errorMessage = "Mobile Number or Password is not valid";
        if (isValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(getUserMobile()) && Patterns.PHONE.matcher(getUserMobile()).matches() && getUserPassword().length() > 5;
    }
}
