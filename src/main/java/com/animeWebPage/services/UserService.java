package com.animeWebPage.services;

import com.animeWebPage.models.bindingModels.RegistrationModel;
import com.animeWebPage.models.viewModels.UserViewModel;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    void register(RegistrationModel registrationModel);

    List<UserViewModel> findAll();
}
