package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.emuns.UserStatusEnum;
import com.example.demo.domain.form.AddUserForm;
import com.example.demo.domain.vo.UserInfoVo;
import com.example.demo.persistence.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zcl
 * @date 2017/6/12
 */
@Service
@Transactional
public class UserService {

    @Inject
    private UserRepository userRepository;

    public List<UserInfoVo> queryUserInfo() {
        List<User> userList = userRepository.findAll();
        List<UserInfoVo> userInfoList = new ArrayList<UserInfoVo>();

        for (User user: userList) {
            UserInfoVo userInfo = new UserInfoVo();
            BeanUtils.copyProperties(user, userInfo);
            userInfoList.add(userInfo);
        }

        return userInfoList;
    }

    public Boolean addUser(AddUserForm userForm) {
        User user = new User();
        user.setName(userForm.getName());
        user.setAge(userForm.getAge());
        user.setPassword("");
        user.setStatus(UserStatusEnum.VALID);
        User u = userRepository.save(user);
        System.out.print(u);
        return true;
    }
}
