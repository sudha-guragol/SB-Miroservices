package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	//env will be in corba and spring core package.select which is in spring core
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		
		String port = env.getProperty("server.port");
	String msg="welcome to ashok IT" + "server running on port::" +port;
		return msg;
	}
}
