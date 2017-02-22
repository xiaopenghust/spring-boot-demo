package com.sharp.dao;

import com.sharp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 584003 on 2017/2/22.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(Integer id);

    List<User> findByAge(Integer age);

    List<User> findByNameContaining(String name);
}
