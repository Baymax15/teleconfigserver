package org.example.teletomo.teleconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TeleconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeleconfigserverApplication.class, args);
	}

}
