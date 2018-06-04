package com.jas.elephant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiangle.yu
 * @create 2018-06-01 15:39
 **/
@SpringBootApplication(scanBasePackages = "com.jas")
public class ElephantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElephantApplication.class, args);
	}
}
