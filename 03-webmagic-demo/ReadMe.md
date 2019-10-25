# java使用webmagic 框架爬取图片
## 1、使用方法
     配置好maven后,直接运行com.webmagic.demo.test.WebMagicTest#main 方法
## 2、注意事项
     爬取下来的图片默认保存在了本地电脑的D:\02-myCode\00-下载图片 这个文件夹中，运行程序前请先创建文件夹
     爬取的主要程序就是这个processor --com.webmagic.demo.processor.MeiZiProcessor ，主要是根据图片的xpath 获取
     图片的url，拿到url将图片保存到本地
         
    
    