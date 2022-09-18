package com.sachinmukharjee.thread.creation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadCreationExample1 {
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadCreationExample1.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread =  new Thread(new Runnable() {
			
			public void run() {
				LOGGER.info("We are now in thread {}",Thread.currentThread().getName());
				LOGGER.info("Current thread priority {}",Thread.currentThread().getPriority());
			}
		});
		
		thread.setName("New Worker Thread");
		thread.setPriority(Thread.MAX_PRIORITY);
		LOGGER.info("We are now in thread {} before starting a new thread",Thread.currentThread().getName());
		thread.start();
		LOGGER.info("We are now in thread {} after starting a new thread",Thread.currentThread().getName());
		
	}
}
