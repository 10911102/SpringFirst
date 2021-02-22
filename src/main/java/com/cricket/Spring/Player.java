package com.cricket.Spring;
public class Player extends Team{
	private int id;
	private String name;
	private int teamId;
	
	/*
	 * public Player(int id, String name, int teamId) { this.id = id; this.name =
	 * name; this.teamId = teamId; }
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the teamId
	 */
	public int getTeamId() {
		return teamId;
	}
	/**
	 * @param teamId the teamId to set
	 */
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public void play() {
		System.out.println("Playing  "+this);
	}
}
