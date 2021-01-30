package com.example;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tianwenyuan
 */
@SpringBootApplication
@MapperScan("com.example.mybatisplus.mapper")
@Slf4j
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        System.out.println("spring启动完成");

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jgpt.shstjs.cn/zhgd-web/rest/projectPerson/projectLabourList2";
        Map<String, Object> param = new HashMap<>();
        param.put("projectId", 11);
        HttpHeaders head = new HttpHeaders();
        head.add("x-auth-token", "7d8a6d45-c5cb-4b7b-a796-da4e9d73b89e");
        head.add("Content-Type", "application/json");
        String entity = restTemplate.postForObject(url, new HttpEntity<Map>(param, head), String.class);
        JSONObject jsonObject = JSONObject.parseObject(entity);
        JSONArray result = jsonObject.getJSONArray("result");
        int i = 0;
        for (Object o : result) {
            i = i +1;
            JSONObject jsonObject1 = JSONObject.parseObject(o.toString());
            String photo = jsonObject1.getString("photo");
            log.debug(photo);
            if (photo != null && photo.length() < 50) {
                System.out.println(photo);
            }
            if (photo != null && photo.length() > 50) {
                InputStream inputStream = null;
                OutputStream outputStream = null;
                try {
                    ResponseEntity<byte[]> response = restTemplate.exchange(
                            photo,
                            HttpMethod.GET,
                            new HttpEntity<byte[]>(new HttpHeaders()),
                            byte[].class);

                    byte[] result1 = response.getBody();

                    inputStream = new ByteArrayInputStream(result1);

                    File file = new File("D:/stec/" + i + ".jpg");
                    if (!file.exists())
                    {
                        file.createNewFile();
                    }

                    outputStream = new FileOutputStream(file);
                    int len = 0;
                    byte[] buf = new byte[1024];
                    while ((len = inputStream.read(buf, 0, 1024)) != -1) {
                        outputStream.write(buf, 0, len);
                    }
                    outputStream.flush();

                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if(inputStream != null){
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if(outputStream != null){
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        System.out.println(entity);
    }
}
