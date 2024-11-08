package com.dallaproracing.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dallaproracing.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User m = new User("1", "Maria", "maria@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(m));
		return ResponseEntity.ok().body(list);
	}
}
