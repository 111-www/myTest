package com.gec.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.eclipse.core.internal.runtime.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gec.pojo.User;
import com.gec.service.ProductService;
import com.gec.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;

	@RequestMapping("/dologin")
	public ModelAndView doLogin(User user,HttpSession session){
		ModelAndView mav = new ModelAndView();
		List<Product> list = productService.getAll();
		User u = userService.login(user);
		if(u!=null){	
			session.setAttribute("user", u);
		}
		mav.addObject("productList",list);
		mav.setViewName("welcome");
		return mav;
	}
	
}
