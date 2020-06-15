package com.weilf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: com.weilf.controller
 * Date: Created in 2020-04-11 21:54
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@RestController
public class TestController {

	@GetMapping("test")
	public Map test(String name){
		HashMap<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("hello",name);
		return dataMap;
	}
}
