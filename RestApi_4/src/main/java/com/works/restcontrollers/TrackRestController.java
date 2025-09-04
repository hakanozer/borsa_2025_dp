package com.works.restcontrollers;

import com.works.decorator.OrderRequest;
import com.works.decorator.SimpleOrderProcess;
import com.works.services.TrackService;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TrackRestController {

    final SimpleOrderProcess simpleOrderProcess;
    final TrackService trackService;

    @GetMapping("track")
    public String track(@RequestParam(defaultValue = "arasApi") String type, @RequestParam String number) {
        return trackService.send(type, number);
    }

    @GetMapping("decorator")
    public void decorator(OrderRequest orderRequest) {
        simpleOrderProcess.process(orderRequest);
    }

}
