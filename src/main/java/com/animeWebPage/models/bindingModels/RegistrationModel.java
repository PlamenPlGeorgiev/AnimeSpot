package com.animeWebPage.models.bindingModels;

import com.animeWebPage.customValidations.IsPasswordsMatching;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@IsPasswordsMatching
public class RegistrationModel {

    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters")
    private String username;

    @Pattern(regexp = "^(.+)@(.+)$", message = "Invalid email")
    private String email;

    @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$",
            message = "Password must be between 8 and 15 characters")
    private String password;

    private String confirmPassword;

    @NotNull
    private String location;

    public RegistrationModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
