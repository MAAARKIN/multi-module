package br.com.multi.example;

import lombok.Getter;
import lombok.Setter;
/**
*
* Example class 
*
*/
public class User {
	
	@Getter
	@Setter
	private String name;
	
	public User() {
		System.out.println("User object created!");
	}

}
