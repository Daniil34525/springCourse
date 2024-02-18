package ru.yablokov.spring_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music1;
	private Music music2;

	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}

	public String playMusic(Genre genre) {
		if (genre == Genre.CLASSICAL)
			return "Playing: genre-Classical, " + music1.getSong();
		if (genre == Genre.ROCK)
			return "Playing: genre-Rock, " + music2.getSong();
		return "No genre";
	}
}
