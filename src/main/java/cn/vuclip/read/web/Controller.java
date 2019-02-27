package cn.vuclip.read.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Very good！大家好，很高兴见到各位！";
    }
}