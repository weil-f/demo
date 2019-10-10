package com.weilf.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

/**
 * Package: com.weilf.thymeleaf.web
 * Date: Created in 2019/10/10 9:45
 *
 * @author : weil-f
 * @version : 1.0.0
 */
@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        model.addAttribute("name",list);
        return "hello";
    }
}
