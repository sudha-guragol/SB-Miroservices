package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String GreetMsg()
	{
		return "GOOD MORNING!!!!";
	}
}
