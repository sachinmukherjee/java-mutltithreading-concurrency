package com.sachinmukharjee.thread.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class HackerThread extends Thread {
	
	private static final Logger LOGGER = LogManager.getLogger(HackerThread.class);
	
	protected Vault vault;
	
	public HackerThread(final Vault vault) {
		this.vault=vault;
		this.setName(this.getClass().getSimpleName());
		this.setPriority(Thread.MAX_PRIORITY);
	}

	@Override
	public synchronized void start() {
		LOGGER.info("Starting thread {}",this.getName());
		super.start();
	}
	
	
}
