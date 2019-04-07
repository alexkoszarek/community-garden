package communitygarden.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		// Return the View named "home" under /WEB-INF/views/home.jsp
		return "home";
	}

}
