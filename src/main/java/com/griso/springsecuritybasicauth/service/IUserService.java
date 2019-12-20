package com.griso.springsecuritybasicauth.service;

import com.griso.springsecuritybasicauth.dto.UserDto;

public interface IUserService {

    UserDto findByUsername(String username);

}
