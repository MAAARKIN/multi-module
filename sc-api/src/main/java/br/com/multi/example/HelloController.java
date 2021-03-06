package br.com.multi.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.multi.example.User;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/{name}")
	public String hello(@PathVariable String name) {
		System.out.println("GET Invoked!");
		User user = new User();
		user.setName(name);
		return "Hello: " + user.getName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void post() {
		// TODO: Implementation for HTTP POST request
		System.out.println("POST invoked");
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void put() {
		// TODO: Implementation for HTTP PUT request
		System.out.println("PUT invoked");
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete() {
		// TODO: Implementation for HTTP DELETE request
		System.out.println("DELETE invoked");
	}
}
