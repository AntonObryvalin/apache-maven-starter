package com.dmdev.database.dao;

import com.dmdev.database.dao.UserDao;
import com.dmdev.database.dao.entity.User;

import java.io.OptionalDataException;
import java.util.Optional;

public class UserDao {
    public Optional<User> findbyId(Long id) {
        return Optional.empty();
    }

    public Optional<Object> findById(Long id) {
        return null;
    }
}
