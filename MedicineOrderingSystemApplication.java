package com.medicine;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicineOrderingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicineOrderingSystemApplication.class, args);
		System.out.println("welcome to our medical store");
	}

}
