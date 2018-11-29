package com.bohai.fofsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cxy on 2018/11/29
 */
@Controller
public class ViewController {

    /**
     *
     * @return 登录页
     */
    @RequestMapping("/login")
    public String login()
    {
        return "login";

    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    /**
     * 登录错误，重新返回登录页
     * @param model
     * @return
     */
    @RequestMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

}
