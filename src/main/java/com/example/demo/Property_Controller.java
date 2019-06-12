package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Property_Controller
{
	@Autowired
	Property_Service propertyService;
	 @RequestMapping("/")
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	    Property home(Property property)
	 	{
		 try {
		 property = propertyService.create(property);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	        return property;

	    }
	 
	
	 @RequestMapping("/add_property")
	 @CrossOrigin(origins = "*", allowedHeaders = "*")
	    List<Property> findAllProperty() {
	  List<Property> property = propertyService.findAll();
	        return property;
	    }
}
