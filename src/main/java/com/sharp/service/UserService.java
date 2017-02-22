package com.sharp.service;

import com.sharp.domain.User;

import java.util.List;

/**
 * Created by 584003 on 2017/2/22.
 */
public interface UserService {
    User findById(Integer id);

    List<User> findByAge(Integer age);

    List<User> findByName(String name);

    void save(User user);

    void delete(Integer id);

    void update(User user);

}
