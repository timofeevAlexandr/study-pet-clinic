package com.timofeev.alex.services;

import com.timofeev.alex.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
