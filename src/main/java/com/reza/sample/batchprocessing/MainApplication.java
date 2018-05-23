package com.reza.sample.batchprocessing;

import com.reza.sample.batchprocessing.config.BatchConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.reza.sample")
@Import({BatchConfig.class})
public class MainApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainApplication.class, args);
	}
}
