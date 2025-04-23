package com.stunning.UserService.service;

import com.stunning.UserService.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();

}
