package com.carry.jeecgdemo.controller;

//import com.carry.jeecgdemo.entity.user;
//import com.carry.jeecgdemo.entity.UserMapper;
//import com.carry.jeecgdemo.mapper.userMapper;

import com.carry.jeecgdemo.entity.User;
        import com.carry.jeecgdemo.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(description = "用户操作接口")
@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;
    @ApiOperation(value = "测试user接口", notes="只是测试一下user的接口哦")
    @ApiImplicitParams({@ApiImplicitParam(name = "username", value = "用户名", paramType = "query", required = true, dataType = "String"),
                        @ApiImplicitParam(name = "password", value = "密码", paramType = "query", required = true, dataType = "String")
    })
    @PostMapping("/insertUser")
    public  PageInfo<User> insertUser(@RequestParam("username")String username,@RequestParam("password")String password){


//        userExample userExample = new userExample();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
//        userMapper.insertSelective(user);
//分页
        PageHelper.startPage(1,5);//这行是重点，表示从pageNum页开始，每页pageSize条数据
//        查询

        PageInfo<User> pageInfo = new PageInfo<User>(userMapper.findAllUser());
       return pageInfo;
    }
}
