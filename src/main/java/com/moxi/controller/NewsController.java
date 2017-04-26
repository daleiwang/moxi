package com.moxi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moxi.model.NewsCategory;
import com.moxi.service.NewsCategoryService;

@Controller
@RequestMapping("/admin")
public class NewsController {

	@Autowired
	private NewsCategoryService newsCategoryService;
	
	@RequestMapping("/newsCategoryManage_{pageCurrent}_{pageSize}_{pageCount}")
	public String newsCategoryManage(NewsCategory newsCategory,@PathVariable Integer pageCurrent,@PathVariable Integer pageSize,@PathVariable Integer pageCount, Model model) {
		//判断
		if(pageSize == 0) pageSize = 10;
		if(pageCurrent == 0) pageCurrent = 1;
		if(pageCount == 0) pageCount = newsCategoryService.count(newsCategory);

		//查询
		newsCategory.setStart((pageCurrent - 1)*pageSize);
		newsCategory.setEnd(pageSize);
		List<NewsCategory> list = newsCategoryService.list(newsCategory);
		
		//输出
		model.addAttribute("pageCurrent", pageCurrent);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("test", "<li class=\"footable-page-arrow\"><a href=\"newsCategoryManage_0_0_0\">«</a></li>");
		model.addAttribute("list", list);
		return "/news/newsCategoryManage";
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/newsManage_{pageSize}_{currentPage}")
	public String newsManage(Model model, @PathVariable Integer pageSize, @PathVariable Integer currentPage) {

		return "/news/newsManage";
	}
}
