package com.sachinmukharjee.thread.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AscendingHackerThread extends HackerThread {
	private static final Logger LOGGER = LogManager.getLogger(AscendingHackerThread.class);
	
	public AscendingHackerThread(Vault vault) {
		super(vault);
	}

	@Override
	public void run() {
		for(int i=0;i<Constants.MAX_PASSWORD;i++) {
			if(vault.isCorrectPassword(i)) {
				LOGGER.info("{} guessed the password {}",this.getName(),i);
				System.exit(0);
			}
		}
	}
	
	
	
}
