package com.example.demo.domain;


import com.example.demo.domain.emuns.UserStatusEnum;
import lombok.Data;

import javax.persistence.*;

/**
 * @author zcl
 * @date 2017/5/23
 */
@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private Integer age;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "status")
    private UserStatusEnum status;
}
