package com.example.demo.Classex2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValuuExa {
	@Value("${carname}")
	public String car;
	@GetMapping("/mycar")
	@ResponseBody
	public String displayCat()
	{
		return "My fav car "+car;
	}
}


