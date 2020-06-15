package com.welf.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package: PACKAGE_NAME
 * Date: Created in 2020-05-19 8:56
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@SpringBootApplication(scanBasePackages = "com.welf.security")
public class SecurityStart {
    public static void main(String[] args) {
        SpringApplication.run(SecurityStart.class,args);
    }
}
