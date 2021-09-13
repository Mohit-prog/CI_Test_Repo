package com.nagarroTraining.AdvancedJavaAssignment1.csvHandler;



public class ProcessCsvFiles {
	/*
	 * Launches the Thread that read and Add csv files data to the data store
	 */
	public void initiateThreadClass() {

//		SearchCsvFiles fileSearch = new SearchCsvFiles();
		csvHandler csvFileHandler = new csvHandler();
		Thread t1 = new Thread(csvFileHandler);
		t1.start();

	}

}
