package com.tzl;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class TestHttpClientApplication {

    public static void main(String[] args) throws IOException {
        //创建默认的httpclient
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //调用6次服务并输出结果
        for (int i = 0; i < 6; i++) {
            //调用Get方法 请求服务
            HttpGet httpGet = new HttpGet("http://localhost:9000/router");
            //获取响应
            HttpResponse response = httpClient.execute(httpGet);
            //根据响应解析出字符串
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
