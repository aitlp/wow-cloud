package com.wow.system;

import com.wow.common.security.annotation.EnableCustomConfig;
import com.wow.common.security.annotation.EnableRyFeignClients;
import com.wow.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 系统模块
 *
 * @author Winbert
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class WowSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(WowSystemApplication.class, args);
    }
}
