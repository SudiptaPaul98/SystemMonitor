package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/data")
public class DataController {
	@Autowired
	DataRepository dao;
	
	@PostMapping("/setdata")
	public String setData(String usrstr)  // accept a json data
	{
		//dao.save(data);
		ArrayList<String> user= new ArrayList<>();
		// convert json to array  ArrayList<String> user= new ArrayList<>(); user=funJsonToArrlist

	//	user.add("Status"+"Data inserted"); //add another element to that arraylist
		
		return usrstr;
	}
	
	@GetMapping("/getdata")
	public List<String> getData()
	{
		
		//return (List<Data>) dao.findAll();
		ArrayList<String> user= new ArrayList<>();
		user.add("RAM"+":2.3gb");
		user.add("cpu"+":45%");
		return user;
	}

}
