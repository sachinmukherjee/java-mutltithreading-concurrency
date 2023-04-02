package com.sachinmukharjee.multithreading.thread.inhertitance;

public class AscendingHackerThread extends HackerThread {
	
	private Vault vault;
	
	AscendingHackerThread(Vault vault) {
		super(vault);
		this.vault=vault;
		System.out.println("Constructor from child class");
	}
	
	@Override
	public void run() {
		for(int guess=0; guess<Constants.MAX_PASSWORD;guess++) {
			if(vault.isCorrectPassword(guess)) {
				System.out.println(this.getName()+" guessed the password "+guess);
				System.exit(0);
			}
		}
	}
}
