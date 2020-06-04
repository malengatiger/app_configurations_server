package com.configx.configurations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationListener;

/**
 * Configuration Server - provides other microservices shared properties
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationsApplication implements ApplicationListener<ApplicationReadyEvent> {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationsApplication.class);

	public static void main(String[] args) {
		LOGGER.info(Emoji.COFFEE.concat(Emoji.COFFEE.concat(Emoji.COFFEE)).concat("Configurations Server starting ..."));
		SpringApplication.run(ConfigurationsApplication.class, args);
		LOGGER.info(Emoji.HAND2 + Emoji.COFFEE.concat(Emoji.COFFEE.concat(Emoji.COFFEE)).concat("Configurations Server startup complete! ..."));
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		LOGGER.info(Emoji.HAND2.concat(Emoji.CLOVER.concat(Emoji.CLOVER
				.concat("ApplicationReadyEvent ... ConfigurationsApplication Server ready to rumble ... "))));

	}
}
