package com.mutzy.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mutzy.domain.DnDCharacter;

public interface DnDRepository extends MongoRepository<DnDCharacter, String> {
	List<DnDCharacter> findByName(String name);
}
