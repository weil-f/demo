package com.weilf.demo.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.weilf.demo.entity.UserInfo;
import com.weilf.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author weil-f
 * @since 2019-10-29
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

	@Autowired
	private IUserInfoService iUserInfoService;
	@GetMapping("test")
	public HashMap test(){
		HashMap<String, String> dataMap = new HashMap<>();
		dataMap.put("a","hello");
		return dataMap;
	}

	@GetMapping("hello")
	public UserInfo hello(){

		QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
		userInfoQueryWrapper.eq("username","test1");

		UserInfo one = iUserInfoService.getOne(userInfoQueryWrapper);
		return one;
	}
}

