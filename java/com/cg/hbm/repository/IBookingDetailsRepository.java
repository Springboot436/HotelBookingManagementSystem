package com.cg.hbm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.hbm.dto.BookingDetails;
public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer> {
	public List<BookingDetails> deleteById(int id);
}
