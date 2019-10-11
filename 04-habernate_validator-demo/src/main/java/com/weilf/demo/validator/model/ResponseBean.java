package com.weilf.demo.validator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.weilf.demo.validator.model
 * Date: Created in 2019/10/11 15:45
 *
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBean {
    private String message;
    private String requid;
    private String code;
    private Object errorMsg;
}
