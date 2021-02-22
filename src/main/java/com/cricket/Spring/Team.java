package com.cricket.Spring;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Lookup;

public class Team {
	private int id;
	private String name;
	private Date date;
	private Player player;
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	/*
	 * @Override public String toString() { return "Team [id=" + id + ", name=" +
	 * name + ", date=" + date + ", player=" + player + "]"; }
	 */
}
