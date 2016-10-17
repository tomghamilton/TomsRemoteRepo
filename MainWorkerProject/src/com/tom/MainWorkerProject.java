package com.tom;

import com.tom.workers.MathsWorker;

/**
 * 
 */



/**
 * @author Tom
 *
 */
public class MainWorkerProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathsWorker worker = new MathsWorker();
		worker.WorkerPurpose();
		System.out.println("This will add up 10 and 5.");
		System.out.println("The sum is:" + Integer.toString(worker.adder(10, 5)));
		System.out.println("This will mulitply up 3 and 5.");
		System.out.println("The multiplication is:" + Integer.toString(worker.multiplyer(3, 5)));
	}

}
