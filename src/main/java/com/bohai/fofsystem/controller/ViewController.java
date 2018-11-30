package com.bohai.fofsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
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
    @GetMapping("/login")
    public String login()
    {
        return "login";

    }
    @GetMapping("/")
    public String index()
    {
        return "login";

    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
    @RequestMapping("/product")
    public String product(){
        return "product";
    }
    
    @RequestMapping("/adminScore")
    public String adminScore(){
        return "adminScore";
    }

    /**
     * 登录错误，重新返回登录页
     * @param model
     * @return
     */
    @GetMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

}
