package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entries {

	public Entries() {

	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEntryID() {
		return entryID;
	}

	public void setEntryID(String entryID) {
		this.entryID = entryID;
	}

	public Entries(String guestName, String content) {
		this.guestName = guestName;
		this.content = content;
	}

	String guestName;
	String content;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String entryID;
}
