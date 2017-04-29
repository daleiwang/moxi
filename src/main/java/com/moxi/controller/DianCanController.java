package com.moxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DianCanController {

	
	@GetMapping("/diancan")
	public String loginGet(Model model) {
		
		return "diancan";
	}
}
