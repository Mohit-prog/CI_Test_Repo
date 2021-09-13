package com.nagarroTraining.AdvancedJavaAssignment1.validators;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nagarroTraining.AdvancedJavaAssignment1.customException.*;

public class StringDateConverter {
    /* Validates and Converts a String into a Date object
    */
public static Date StringToDateConvertor(String input) throws customException {

	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	Date date = null;
	try {
		formatter.setLenient(false);
		date = formatter.parse(input);
//		System.out.println(date);
	} catch (ParseException e) {
		 throw new customException("Error in Date processing... Please Try again");		 
	}
	return date;
}

public static String DateToStringConvertor(Date date) throws customException{
	try{
	DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	return formatter.format(date);
	}catch(Exception e){
		throw new customException("Error in Date Formatting");
	}
}
}
