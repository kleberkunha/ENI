package exoCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendario {
	
	protected int year;
	protected int month;
	
	
	public Calendario(int selectedYear, int selectedMonth) {
		this.year = selectedYear;
		this.month = selectedMonth;
		
		Calendar calendar = new GregorianCalendar();
		
		int cDay = calendar.get(Calendar.DATE);
		int cMonth = calendar.get(Calendar.MONTH);
		int cYear= calendar.get(Calendar.YEAR);
		
		
		GregorianCalendar gCal = new GregorianCalendar(year,month, cDay);
		int days = gCal.getActualMaximum(Calendar.DATE);
		int startInWeek = gCal.get(Calendar.DAY_OF_WEEK);
		
		gCal = new GregorianCalendar(year,month,days);
		int totalweeks = gCal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		
		int count = 1;
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Doc"};
		System.out.println(months[month]);
		
		System.out.println("SU MO TU WE TH FR SA");
		for(int i = 1; i <= totalweeks; i++) {
			
			System.out.println(); // send to next line
			
			for(int j = 1; j <= 7; j++) 
			{
				if(count < startInWeek || (count - startInWeek + 1) > 31) {
					
					System.out.print("__");
					System.out.print(" ");
					
				}else {
					
					if(cDay == (count - startInWeek + 1) && cMonth == month && cYear == year) {
					//Here i get the current day
						System.out.print(((count - startInWeek + 1)));
						System.out.print(" ");
						
					}else {
					
						System.out.print(getDay(count - startInWeek + 1));
						System.out.print(" ");
					
					}	
				}
				count++;
			}
		}
	}

	//here i add a 0 to the left of the number;
	private  String getDay(int i) {
		String sDate = Integer.toString(i);
		if(sDate.length() == 1) {
			sDate = "0"+sDate;
			return sDate;
		}else {
			return sDate;
		}
	}
	
	public int getYear() {
		return year;
	}
	public int setYear(int year) {
		return this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int setMonth(int month) {
		return this.month = month;
	}
}
