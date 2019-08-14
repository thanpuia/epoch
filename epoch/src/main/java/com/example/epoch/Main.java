package com.example.epoch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Main {
	@GetMapping("test")
	public String test(Model theModel) {
		
        Map<String, Long> epoch = new HashMap<String, Long>();
        long testTime =1565756180;
        
        epoch.put("time", testTime);
        
		theModel.addAttribute("myTime",epoch );
		return "epoch";
	}
	
	
}
