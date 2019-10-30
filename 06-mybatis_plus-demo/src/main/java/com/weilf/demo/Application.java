package com.weilf.demo;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package: com.weilf.demo
 * Date: Created in 2019-10-30 16:03
 * springBoot与mybatis-plus集成的demo
 * @Version: 1.0.0
 * @author: weilai
 */
@SpringBootApplication
@MapperScan(basePackages = "com.weilf.demo.mapper")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
	}
}
