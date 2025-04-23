package com.stunning.UserService.service;

import com.stunning.UserService.dto.UserDTO;
import com.stunning.UserService.mapper.UserMapper;
import com.stunning.UserService.model.User;
import com.stunning.UserService.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserServiceImp(UserMapper userMapper, UserRepository UserRepository) {
        this.userMapper = userMapper;
        this.userRepository = UserRepository;
    }
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User newUser = userMapper.toUserEntity(userDTO);
        User savedUser = userRepository.save(newUser);
        return userMapper.toUserDTO(savedUser);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toUserDTO)
                .collect(Collectors.toList());
    }
}
