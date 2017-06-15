package com.moxi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.moxi.model.Admin;
import com.moxi.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	/**
	 * 登录跳转
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/admin/login")
	public String loginGet(Model model) {
		return "login";
	}

	/**
	 * 登录
	 * 
	 * @param admin
	 * @param model
	 * @param httpSession
	 * @return
	 */
	@PostMapping("/admin/login")
	public String loginPost(Admin admin, Model model, HttpSession httpSession) {
		Admin adminRes = adminService.findByNameAndPassword(admin);
		if (adminRes != null) {
			httpSession.setAttribute("admin", adminRes);
			return "redirect:dashboard";
		} else {
			model.addAttribute("error", "用户名或密码错误，请重新登录！");
			return "login";
		}
	}

	/**
	 * 注册
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/admin/register")
	public String register(Model model) {
		return "register";
	}

	/**
	 * 仪表板页面
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/admin/dashboard")
	public String dashboard(Model model) {
		return "dashboard";
	}
}
