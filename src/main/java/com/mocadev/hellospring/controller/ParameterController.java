package com.mocadev.hellospring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParameterController {

	private static final Logger logger = LoggerFactory.getLogger(ParameterController.class);

	@PostMapping("/login-with-id-password")
	public String loginWithIdPassword(@RequestBody IdAndPassword idAndPassword) {
		logger.info("{} / {}", idAndPassword.getId(), idAndPassword.getPassword());

		return "Login Success";
	}

	static class IdAndPassword {
		private String id;
		private String password;

		public String getId() {
			return id;
		}

		public String getPassword() {
			return password;
		}
	}
}
