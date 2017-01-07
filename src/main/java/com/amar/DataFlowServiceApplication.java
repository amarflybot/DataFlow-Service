package com.amar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.server.EnableDataFlowServer;

@SpringBootApplication
@EnableDataFlowServer
public class DataFlowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataFlowServiceApplication.class, args);
	}
}
