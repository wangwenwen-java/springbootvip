package cn.enjoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller  //返回的是jsp
@RequestMapping("/jsp")
public class JspController {

    @RequestMapping("/hi")
    public String sayHello() {
        return "index";
    }
}
