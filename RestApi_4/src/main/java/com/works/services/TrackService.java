package com.works.services;

import com.works.adapter.TrackingService;
import com.works.composite.FileSystemComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TrackService {

    private final Map<String, TrackingService> map;
    private final FileSystemService fileSystemService;

    public String send(String type, String number) {
        System.out.println(map);
        System.out.println("Size : " + fileSystemService.calculateSize());
        return map.get(type).track(number);
    }


}
