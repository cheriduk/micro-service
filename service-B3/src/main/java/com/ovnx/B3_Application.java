package com.ovnx;

/**
 * @title: B3_Application
 * @projectName micro-service
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/25 10:09
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class B3_Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(B3_Application.class).web(true).run(args);
    }

}
