package com.weilf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package: com.welf
 * Date: Created in 2020-04-20 16:38
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@SpringBootApplication
@MapperScan(basePackages = "com.weilf.mapper")
public class ActivitiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ActivitiApplication.class,args);
	}
}
