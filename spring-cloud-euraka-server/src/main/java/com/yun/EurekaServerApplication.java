package com.yun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/******************************************************************************
 *@project_name:springCloud
 *@package_name:com.yun
 *@author:why
 *@date:2019/11/1
 *2019
 *@Description：TODO
 *
 */

@SpringBootApplication
@EnableEurekaServer //当前使用eureka的server
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		
	}
	
}
