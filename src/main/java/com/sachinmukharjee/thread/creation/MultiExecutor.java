package com.sachinmukharjee.thread.creation;

import java.util.ArrayList;
import java.util.List;

public class MultiExecutor {
	
	private List<Runnable> runnableList;
	
	public MultiExecutor(final List<Runnable> runnableList) {
		this.runnableList=runnableList;
	}
	
	public void executeAll() {
		List<Thread> threadList = new ArrayList<>(runnableList.size());
		
		for(Runnable runnable:runnableList) {
			threadList.add(new Thread(runnable));
		}
		
		for(Thread thread:threadList) {
			thread.start();
		}
	}
}
