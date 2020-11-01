package com.example.fserv;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FservController {
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping("/getName/{id}")
	@ResponseBody
	public String getName(@PathVariable  Integer id) {
		return personRepository.findById(id).toString();
	}

}
