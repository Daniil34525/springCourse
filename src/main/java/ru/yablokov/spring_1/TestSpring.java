package ru.yablokov.spring_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfig.class
				);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		System.out.println(musicPlayer.playMusic());
		context.close();
	}
}
