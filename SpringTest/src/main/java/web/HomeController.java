/**
 * 
 */
package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author dzhelilramadan
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=GET)
	public String home() {
		System.out.println("Passed!!!");
		return "home";
	}

}
