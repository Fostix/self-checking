package com.selfcheck.selfcheckingComponent.controller;

import com.selfcheck.selfcheckingComponent.controller.query.Android;
import com.selfcheck.selfcheckingComponent.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/checkAndroidAPI")
public class AndroidController {
    @Autowired
    private RequestRepository requestRepository;

    @PostMapping(value = "/checkAllComponents")
    public @ResponseBody int ApiAndroidCheckAllComponents() {
        callApiAndroidCheckAllComponents();
        return 200;
    }

    public void callApiAndroidCheckAllComponents() {
        requestRepository.save(new Android().checkGetFeedbackComponent());
        requestRepository.save(new Android().checkGetAllRoomComponent());
        requestRepository.save(new Android().checkGetRoomByIdComponent());
        requestRepository.save(new Android().checkGetScheduleAllRobotsComponent());
        requestRepository.save(new Android().checkGetScheduleByIdRobotsComponent());
        requestRepository.save(new Android().checkGetStatisticComponent());
        requestRepository.save(new Android().checkGetUserComponent());
        requestRepository.save(new Android().checkSendFeedbackComponent());
        requestRepository.save(new Android().checkGoBaseComponent());
        requestRepository.save(new Android().checkCreateRoomComponent());
        requestRepository.save(new Android().checkSendCleanComponent());
        requestRepository.save(new Android().checkCreateTaskInScheduleComponent());
        requestRepository.save(new Android().checkSendCleanComponent());
        requestRepository.save(new Android().checkRegistrationComponent());
        // more code
        //return Android.checkRegistrationComponent();
    }
}
