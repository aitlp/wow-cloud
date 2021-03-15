package com.wow.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author Winbert
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WowGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(WowGatewayApplication.class, args);
    }
}
