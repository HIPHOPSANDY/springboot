package com.project.basics;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booksContoller {
	
	@GetMapping("/books")
		public List<book> getAllBooks(){
			return Arrays.asList(new book(1l,"spring boot", "santhosh kumar"));
		
	}
		
	

}
