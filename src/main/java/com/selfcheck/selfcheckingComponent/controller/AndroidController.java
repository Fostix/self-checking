package com.selfcheck.selfcheckingComponent.controller;

import com.selfcheck.selfcheckingComponent.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/checkAndroidAPI")
public class AndroidController {
    @Autowired
    private RequestRepository requestRepository;
    // more code for android
}
