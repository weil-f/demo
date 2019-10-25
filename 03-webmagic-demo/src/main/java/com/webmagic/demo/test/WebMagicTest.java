package com.webmagic.demo.test;

import com.webmagic.demo.processor.MeiZiProcessor;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;

/**
 * Package: com.webmagic.demo.test
 * Date: Created in 2019/8/14 15:40
 *
 * @Company: 公司
 * Copyright: Copyright (c) 2017
 * @Version: 0.0.1
 * @author:weil-f Modified By:
 */
public class WebMagicTest {
    public static void main(String[] args) {
        System.out.println("开始爬取图片");
        MeiZiProcessor mzituProcessor = new MeiZiProcessor();
        Spider spider = Spider.create(mzituProcessor);
        spider.addUrl("https://www.meizitu.com/");
        spider.addPipeline(new ConsolePipeline());
        spider.thread(4);
        spider.start();
    }
}
