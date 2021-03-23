package com.cg.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hbm.dto.BookingDetails;
import com.cg.hbm.service.IBookingDetailsService;



@RestController
@RequestMapping("/bookingdetails")
public class MyController1 {

	@Autowired
	IBookingDetailsService bservice;
	
	@PostMapping
	public BookingDetails addBookingDetails(@RequestBody BookingDetails bookingdetails) {
		return bservice.addBookingDetails(bookingdetails);
	}
	@DeleteMapping("/{id}")
	public List<BookingDetails>removeBookingDetails(@PathVariable int id) {
		return bservice.removeBookingDetails(id);
	}
	@PutMapping
	public BookingDetails updateBookingDetails(@RequestBody BookingDetails bookingdetails) {
		return bservice.updateBookingDetails(bookingdetails);
	}
	@GetMapping
	public List<BookingDetails>showAllBookingDetails(){
		return bservice.showAllBookingDetails();
	}
	@GetMapping("/{id}")
	public ResponseEntity<BookingDetails>showBookingDetails(@PathVariable int id) {
		BookingDetails b=bservice.showBookingDetails(id);
		if(b!=null) {
			return new ResponseEntity<BookingDetails>(b,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<BookingDetails>(HttpStatus.NOT_FOUND);
		}
		
	}
}

