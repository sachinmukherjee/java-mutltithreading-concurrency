package com.sachinmukharjee.thread.creation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadExceptionHandling {
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadExceptionHandling.class);
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				throw new RuntimeException("Intentional Exception");
				
			}
		});
		thread.setName("New Worker Thread");
		
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				LOGGER.info("Exception Occured in thread {} due to {}",t.getName(),e.getMessage());
			}
		});
		
		thread.start();
	}
}
