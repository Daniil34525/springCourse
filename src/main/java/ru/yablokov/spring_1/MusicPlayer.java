package ru.yablokov.spring_1;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
	private List<Music> musicList;

	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}

	public String playMusic() {
		Random random = new Random();
		int index = random.nextInt(musicList.size());
		Music music = musicList.get(index);
		return "Playing: genre-" + music.getClass().getSimpleName() + ", " + music.getSong();
	}
}
