package Spring.MVC.Assignment4;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	@RequestMapping(value="/welcome.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("Registration");
      return m;
   }
	@RequestMapping(value="MVC-assignment-4/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("naresh"))&&(u.getPassword().equals("naresh"))&& (u.getEmail().equals("naresh@gmail.com"))) {
			List<String> list=new ArrayList<String>();
			list.add(u.getUserName());
			list.add(u.getPassword());
			list.add(u.getPassword());
			ModelAndView m1= new ModelAndView("Login");
			m1.addObject("val",u.getUserName()+" your Data is Stored in the database.");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Error");
			m2.addObject("error","Registration Failed!. Try Again.");
			return m2;
		}
   }
	@RequestMapping(value="MVC-assignment-4/MVC-assignment-4-Login/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage1(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("naresh"))&&(u.getPassword().equals("naresh"))) {
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
