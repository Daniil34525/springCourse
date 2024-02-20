package ru.yablokov.spring_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.yablokov.spring_1")
public class SpringConfig {
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}

	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	
	@Bean
	public JazzMusic jazzMusic()
	{
		return new JazzMusic();
	}
	
	@Bean
	public List<Music> listMusic(){
		List<Music> listMusic = new ArrayList<Music>();
		listMusic.add(classicalMusic());
		listMusic.add(rockMusic());
		listMusic.add(jazzMusic());
		return listMusic;
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(listMusic());
	}
}
