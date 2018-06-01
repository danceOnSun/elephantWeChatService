package com.jas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiangle.yu
 * @create 2018-06-01 15:39
 **/
@SpringBootApplication(scanBasePackages = "com.jas")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
