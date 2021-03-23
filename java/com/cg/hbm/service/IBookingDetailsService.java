package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.dto.BookingDetails;



public interface IBookingDetailsService {
	public BookingDetails addBookingDetails(BookingDetails bookingdetails);
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails);
	public List<BookingDetails> showAllBookingDetails();
	public List<BookingDetails> removeBookingDetails(int id);
	public BookingDetails showBookingDetails(int id);

}
