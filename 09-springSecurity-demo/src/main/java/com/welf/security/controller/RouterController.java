package com.welf.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Package: com.welf.security.controller
 * Date: Created in 2020-05-19 9:24
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@Controller
public class RouterController {

    @GetMapping("detail")
    public String detail(){
        return "detail";
    }


}
