package ru.yablokov.spring_1;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	private int id;
	private MusicPlayer musicPlayer;
	
	@Autowired
	public Computer(MusicPlayer musicPlayer) {
		this.id = 1;
		this.musicPlayer = musicPlayer;
	}

	@Override
	public String toString() {
		Random random = new Random();
		Genre[] genres = Genre.values();
		int randomIndex = random.nextInt(genres.length);
		return "Computer " + id + " " + musicPlayer.playMusic(genres[randomIndex]);
	}
}
