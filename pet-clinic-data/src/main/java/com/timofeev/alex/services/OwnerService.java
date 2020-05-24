package com.timofeev.alex.services;

import com.timofeev.alex.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findBiId(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
