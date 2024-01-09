package com.mocadev.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chcjswo on 2020-07-21(021)
 * GitHub: https://github.com/chcjswo
 * Blog: https://mocadev.tistory.com
 */

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hell(Model model) {
		model.addAttribute("data", "hello!!");
		return "hello";
	}

	@GetMapping("/hello2")
	@ResponseBody
	public String hello() {
		return "hello~~";
	}

}
