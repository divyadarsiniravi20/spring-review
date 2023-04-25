package skct.demo.divya33;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller


public class Dhivyan {
	@Value("${namevalue:Simran}")
	public String name;
	@GetMapping("/akii")
	@ResponseBody

	public String display()
	
	{
		return "I love"+name;
	}

}
