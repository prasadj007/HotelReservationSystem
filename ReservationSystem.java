package com.bridgelabz;

import java.util.ArrayList;

public class ReservationSystem {
	public class HotelDetailsReservationSystem {
		static ArrayList<HotelDetails> ListAll = new ArrayList<>();

		public static void display() {
			for (HotelDetails i : ListAll) {
				System.out.println(i);
			}
		}

		public static void main(String[] args) {

			HotelDetails Lakewood = new HotelDetails();
			Lakewood.setHotelName("Lakewood");
			Lakewood.setRatePerDay(120);
			ListAll.add(Lakewood);

			HotelDetails Bridgewood = new HotelDetails();
			Bridgewood.setHotelName("Bridgewood");
			Bridgewood.setRatePerDay(250);
			ListAll.add(Bridgewood);

			HotelDetails Ridgewood = new HotelDetails();
			Ridgewood.setHotelName("Ridgewood");
			Ridgewood.setRatePerDay(220);
			ListAll.add(Ridgewood);
			display();

		}

	}

}
