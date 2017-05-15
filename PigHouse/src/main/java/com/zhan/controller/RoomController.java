package com.zhan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhan.model.Room;
import com.zhan.model.RoomRepository;;


@Controller
@RequestMapping(path="/room") 
public class RoomController {

	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private RoomRepository roomRepository;
	
	
	@GetMapping(path="/getRoomsByHouseId")
	public @ResponseBody Iterable<Room> getRoomsByHouseId(@RequestParam String roomsId) {
		// This returns a JSON or XML with the users
		
		String[] roomArr = roomsId.split("-");
		
		List<Long> list = new ArrayList<Long>();

		for (int i = 0; i < roomArr.length; i++) {
			list.add(Long.parseLong(roomArr[i]));
		}

		return roomRepository.findAll(list);
	}
}