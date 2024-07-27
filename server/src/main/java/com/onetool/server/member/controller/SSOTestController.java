package com.onetool.server.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SSOTestController {

    @GetMapping("/login/sso")
    public String gotoSsoLoginPage() {
        return "login";
    }
}