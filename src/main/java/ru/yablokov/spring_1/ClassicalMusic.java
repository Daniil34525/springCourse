package ru.yablokov.spring_1;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
	String[] Songs = { "Hungarian Rhapsody", "Hungarian Dances", "Swan Lake" };
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("Doing my initialization");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Doing my destruction");
	}
	
	@Override
	public String getSong() {
		Random random = new Random();
		int songIndex = random.nextInt(Songs.length);
		return Songs[songIndex];
	}
}