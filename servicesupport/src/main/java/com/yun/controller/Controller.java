package com.yun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/******************************************************************************
 *@project_name:springCloud
 *@package_name:com.yun.controller
 *@author:why
 *@date:2019/11/1
 *2019
 *@Description：TODO
 *
 */
@RestController
@RequestMapping("/Hello")
public class Controller  {
	@RequestMapping("/World")
		public String helloWorld(String s){
			System.out.println("传入的值为："+s);
			return "传入的值为："+s;
		}
	
}
