package com.sachinmukharjee.multithreading.thread.daemon;

import java.math.BigInteger;

public class PowerCalculator implements Runnable {

	private BigInteger base;
	private BigInteger power;

	public PowerCalculator(final BigInteger base, final BigInteger power) {
		this.base = base;
		this.power = power;
	}

	@Override
	public void run() {
		System.out.println(base + "^" + power + "=" + calculate(base, power));
	}

	private BigInteger calculate(final BigInteger base, final BigInteger power) {
		BigInteger result = BigInteger.ONE;

		for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
			result = result.multiply(base);
		}
		return result;
	}

}
