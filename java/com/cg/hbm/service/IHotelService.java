package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.dto.Hotel;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public List<Hotel> showAllHotels();
	public Hotel showHotel(int id);
	public Hotel removeHotel(int id);

	

}
