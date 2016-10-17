package com.tom.workers;

/*
 * Worker class which handles the business logic of the test application
 */
public class MathsWorker {
	/*
	 * Worker Method to do the work
	 */
	public String WorkerPurpose() {
		return new String("This is the worker class for Math Functions Class.");
	}

	/*
	 * Simple addition processing method
	 */
	public int adder(int a, int b) {
		return a + b;
	}

	/*
	 * Simple addition processing method
	 */
	public int multiplyer(int a, int b) {
		return a * b;
	}
	
}
