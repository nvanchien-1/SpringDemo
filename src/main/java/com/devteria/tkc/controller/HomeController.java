package com.devteria.tkc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(Model model) {

        model.addAttribute("message", "Chào mừng đến với trang chủ!");
        return "/WEB-INF/views/index.jsp";
    }
}
