package com.wow.job;

import com.wow.common.security.annotation.EnableCustomConfig;
import com.wow.common.security.annotation.EnableRyFeignClients;
import com.wow.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 定时任务
 *
 * @author Winbert
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class WowJobApplication {
    public static void main(String[] args) {
        SpringApplication.run(WowJobApplication.class, args);
    }
}
