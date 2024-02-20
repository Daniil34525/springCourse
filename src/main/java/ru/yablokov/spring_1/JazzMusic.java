package ru.yablokov.spring_1;

import java.util.Random;

public class JazzMusic implements Music{
	String[] Songs = { "Kind of Blue", "A Love Supreme", "Mingus Ah Um" };
	
	@Override
	public String getSong() {
		Random random = new Random();
		int songIndex = random.nextInt(Songs.length);
		return Songs[songIndex];
	}

}
