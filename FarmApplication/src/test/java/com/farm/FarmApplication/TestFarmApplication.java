package com.farm.FarmApplication;

import org.springframework.boot.SpringApplication;

public class TestFarmApplication {

	public static void main(String[] args) {
		SpringApplication.from(FarmApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
