package com.webmagic.demo.processor;

import org.apache.commons.lang3.StringUtils;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Package: com.webmagic.demo.processor
 * Date: Created in 2019/8/14 15:37
 *
 * @Company: ��˾
 * Copyright: Copyright (c) 2017
 * @Version: 0.0.1
 */
public class MeiZiProcessor implements PageProcessor {

    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("https://www.meizitu.com/[a-z]{1}/[0-9]{4}.html").all());
        String title = page.getHtml().xpath("//*[@id=\"maincontent\"]/div[1]/div[1]/h2/a/text()").toString();

        //
        // //*[@id="picture"]/p/img[1]
        //*[@id="picture"]/p/img[1]
        //*[@id="picture"]/p/img[1]
        // #picture > p > img:nth-child(1)
        String addr = page.getHtml().xpath("//*[@id=\"picture\"]/p/img[1]/@src")
                .toString();

        List<String> allUrl = page.getHtml().xpath("//*[@id=\"picture\"]/p/img/@src").all();
        List<String> allAlt = page.getHtml().xpath("//*[@id=\"picture\"]/p/img/@alt").all();

        System.out.println("ͼƬurl��ַ����Ϊ===>"+allUrl+"ͼƬչʾ����Ϊ===>"+allAlt);

        if(StringUtils.isNotBlank(title) && allUrl.size()>1){
            page.putField("title",title);
            page.putField("imageAddr",allUrl);
            File file = new File("D:\\02-myCode\\00-����ͼƬ\\"+title);
            if(!file.exists()){
                file.mkdir();
            }

            for (int i = 0; i <allAlt.size() ; i++) {
                String lastName = StringUtils.substring(allUrl.get(i), allUrl.get(i).lastIndexOf("."));
                String filePath = "D:\\02-myCode\\00-����ͼƬ\\"+title+"\\"+allAlt.get(i)+i+lastName;
                File file1 = new File(filePath);
                if(file1.exists()){
                    return;
                }
                downloadPicture(allUrl.get(i),filePath);
            }
            // System.out.println("ͼƬ���ϵı���Ϊ===>"+title+"ͼƬ��ַΪ===>"+imageAddr);
        }else {
            page.setSkip(true);
        }

    }
    @Override
    public Site getSite() {
        return Site.me().setRetryTimes(5000).setSleepTime(500);

    }

    /**
     * ����ͼƬ������
     * @param urlList
     * @param path
     */
    private static void downloadPicture(String urlList,String path) {
        System.out.println("ͼƬ��urlΪ===>"+urlList+",ͼƬ������Ϊ===>"+path);
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[90000];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
