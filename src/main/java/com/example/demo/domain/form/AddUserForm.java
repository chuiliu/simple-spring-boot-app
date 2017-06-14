package com.example.demo.domain.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zcl
 * @date 2017/6/12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddUserForm {

    private String name;
    private Integer age;
}
