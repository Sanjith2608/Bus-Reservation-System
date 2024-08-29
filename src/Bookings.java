package busReservation;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bookings {
	String passengerName;
	int busNo;
	Date date;
	
	Bookings(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = sc.nextLine();
		System.out.println("Enter bus no:");
		busNo = sc.nextInt();
		System.out.println("Enter date dd-mm-yy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		sc.close();
	}
	

	public boolean isAvailable() throws SQLException {
		Busdao busdao = new Busdao();
		Bookingdao bookingdao = new Bookingdao();
		int capacity = busdao.getCapacity(busNo);

		int booked = bookingdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}

	
}
