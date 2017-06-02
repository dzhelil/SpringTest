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
@RequestMapping({"/", "/homepage"})
public class HomeController {
	
	@RequestMapping(method=GET)
	public String home() {
		System.out.println("Passed!!!");
		return "home";
	}

}
