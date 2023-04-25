package skct.demo.divya11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Daniel {
	@GetMapping("/akila")
	@ResponseBody
	public String display()
	{
		return "Welcome to RESTAPI";
	}

}
