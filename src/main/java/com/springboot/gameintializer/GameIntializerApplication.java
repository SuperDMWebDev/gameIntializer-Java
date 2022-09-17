package com.springboot.gameintializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springboot.gameintializer.game.GameRunner;
import com.springboot.gameintializer.game.MarioGame;
import com.springboot.gameintializer.game.SuperControlGame;

@SpringBootApplication
@ComponentScan("com.springboot.gameintializer")
public class GameIntializerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GameIntializerApplication.class, args);
		
		GameRunner game =context.getBean(GameRunner.class);
		MarioGame game1 = new MarioGame();
		SuperControlGame game2 = new SuperControlGame();
		
		GameRunner runner = new GameRunner(game1);
		
		runner.runGame();
		
	}

}
