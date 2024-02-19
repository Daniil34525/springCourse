package ru.yablokov.spring_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	@Value("${musicPlayer.name}")
	private String name;

	@Value("${musicPlayer.volume}")
	private int volume;
	
//	private Music music1;
//	private Music music2;

	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}
	
//	@Autowired
//	public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
//		this.music1 = music1;
//		this.music2 = music2;
//	}

//	public String playMusic(Genre genre) {
//		if (genre == Genre.CLASSICAL)
//			return "Playing: genre-Classical, " + music1.getSong();
//		if (genre == Genre.ROCK)
//			return "Playing: genre-Rock, " + music2.getSong();
//		return "No genre";
//	}
}
