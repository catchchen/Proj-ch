package com.ch.controller.rest;

import com.ch.common.Result;
import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用户控制器类
 */
@RequestMapping("/userResful")
@Controller
public class UserRestfulController {

    @Autowired
    private UserService userService;
    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<Object> login(@RequestBody UserLoginParam user , HttpSession session) {
        // 通过账号和密码查询用户
        User login = userService.userLogin(user);
        if(login == null){
            return Result.builder()
                    .msg("输入账号或密码有误")
                    .status(HttpStatus.OK.value())
                    .build();
        }
        if(login != null){
//            session.setAttribute("isAdmin",login.getIsAdmin());
            return Result.builder()
                    .msg("")
                    .status(HttpStatus.OK.value())
                    .build();
        }
            throw new RuntimeException();
    }
    /**
     * 退出登录
     */
//    @RequestMapping(value = "/logout")
//    public String logout(HttpSession session) {
        // 清除Session
// logout        session.invalidate();
//        // 重定向到登录页面的跳转方法
//        return "redirect:login.action";


    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) {
// System.out.println("=="+userid);
        User user = userService.getUser(uid);
        return user;
    }


    /**
     * 删除用户信息
     */
    @RequestMapping(value = "/changeUser")
//@ResponseBody
    public String userUpdate(User user) {

        //System.out.println("====UserControll"+user);
        int rows = userService.changeUserInfo(user);
        System.out.println();
        if(rows > 0){
            return "redirect:";// 重定向 到
        }else{
            return "FAIL"; // 修改失败的页面 点击重定向 到
        }
    }

    /**
     * 修改用户信息
     */

//    @RequestMapping(value = "/user/userUpdate.action")
//    public String userUpdate(User user) {
//
//        //System.out.println("====UserControll"+user);
//
//        int rows = userService.update(user);
//        System.out.println();
//        if(rows > 0){
//            return "redirect:userlist723.action";
//        }else{
//            return "FAIL"; //修改失败的页面
//        }
//    }

}
