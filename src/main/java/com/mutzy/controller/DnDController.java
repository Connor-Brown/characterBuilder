package com.mutzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mutzy.domain.DnDCharacter;
import com.mutzy.service.DnDCharacterService;

@Controller
@RequestMapping("/dnd")
public class DnDController {
	
	@Autowired
	private DnDCharacterService service;
	
	@PostMapping("/character")
	public ResponseEntity<Object> saveCharacter(@RequestBody DnDCharacter character) {
		service.saveCharacter(character);
		return ResponseEntity.ok().build();
	}
	
}
