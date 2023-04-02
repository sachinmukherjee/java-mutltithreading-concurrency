package com.sachinmukharjee.multithreading.thread.inhertitance;

public class DescendingHackerThread extends HackerThread {
	private Vault vault;

	DescendingHackerThread(Vault vault) {
		super(vault);
		this.vault = vault;
		System.out.println("Constructor from child class");
	}

	@Override
	public void run() {
		for (int guess = Constants.MAX_PASSWORD; guess >= 0; guess--) {
			if (vault.isCorrectPassword(guess)) {
				System.out.println(this.getName() + " guessed the password " + guess);
				System.exit(0);
			}
		}
	}

}
