package skct.demo.divya22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Harish {
	public String name="Divya";
	@GetMapping("/aki")
	@ResponseBody
	public String display()
	{
		return "Welcome to RESTAPI"+name;
	}

}
