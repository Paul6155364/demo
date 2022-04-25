package com.example.demo.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String name, String url) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("name:" + name);
        return null;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("1.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");
        TestCallable t2 = new TestCallable("2.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");
        TestCallable t3 = new TestCallable("3.jpg","https://img-blog.csdnimg.cn/img_convert/859d3ec7d8a2e69f7fc9a6856169cce9.png");
        ExecutorService ser = Executors.newFixedThreadPool(3);
        Future<Boolean> res1 = ser.submit(t1);
        Future<Boolean> res2 = ser.submit(t2);
        Future<Boolean> res3 = ser.submit(t3);
        boolean r1 = res1.get();
        boolean r2 = res2.get();
        boolean r3 = res3.get();
        ser.shutdown();

    }
}
