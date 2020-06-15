package com.weilf.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * Package: com.weilf.test
 * Date: Created in 2019-11-14 12:57
 *
 * @Version: 1.0.0
 * @author: weilai
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<String> iconList = new ArrayList<String>();
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/1.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/2.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/3.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/4.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/5.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/6.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/7.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/8.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/9.png");
		iconList.add("https://siwujie.oss-cn-beijing.aliyuncs.com/juran/baisc/app/headericon/10.png");
		Random random = new Random();
		for (int j = 0;j<100;j++){
			int i = random.nextInt(iconList.size());
			System.out.println(iconList.get(i));
		}

	}
}
