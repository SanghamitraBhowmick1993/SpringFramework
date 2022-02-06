package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sang")
public class SangController {

	
	@GetMapping(
		      path = "/getMessage",
		      params = {"firstname","lastname"})
		  public Message getMessage(@RequestParam final String firstname,@RequestParam final String lastname) {

		    final Message message = new Message();
		    message.setText("Hello " + firstname + " "+ lastname);
		    return message;
		  }
	
}
