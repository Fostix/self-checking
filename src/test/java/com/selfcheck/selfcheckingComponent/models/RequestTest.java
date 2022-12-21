package com.selfcheck.selfcheckingComponent.models;

import com.selfcheck.selfcheckingComponent.exception.WrongSetRequestTimeException;
import com.selfcheck.selfcheckingComponent.repositories.RequestRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class RequestTest {
    @Autowired
    private RequestRepository underTest;
    private static Request request = new Request();

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @BeforeAll
    static void beforeAll() {
        request = new Request();
    }

    @Test
    public void checkTimeFunctionTest() {
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTimeInMillis());
        int endIndex = 16;
        underTest.save(request);
        assertEquals(
                request.getTimestamp().toString().substring(0, endIndex),
                timestamp.toString().substring(0, endIndex));
    }

    @Test
    public void checkIdDontRepeadTest() {
        ArrayList<Request> requestArray = new ArrayList<>();
        int count = 10000;

        for (int i = 0; i < count; i++)
            requestArray.add(underTest.save(new Request()));

        for (int i = 0; i < count; i++) {
            int id = requestArray.get(i).getId();
            for (int j = i + 1; j < count - 1; j++)
                assertNotEquals(id, requestArray.get(j).getId());
        }
    }
    @Test
    public void requestTimeTest() {
        int requestTimeSec = 10;
        request.setRequestTime(requestTimeSec);
        System.out.println(request.getRequestTime());
        assertEquals(requestTimeSec, request.getRequestTime());
    }

    @Test
    public void requestNegativeTimeExceptionTest() {
        int requestTimeSec = -10;
        boolean flag = false;
        try {
            request.setRequestTime(requestTimeSec);
        } catch (WrongSetRequestTimeException e) {
            flag = true;
        }
        assertEquals(true, flag);
    }

    @Test
    public void componentTest() {
        String text = "example";
        request.setComponent(text);
        assertEquals(text, request.getComponent());
    }

    @Test
    public void errorCodeTest() {
        int errorCode = 404;
        request.setErrorCode(errorCode);
        assertEquals(errorCode, request.getErrorCode());
    }
}