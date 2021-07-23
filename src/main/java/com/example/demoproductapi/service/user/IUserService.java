package com.example.demoproductapi.service.user;

import com.example.demoproductapi.model.User;
import com.example.demoproductapi.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUsername(String username);
}
