package com.yyl.mock.utils;

import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executors;

public class RequestUtils {

    public static String post(String url, String param) {

        return null;
    }

    public static String get(String url, String param) {
        try {
            HttpResponse<String> rst = HttpClient.newHttpClient()
                    .send(HttpRequest.newBuilder().uri(URI.create(url))
                            .GET().build(), HttpResponse.BodyHandlers.ofString());
            return rst.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {

          testHttp();;
    }
   @Deprecated
    public  static void testHttp(){

        String url = "https://stockapi.com.cn/v1/base/index/mink?code=000001&all=0";
        Executors.newSingleThreadExecutor().submit(()->{
            HttpResponse<String> rst = null;
            try {
                for(int i =0;i<=1;i++){
                    rst = HttpClient.newHttpClient().send(HttpRequest.newBuilder().uri(URI.create(url)).GET().build(), HttpResponse.BodyHandlers.ofString());
                    HashMap<Object,Object> map = JsonMapper.builder().build().readValue(rst.body(), HashMap.class);
                    System.out.println(map);
                    ArrayList<HashMap<String,Object>> lst = (ArrayList<HashMap<String,Object>>)(map.get("data"));
                    HashMap<String,Object> str = new HashMap<String,Object>(lst.getFirst());
                    str.forEach((k,v)-> System.out.println("key "+k+" value "+v));
                    Thread.sleep(5000);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

    }
}
