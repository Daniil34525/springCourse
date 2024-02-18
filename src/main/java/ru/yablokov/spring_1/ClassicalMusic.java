package ru.yablokov.spring_1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	String[] Songs = { "Hungarian Rhapsody", "Hungarian Dances", "Swan Lake" };

	@Override
	public String getSong() {
		Random random = new Random();
		int songIndex = random.nextInt(Songs.length);
		return Songs[songIndex];
	}
}