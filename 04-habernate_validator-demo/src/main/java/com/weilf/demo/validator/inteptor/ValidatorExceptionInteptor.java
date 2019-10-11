package com.weilf.demo.validator.inteptor;

import com.weilf.demo.validator.exception.ValidatorException;
import com.weilf.demo.validator.model.ResponseBean;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * Package: com.weilf.demo.validator.inteptor
 * Date: Created in 2019/10/11 15:30
 *
 * @author : weil-f
 * @version : 1.0.0
 */
@RestControllerAdvice
@Component
public class ValidatorExceptionInteptor {

    @ExceptionHandler(ValidatorException.class)
    public ResponseBean handle(ValidatorException exception) {
        ResponseBean responseBean = new ResponseBean();
        BeanUtils.copyProperties(exception,responseBean);
        return responseBean;
    }
}
