package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/")
	   public String home() {
	      return "Eureka Client application";
	}
	
	
}
