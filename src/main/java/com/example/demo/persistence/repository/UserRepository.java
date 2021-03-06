package com.example.demo.persistence.repository;


import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author zcl
 * @date 2017/5/23
 */

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User findByName(String name);

    User findByNameAndAge(String name, Integer age);

    @Query("FROM User u WHERE u.name=:name")
    User findUser(@Param("name") String name);
}
