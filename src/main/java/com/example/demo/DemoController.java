package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class DemoController {
        @RequestMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
}
