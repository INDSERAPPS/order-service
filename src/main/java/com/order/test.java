package com.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class test {

	@Id
	@Column(name = "testid")
	private int testid;

	@Column(name = "name")
	private String name;

	public int getTestId() {
		return testid;
	}

	public void setTestId(int testid) {
		this.testid = testid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}