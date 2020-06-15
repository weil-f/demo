package com.weilf.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.weilf.demo.entity.UserInfo;
import com.weilf.demo.mapper.UserInfoMapper;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Test
	public void mapperTest(){
		List<UserInfo> userInfos = userInfoMapper.selectList(null);
		System.out.println(userInfos);
		Page<UserInfo> userInfoPage = new Page<>(2,3);
		QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
		userInfoQueryWrapper.eq("usertype",1);
		IPage<UserInfo> userInfoIPage = userInfoMapper.selectPage(userInfoPage, userInfoQueryWrapper);
		System.out.println(userInfoIPage.getRecords().toString());
	}

}