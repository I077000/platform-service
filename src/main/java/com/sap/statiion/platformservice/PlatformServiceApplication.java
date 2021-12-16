package com.sap.statiion.platformservice;

import java.sql.Time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatformServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformServiceApplication.class, args);
		
		Time time = new Time(12, 5, 0);
		System.err.println(time.getHours());
		
	}

}
