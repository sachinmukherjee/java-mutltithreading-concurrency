package com.sachinmukharjee.thread.inheritance;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PoliceThread extends Thread {
	
	private static final Logger LOGGER = LogManager.getLogger(PoliceThread.class);
	
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LOGGER.info("{}",i);
		}
		LOGGER.info("Game Over for you hacker");
		System.exit(0);
	}
	
	
}
