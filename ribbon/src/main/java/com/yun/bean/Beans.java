package com.yun.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/******************************************************************************
 *@project_name:springCloud
 *@package_name:com.yun.bean
 *@author:why
 *@date:2019/11/1
 *2019
 *@Description：TODO
 *
 */

@Configuration
public class Beans {
	//管理简单对象
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}