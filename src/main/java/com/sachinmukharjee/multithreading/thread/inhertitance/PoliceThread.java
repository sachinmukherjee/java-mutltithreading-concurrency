package com.sachinmukharjee.multithreading.thread.inhertitance;

public class PoliceThread extends Thread {

	@Override
	public void run() {
		System.out.println("Starting thread " + getClass().getSimpleName());

		for (int i = 10; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
		}

		System.out.println("Game over for you hackers");
		System.exit(0);
	}
}
