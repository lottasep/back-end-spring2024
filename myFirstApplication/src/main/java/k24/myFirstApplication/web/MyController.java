package k24.myFirstApplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping(value = {"/index", "/"})
	@ResponseBody public String showMainPage() {
		return "This is the front page";
	}
	
	@RequestMapping("/hello")
	public String showGreetings(@RequestParam (name="nimi", required=false) String name, Model model) {
		model.addAttribute("name", name);
		return "main";
	}

}

/*
 * @Controller public class MyController {
 * 
 * @RequestMapping("/")
 * 
 * @ResponseBody public String returnBoo() { return "böö"; }
 * 
 * @RequestMapping("index")
 * 
 * @ResponseBody public String returnIndex() { return "This is the main page"; }
 * 
 * @RequestMapping("contact")
 * 
 * @ResponseBody public String returnContact() { return
 * "This is the contact page"; }
 * 
 * @RequestMapping("hello")
 * 
 * @ResponseBody public String returnHello(
 * 
 * @RequestParam(name="location", required=false, defaultValue="moon") String
 * location,
 * 
 * @RequestParam(name = "name", required=false, defaultValue="John") String
 * name) { return "Welcome to the " + location + " " + name + "!" ; }
 * 
 * @RequestMapping("main")
 * 
 * @ResponseBody public String returnMessage() { return
 * "Spring Boot -sovellukseni!"; }
 * 
 * @RequestMapping("sayHello")
 * 
 * @ResponseBody public String returnGreeting(@RequestParam (name="nimesi",
 * required=false, defaultValue="Muumi") String etunimi) { return "Hei " +
 * etunimi; }
 * 
 * 
 * @RequestMapping("sayHelloAndAge")
 * 
 * @ResponseBody public String returnAnotherGreeting(
 * 
 * @RequestParam(name="nimesi", required=false, defaultValue="Muumi") String
 * etunimi,
 * 
 * @RequestParam(name = "ikasi", required=false, defaultValue="10") int ika) {
 * return "Hei " + etunimi + ", " + ika + " vuotta"; }
 * 
 * 
 * }
 */
