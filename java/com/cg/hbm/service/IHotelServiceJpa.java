package com.cg.hbm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hbm.dto.Hotel;
import com.cg.hbm.exception.HotelNotFoundException;
import com.cg.hbm.repository.IHotelRepository;

@Service
@Transactional
public class IHotelServiceJpa implements IHotelService {
	@Autowired
	IHotelRepository repository;
	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		repository.save(hotel);
		
		return hotel;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		repository.save(hotel);
		return hotel;
	}

	@Override
	public Hotel removeHotel(int id) {  
		// TODO Auto-generated method stub
		Optional<Hotel>op=repository.findById(id);
		if(op.isPresent()) {
			Hotel obj=op.get();
			repository.deleteById(id);
			System.out.println("id is present");
			return null;
		}
		return null;
		
	}

	@Override
	public List<Hotel> showAllHotels() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Hotel showHotel(int id) {
		// TODO Auto-generated method stub
//		Hotel hotel=
		if(repository.findById(id).isPresent()) {
			return repository.findById(id).get();
		}
		else {
			return null;
		}
	}
}
