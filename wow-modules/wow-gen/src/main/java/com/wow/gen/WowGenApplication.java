package com.wow.gen;

import com.wow.common.security.annotation.EnableCustomConfig;
import com.wow.common.security.annotation.EnableRyFeignClients;
import com.wow.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 代码生成
 *
 * @author Winbert
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class WowGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(WowGenApplication.class, args);
    }
}
