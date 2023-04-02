package com.sachinmukharjee.multithreading.thread.inhertitance;

public class Vault {
	private int password;

	public Vault(final int password) {
		this.password = password;
	}

	public boolean isCorrectPassword(final int password) {
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.password == password;
	}
}
