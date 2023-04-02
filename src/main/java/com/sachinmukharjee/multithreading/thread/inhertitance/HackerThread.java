package com.sachinmukharjee.multithreading.thread.inhertitance;

public abstract class HackerThread extends Thread {
	private Vault vault;
	
	HackerThread(final Vault vault) {
		this.vault=vault;
		this.setName(this.getClass().getSimpleName());
		this.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Constructor from parent class");
	}
	
	@Override
	public void start() {
		System.out.println("Starting thread "+this.getName());
		super.start();
	}
}
