package com.cg.hbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.cg.hbm")
public class HotelBookingsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingsManagementApplication.class, args);
		
	}

}
