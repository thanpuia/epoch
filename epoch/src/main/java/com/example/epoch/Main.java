package com.example.epoch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Main {
	@GetMapping("test")
	public String test(Model theModel) {
		long dd=1565704174;
		theModel.addAttribute("d", dd);
		return "epoch";
	}
}
