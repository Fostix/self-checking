package com.selfcheck.selfcheckingComponent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/tt")
public class HereTest {
    @RequestMapping("/t")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }
}
