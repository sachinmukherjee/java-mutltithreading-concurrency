package com.sachinmukharjee.thread.creation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadCreationExample2 {
	
	private static final Logger LOGGER = LogManager.getLogger(ThreadCreationExample2.class);
	
	public static void main(String[] args) {
		Thread thread = new NewThread();
		thread.start();
	}
	
	private static class NewThread extends Thread{

		@Override
		public void run() {
			LOGGER.info("Hello from {}",this.getName());
		}
		
		
	}
}

