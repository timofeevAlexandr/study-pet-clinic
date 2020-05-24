package com.timofeev.alex.services;

import com.timofeev.alex.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBiId(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
