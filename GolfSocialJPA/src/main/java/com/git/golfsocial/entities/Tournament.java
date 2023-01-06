package com.git.golfsocial.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tournament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	@Column(name = "team_max")
	int teamMax;
	
	@Column(name = "entry_fee")
	int entryFee;
	
	int purse;

	public Tournament() {
		super();
	}

	public Tournament(int id, String name, int teamMax, int entryFee, int purse) {
		super();
		this.id = id;
		this.name = name;
		this.teamMax = teamMax;
		this.entryFee = entryFee;
		this.purse = purse;
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

	public int getTeamMax() {
		return teamMax;
	}

	public void setTeamMax(int teamMax) {
		this.teamMax = teamMax;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}

	public int getPurse() {
		return purse;
	}

	public void setPurse(int purse) {
		this.purse = purse;
	}
	
	

}
