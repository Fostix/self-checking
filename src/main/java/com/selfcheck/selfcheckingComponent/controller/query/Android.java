package com.selfcheck.selfcheckingComponent.controller.query;

import com.selfcheck.selfcheckingComponent.models.Request;

public class Android {
    private Request request;

    public Android() {
        this.request = new Request();
    }

    public Request checkGetFeedbackComponent() {
        Request request = new Request();
        request.setErrorCode(400);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/feedback/get").body()));
        request.setComponent("get feedback component");
        return request;
    }

    public Request checkGetAllRoomComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/room/All").body()));
        request.setComponent("get all room component");
        return request;
    }

    public Request checkGetRoomByIdComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/room/1").body()));
        request.setComponent("get room by id component");
        return request;
    }

    public Request checkGetScheduleAllRobotsComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/schedule/All").body()));
        request.setComponent("get schedule all robots component");
        return request;
    }

    public Request checkGetScheduleByIdRobotsComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/schedule/1").body()));
        request.setComponent("get schedule by id robots component");
        return request;
    }

    public Request checkGetStatisticComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/statistic").body()));
        request.setComponent("get statistic component");
        return request;
    }

    public Request checkGetUserComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().get("http://localhost:8080/getUser").body()));
        request.setComponent("get get user component");
        return request;
    }

    public Request checkSendFeedbackComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/feedback", "nothing works").body()));
        request.setComponent("send feedback component");
        return request;
    }

    public Request checkGoBaseComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/gobase").body()));
        request.setComponent("go base component");
        return request;
    }

    public Request checkCreateRoomComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/room", "code").body()));
        request.setComponent("create room component");
        return request;
    }

    public Request checkCreateTaskInScheduleComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/schedule/create", "code").body()));
        request.setComponent("create task in schedule component");
        return request;
    }

    public Request checkSendCleanComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/schedule/launch", "code").body()));
        request.setComponent("send clean component");
        return request;
    }

    public Request checkRegistrationComponent() {
        request.setErrorCode(200);  // cause don't have component for check
        //request.setErrorCode(Integer.valueOf(new Queries().post("http://localhost:8080/registration", "code").body()));
        request.setComponent("registration component");
        return request;
    }

    //more code
}
