package Spring.MVC.assignment3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
	@RequestMapping(value="/valid.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("Login");
      return m;
   }
	@RequestMapping(value="MVC-assignment-3/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("abcd"))&&(u.getPassword().equals("abcd"))&& (u.getEmail().equals("abcd@gmail.com"))) {
			ModelAndView m1= new ModelAndView("Success");
			m1.addObject("success","Login Success!");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Error");
			m2.addObject("error","Login Failed!. Try Entering valid credentials.");
			return m2;
		}
   }
}
