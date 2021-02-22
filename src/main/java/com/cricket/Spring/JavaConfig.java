package com.cricket.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean (name = "team")
	public Team getTeam() {
		Team team=new Team();
		team.setPlayer(getPlayer());
		return team;
	}
	@Bean (name = "player")
	public Player getPlayer() {
		Player player=new Player();
		
		return player;
	}

}
