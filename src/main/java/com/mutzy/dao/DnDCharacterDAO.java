package com.mutzy.dao;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mutzy.domain.DnDCharacter;
import com.mutzy.repository.DnDRepository;

@Component
public class DnDCharacterDAO {
	
	@Autowired
	private DnDRepository repository;
	
	public void saveCharacter(DnDCharacter character) {
		if(!Objects.isNull(character.getId()) && repository.findById(character.getId()).isPresent())
			repository.save(character);
		else
			repository.insert(character);
	}

}
