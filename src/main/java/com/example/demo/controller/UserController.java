package com.example.demo.controller;

import com.example.demo.domain.form.AddUserForm;
import com.example.demo.domain.vo.UserInfoVo;
import com.example.demo.handler.Response;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * @author zcl
 * @date 2017/6/10
 */
@RestController
@RequestMapping(value="/api/user")
@Api(value = "/api/user", description = "用户控制层 API", position = 1)
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/list",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "查询所有用户信息", notes = "查询用户", code = 200, produces = "application/json")
    public ResponseEntity list() {
        List<UserInfoVo> list = userService.queryAllUsers();
        return Response.success(list);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/add",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "新增用户", notes = "新增用户", code = 200, produces = "application/json")
    public ResponseEntity addUser(@RequestBody AddUserForm user) {
        return Response.success(userService.addUser(user));
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ApiOperation(value = "查询用户", notes = "查询用户", code = 200, produces = "application/json")
    public ResponseEntity query(@PathVariable Long id) {
        UserInfoVo userInfo =  userService.queryUserInfo(id);
        return Response.success(userInfo);
    }
}
