package com.mocadev.hellospring.controller;

import static java.lang.Thread.sleep;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenarioController {

	@PostMapping("/login")
	public String login() throws InterruptedException {
		sleep(20);

		return "Login success";
	}

	@GetMapping("/some-function-one")
	public String someFunctionOne() throws InterruptedException {
		sleep(30);

		return "Result 1";
	}

	@GetMapping("/some-function-two")
	public String someFunctionTwo() throws InterruptedException {
		sleep(15);

		return "Result 2";
	}
}
