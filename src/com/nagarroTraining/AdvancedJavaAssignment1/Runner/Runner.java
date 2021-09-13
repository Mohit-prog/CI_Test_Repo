package com.nagarroTraining.AdvancedJavaAssignment1.Runner;



import com.nagarroTraining.AdvancedJavaAssignment1.userInterface.*;
import com.nagarroTraining.AdvancedJavaAssignment1.csvHandler.*;

import com.nagarroTraining.AdvancedJavaAssignment1.customException.*;

public class Runner {
	
public static void main(String[] args) {
	
	try {
		/*
		 * Initializes the class that perform all csv files related operations
		 */
		ProcessCsvFiles launcher = new ProcessCsvFiles();
		
		launcher.initiateThreadClass();
		
		/*
		 * This will interact with user. Will take Input , validate it further
		 * and Finally Search for the flights
		 */
		UserInteractor interactor = new UserInteractor();
			interactor.userInput();	
		
	}
	catch(customException ex) {
		ex.printMessage();
		
	}
	

}

}
