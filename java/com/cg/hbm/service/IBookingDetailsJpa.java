package com.cg.hbm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.dto.BookingDetails;
import com.cg.hbm.repository.IBookingDetailsRepository;

@Service("JpaService")
public class IBookingDetailsJpa implements IBookingDetailsService {
	@Autowired
	IBookingDetailsRepository brepository;
	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingdetails) {
		// TODO Auto-generated method stub
		brepository.save(bookingdetails);
		return bookingdetails;
	}

	@Override
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) {
		// TODO Auto-generated method stub
		brepository.save(bookingdetails);
		return bookingdetails;
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() {
		// TODO Auto-generated method stub
		return brepository.findAll();
	}

	@Override
	public BookingDetails showBookingDetails(int id) {
		// TODO Auto-generated method stub
		if(brepository.findById(id).isPresent()) {
			return brepository.findById(id).get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<BookingDetails> removeBookingDetails(int id) {
		// TODO Auto-generated method stub
		return brepository.deleteById(id);
	}

}
