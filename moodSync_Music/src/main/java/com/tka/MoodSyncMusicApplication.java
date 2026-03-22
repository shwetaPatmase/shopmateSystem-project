package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoodSyncMusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoodSyncMusicApplication.class, args);
		System.err.println("music app started....");
	}

}
