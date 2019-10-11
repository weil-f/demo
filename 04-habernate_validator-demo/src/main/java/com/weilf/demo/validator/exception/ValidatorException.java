package com.weilf.demo.validator.exception;

import lombok.Data;

/**
 * Package: com.weilf.demo.validator.exception
 * Date: Created in 2019/10/11 15:43
 *
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class ValidatorException extends RuntimeException {
    private String requid;
    private String code;
    private Object errorMsg;

    public ValidatorException() {
    }

    public ValidatorException(String message) {
        super(message);
    }

    public ValidatorException(String requid, String code) {
        this.requid = requid;
        this.code = code;
    }

    public ValidatorException(String message, String requid, String code) {
        super(message);
        this.requid = requid;
        this.code = code;
    }

    public ValidatorException(String message, String requid, String code, Object errorMsg) {
        super(message);
        this.requid = requid;
        this.code = code;
        this.errorMsg = errorMsg;
    }
}
