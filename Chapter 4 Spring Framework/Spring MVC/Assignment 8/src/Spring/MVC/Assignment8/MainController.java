package Spring.MVC.Assignment8;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
	@RequestMapping(value="/welcome.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("Login");
      return m;
   }
	@RequestMapping(value="MVC-assignment-8/English.html",method=RequestMethod.GET)
	public ModelAndView English()
	{
			ModelAndView m1= new ModelAndView("English");
			return m1;
	}
	@RequestMapping(value="MVC-assignment-8/French.html",method=RequestMethod.GET)
	public ModelAndView French()
	{
			ModelAndView m1= new ModelAndView("French");
			return m1;
	}
	@RequestMapping(value="MVC-assignment-8/Vietnamese.html",method=RequestMethod.GET)
	public ModelAndView pringTheMessage1()
	{
			ModelAndView m1= new ModelAndView("Vietnamiese");
			return m1;
	}
}
