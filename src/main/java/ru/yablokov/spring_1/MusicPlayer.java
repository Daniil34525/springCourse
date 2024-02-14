package ru.yablokov.spring_1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	private Music music;
	private List<Music> musicList = new ArrayList<>();	

	private String name;
	
	private int volume;
	
	public MusicPlayer() {}

	public MusicPlayer(Music music) {
		this.music = music;
	}

	public MusicPlayer(List<Music> musicList) {
		this.setMusicList(musicList);
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public void playMusic() {
		System.out.println("Playing: " + music.getSong());
	}

	public void playMusicList() {
		for (Music music : this.musicList) {
			System.out.println("Playing: " + music.getSong());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<Music> getMusicList() {
		return musicList;
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;
	}
}
