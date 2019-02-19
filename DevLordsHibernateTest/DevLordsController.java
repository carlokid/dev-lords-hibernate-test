package com.ePassport2Core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ePassport2Core.domain.DevLords;
import com.ePassport2Core.service.DevLordsService;

@RestController
public class DevLordsController {

	@Autowired
	private DevLordsService devLordsService;

    @RequestMapping({"/devlords/list", "/devlords"})
    public List<DevLords> listDevLords(Model model){
        //model.addAttribute("devlords", devLordsService.listAll());
        return devLordsService.listAll();
    }

    @RequestMapping("/devlords/show/{id}")
    public String getProduct(@PathVariable String id, Model model){
    	//System.out.println("Get user: " + devLordsService.getById(Long.valueOf(id)).getFirstName());
        model.addAttribute("devlords", devLordsService.getById(Long.valueOf(id)));
        DevLords dev = devLordsService.getById(Long.valueOf(id));
        return "Master: " + dev.getFirstName() + " " + dev.getLastName();
    }
}
