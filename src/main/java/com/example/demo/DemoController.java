package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.HelloService;
import com.example.demo.service.RedisCacheService;

@Controller
@RequestMapping("/api/v1")
public class DemoController {

    private final HelloService helloService;
    private final RedisCacheService redisCacheService;

    public DemoController(HelloService helloService, RedisCacheService redisCacheService) {
        this.helloService = helloService;
        this.redisCacheService = redisCacheService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(helloService.getHello("Spring"));
    }


    @GetMapping("/say/{name}/{message}")
    public ResponseEntity<Object> say(@PathVariable String name, @PathVariable String message) {
        if(redisCacheService.getData(name) == null) {
            redisCacheService.setData(name, message);
        }
        return ResponseEntity.ok(redisCacheService.getData(name));
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<String> messages(@PathVariable String name) {
        return ResponseEntity.ok(String.format("%s=%s", name, redisCacheService.getData(name)).toUpperCase());
    }
}
