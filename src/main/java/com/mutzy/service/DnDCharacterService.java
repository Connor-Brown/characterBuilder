package com.mutzy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mutzy.dao.DnDCharacterDAO;
import com.mutzy.domain.DnDCharacter;

@Service
public class DnDCharacterService {
	
	@Autowired
	private DnDCharacterDAO dao;

	public void saveCharacter(DnDCharacter character) {
		dao.saveCharacter(character);
	}
	
}
