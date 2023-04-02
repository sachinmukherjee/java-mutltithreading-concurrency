package com.sachinmukharjee.multithreading.thread.creation;

public class ThreadExample2 {

	public static void main(String[] args) {
		
		ThreadClass thread = new ThreadClass();
		thread.setName("Worker Thread");
		thread.start();
	}

	private static class ThreadClass extends Thread {

		@Override
		public void run() {
			System.out.println("Executing thread " + this.getName());
		}
	}

}
