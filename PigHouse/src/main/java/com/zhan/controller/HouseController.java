package com.zhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhan.model.House;
import com.zhan.model.HouseRepository;


@Controller    // This means that this class is a Controller
@RequestMapping(path="/house") // This means URL's start with /demo (after Application path)
public class HouseController {
	
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private HouseRepository houseRepository;

	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<House> getAllHouses() {
		// This returns a JSON or XML with the users
		return houseRepository.findAll();
	}
}