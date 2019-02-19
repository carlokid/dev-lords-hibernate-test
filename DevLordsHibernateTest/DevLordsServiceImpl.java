package com.ePassport2Core.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ePassport2Core.domain.DevLords;
import com.ePassport2Core.repositories.DevLordsRepository;
import com.ePassport2Core.service.DevLordsService;

@Service
public class DevLordsServiceImpl implements DevLordsService{

	@Autowired
	private DevLordsRepository dlRepository;

	/*@Override
    public DevLords getDevLordsByFirstName(String name) {
        return dlRepository.findByFirstName(name);
    }*/
	
    @Autowired
    public DevLordsServiceImpl(DevLordsRepository dlRepository) {
        this.dlRepository = dlRepository;
    }

    @Override
    public List<DevLords> listAll() {
        List<DevLords> dlords = new ArrayList<>();
        dlRepository.findAll().forEach(dlords::add); //fun with Java 8
        return dlords;
    }

    @Override
    public DevLords getById(Long id) {
        return dlRepository.findOne(id);
    }

    @Override
    public DevLords saveOrUpdate(DevLords product) {
    	dlRepository.save(product);
        return product;
    }

    @Override
    public void delete(Long id) {
    	dlRepository.delete(id);

    }
}
