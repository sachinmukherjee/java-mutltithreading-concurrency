package com.sachinmukharjee.multithreading.thread.termination;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new PowerCalculator(new BigInteger("2"), new BigInteger("10")));
		thread.start();
		thread.interrupt();
	}

}
