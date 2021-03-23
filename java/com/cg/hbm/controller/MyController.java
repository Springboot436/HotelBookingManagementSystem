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

import com.cg.hbm.dto.Hotel;
import com.cg.hbm.service.IHotelService;

@RestController
@RequestMapping("/hotel")
public class MyController {
	
	@Autowired
	IHotelService iservice;
	
	@PostMapping
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return iservice.addHotel(hotel);
	}
	@DeleteMapping("/{id}")
	public Hotel removeHotel(@PathVariable int id) {
		return iservice.removeHotel(id);
	}
	@PutMapping
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return iservice.updateHotel(hotel);
	}
	@GetMapping
	public List<Hotel>showAllHotels(){
		return iservice.showAllHotels();
	}
	@GetMapping("/{id}")
	public ResponseEntity<Hotel>showHotel(@PathVariable int id) {
		Hotel h=iservice.showHotel(id);
		if(h!=null) {
			return new ResponseEntity<Hotel>(h,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Hotel>(HttpStatus.NOT_FOUND);
		}
		
	}
}