package model;

import java.io.Serializable;

public class User implements Serializable {
	private int id;
	private String name;
	private String pass;

	public User(int id, String name, String pass) {
		this(name, pass);
		this.id = id;
	}

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}
}
