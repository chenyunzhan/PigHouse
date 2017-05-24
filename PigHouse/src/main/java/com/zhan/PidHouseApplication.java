package com.zhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.zhan.util.PigHouseProperties;

@SpringBootApplication
@EnableConfigurationProperties({PigHouseProperties.class})  
public class PidHouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PidHouseApplication.class, args);//
	}
}
