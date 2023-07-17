package com.git.repo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public Date parse(String dateStr) throws ParseException {
		Date date = sdf.parse(dateStr);
		return date;
	}

}
