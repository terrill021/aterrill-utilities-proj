package com.ceiba.utilities;

import java.util.Date;

public interface IDateUtilities {

	Float calculateNumHoursBetweenDates(Date dateStart, Date datEnd);
	
	int getDayOfWeek();
	
	Date getDateStamp();
}
