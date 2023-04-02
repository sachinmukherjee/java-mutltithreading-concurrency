package com.sachinmukharjee.multithreading.thread.daemon;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new PowerCalculator(new BigInteger("2000"), new BigInteger("1000000")));
		thread.setDaemon(true);
		thread.start();
		thread.interrupt();
	}

}
