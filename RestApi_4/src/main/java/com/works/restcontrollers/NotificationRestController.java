package com.works.restcontrollers;

import com.works.bridge.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("notification")
public class NotificationRestController {

    private final Map<String, Notification> map;

    @GetMapping("send")
    public void send(@RequestParam String type, @RequestParam String message) {
        map.get(type).send(message);
    }
}
