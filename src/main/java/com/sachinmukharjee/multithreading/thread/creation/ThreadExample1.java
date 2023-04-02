package com.sachinmukharjee.multithreading.thread.creation;

public class ThreadExample1 {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			System.out.println("Executing thread " + Thread.currentThread().getName());
		});
		thread.setName("Worker thread");
		System.out.println("Before executing new thread");
		thread.start();
		System.out.println("After executing new thread");
	}

}
