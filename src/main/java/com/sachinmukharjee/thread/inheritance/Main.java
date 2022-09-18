package com.sachinmukharjee.thread.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Vault vault = new Vault(random.nextInt(0, Constants.MAX_PASSWORD));
		List<Thread> threadList = new ArrayList<>();
		
		threadList.add(new AscendingHackerThread(vault));
		threadList.add(new DescendingHackerThread(vault));
		threadList.add(new PoliceThread());
		
		for(Thread thread:threadList) {
			thread.start();
		}
	}

}
