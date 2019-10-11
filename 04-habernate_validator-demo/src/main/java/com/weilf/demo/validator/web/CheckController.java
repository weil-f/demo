package com.weilf.demo.validator.web;

import com.alibaba.fastjson.JSON;
import com.weilf.demo.validator.exception.ValidatorException;
import com.weilf.demo.validator.vo.SigningVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Package: com.weilf.demo.validator.web
 * Date: Created in 2019/10/11 15:21
 *
 * @author : weil-f
 * @version : 1.0.0
 */
@Controller
public class CheckController {


    @GetMapping("test")
    @ResponseBody
    public String checkSigningVO(@Validated SigningVO signingVO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            List<String> errorMsg = allErrors.stream().map(a -> a.getDefaultMessage()).collect(Collectors.toList());
            throw new ValidatorException("参数有误",String.valueOf(System.currentTimeMillis()),"400",errorMsg);

        }
        System.out.println(JSON.toJSONString(signingVO));
        return "hello";
    }
}
