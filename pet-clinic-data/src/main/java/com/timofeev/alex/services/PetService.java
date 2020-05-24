package com.timofeev.alex.services;

import com.timofeev.alex.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findBiId(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
