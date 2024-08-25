package com.dmdev.service.service;

import com.dmdev.database.dao.UserDao;
import com.dmdev.database.dao.entity.User;
import com.dmdev.service.service.dto.UserDto;

import java.io.OptionalDataException;
import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id).map(it -> new UserDto());

    }
}
