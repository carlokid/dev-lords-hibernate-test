package com.ePassport2Core.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ePassport2Core.domain.DevLords;

public interface DevLordsRepository extends CrudRepository<DevLords, Long>{

	public DevLords findByFirstName(String name);
}
