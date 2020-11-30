package com.example.crud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class Controller {
	@Autowired
	ServiceClass ser;
	@GetMapping("/")
	public ResponseEntity<String> index() {
		System.out.println("called");
		return new  ResponseEntity<String>("\"Welcome to Spring Boot APP!",HttpStatus.OK);
	}
	
	@GetMapping("/entry")
	public String entry() {
		System.out.println("connected!");
		return "Successfully Connected!";
	}
	
	@PostMapping(
	        value = "/postReview",
	        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	    public void postBody(@RequestBody BeanClass obj) {
					ser.saveData(obj);
		           System.out.println("obj "+obj.getName()+obj.getRating()+obj.getReview());
	        
	    }
}
