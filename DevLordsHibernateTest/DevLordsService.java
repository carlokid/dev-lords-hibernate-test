package com.ePassport2Core.service;

import java.util.List;

import com.ePassport2Core.domain.DevLords;

public interface DevLordsService {

	//DevLords getDevLordsByFirstName(String name);

	List<DevLords> listAll();

	DevLords getById(Long id);

	DevLords saveOrUpdate(DevLords product);

    void delete(Long id);
}
