package com.example.demo.thread;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread02 extends Thread{
    private String url;
    private String name;

    public TestThread02(String name, String url) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("name:" + name);
    }

    public static void main(String[] args) {
        TestThread02 t1 = new TestThread02("1.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");
        TestThread02 t2 = new TestThread02("2.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");
        TestThread02 t3 = new TestThread02("3.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");

        t1.run();
        t2.run();
        t3.run();
    }
}

class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}