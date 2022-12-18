package com.selfcheck.selfcheckingComponent.controller;

import com.selfcheck.selfcheckingComponent.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/checkIOSAPI")
public class IOSController {
    @Autowired
    private RequestRepository requestRepository;
    // more code
}
