package br.com.makeshiftonjava.crosssellingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrossSellingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossSellingServiceApplication.class, args);
	}
}
