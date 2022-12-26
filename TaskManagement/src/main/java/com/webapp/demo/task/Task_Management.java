package com.webapp.demo.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task_Management {
	
	@Id
	private String id;
	private String Holder;
	private String Date;
	private String Name;
	private String Status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHolder() {
		return Holder;
	}
	public void setHolder(String Holder) {
		this.Holder = Holder;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String Date) {
		this.Date = Date;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getTaskStatus() {
		return Status;
	}
	public void setStatus(String Status) {
		this.Status = Status;
	}
	
}