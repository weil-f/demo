package com.weilf.demo;

import com.weilf.demo.entity.UserInfo;
import com.weilf.demo.mapper.UserInfoMapper;
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
	}

}