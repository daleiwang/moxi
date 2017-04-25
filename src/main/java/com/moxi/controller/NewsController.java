package com.moxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class NewsController {

	
	@RequestMapping("/newsManage_{pageSize}_{currentPage}")
	public String newsManage(Model model, @PathVariable Integer pageSize, @PathVariable Integer currentPage) {
		
		
		
		
		
		return "/news/newsManage";
	}
}
