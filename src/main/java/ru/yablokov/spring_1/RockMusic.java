package ru.yablokov.spring_1;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	String[] Songs = { "Wind cries Mary", "Rock And Roll", "Detroit Rock City" };

	@Override
	public String getSong() {
		Random random = new Random();
		int songIndex = random.nextInt(Songs.length);
		return Songs[songIndex];
	}
}
