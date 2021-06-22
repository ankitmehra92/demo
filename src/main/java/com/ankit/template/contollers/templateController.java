package com.ankit.template.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class templateController 
{
	@Autowired
	private Environment env;
	@RequestMapping(path = "/namevar", method = RequestMethod.GET)
	public ResponseEntity<String> getNameVar() {
	String nameVar = env.getProperty("NAME");
	return new ResponseEntity<String>("Hello "+nameVar, HttpStatus.OK);
	}
}