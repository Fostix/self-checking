package com.selfcheck.selfcheckingComponent.controller;

import com.selfcheck.selfcheckingComponent.controller.query.Web;
import com.selfcheck.selfcheckingComponent.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/checkWebAPI")
public class WebController {
    @Autowired
    private RequestRepository requestRepository;

    @PostMapping(value = "/checkAllComponents")
    public @ResponseBody int ApiWebCheckAllComponents() {
        callApiWebCheckAllComponents();
        return 200;
    }

    public void callApiWebCheckAllComponents() {
        requestRepository.save(new Web().get("http://localhost:8080/feedback/get", "web api get feedback component"));
        requestRepository.save(new Web().get("http://localhost:8080/room/All", "web api get all room component"));
        requestRepository.save(new Web().get("http://localhost:8080/room/1", "web api get room by id component"));
        requestRepository.save(new Web().get("http://localhost:8080/schedule/All", "web api get schedule all robots component"));
        requestRepository.save(new Web().get("http://localhost:8080/schedule/1", "web api get schedule by id robots component"));
        requestRepository.save(new Web().get("http://localhost:8080/statistic", "web api get statistic component"));
        requestRepository.save(new Web().get("http://localhost:8080/getUser", "web api get get user component"));
        requestRepository.save(new Web().post("http://localhost:8080/feedback", "nothing works", "web api send feedback component"));
        requestRepository.save(new Web().post("http://localhost:8080/gobase", "web api go base component"));
        requestRepository.save(new Web().post("http://localhost:8080/room", "body code", "web api create room component"));
        requestRepository.save(new Web().post("http://localhost:8080/schedule/create", "body code", "web api create task in schedule component"));
        requestRepository.save(new Web().post("http://localhost:8080/schedule/launch", "body code", "web api send clean component"));
        requestRepository.save(new Web().post("http://localhost:8080/schedule/launch", "body cody", "web api send clean component"));
        requestRepository.save(new Web().post("http://localhost:8080/registration", "body cody", "web api registration component"));
        requestRepository.save(new Web().delete("http://localhost:8080/room/1", "web api delete room by id component"));
        requestRepository.save(new Web().delete("http://localhost:8080/schedule/1", "web api delete task by id component"));
        requestRepository.save(new Web().put("http://localhost:8080/room/1", "body cody", "web api update room by id component"));
        requestRepository.save(new Web().put("http://localhost:8080/schedule/1", "body cody", "web api update task by id component"));
        requestRepository.save(new Web().put("http://localhost:8080/updateUser", "body cody", "web api update user component"));
    }
}
