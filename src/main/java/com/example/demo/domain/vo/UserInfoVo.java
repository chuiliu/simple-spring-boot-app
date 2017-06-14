package com.example.demo.domain.vo;

import com.example.demo.domain.emuns.UserStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zcl
 * @date 2017/6/9
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoVo {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private UserStatusEnum status;
}
