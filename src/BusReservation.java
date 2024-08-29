package busReservation;

import java.util.*;
public class BusReservation {

	public static void main(String[] args) throws Exception{
		
		Busdao busdao = new Busdao();
		
		try {
			busdao.displayBusInfo();
			
			int userOpt = 1;
			Scanner scanner = new Scanner(System.in);
					
			while(userOpt==1) {
				System.out.println("Enter 1 to Book and 2 to exit");
				userOpt = scanner.nextInt();
				if(userOpt == 1) {
					Bookings booking = new Bookings();
					if(booking.isAvailable()) {
						Bookingdao bookingdao = new Bookingdao();
						bookingdao.addBooking(booking);
						System.out.println("Your booking is confirmed");
					}
					else
						System.out.println("Sorry. Bus is full. Try another bus or date.");
				}
			}
			System.out.println("Thank you!");
			scanner.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
