package Spring.mvc.assignment10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    static List<Employee> EmployeeList=new ArrayList<>(Arrays.asList(
            new Employee("1","A","10000"),
            new Employee("2","B","100001"),
            new Employee("3","C","100002"),
            new Employee("4","D","100003"),
            new Employee("5","E","100004"),
            new Employee("6","F","100005"),
            new Employee("7","G","100006"),
            new Employee("8","H","100007"),
            new Employee("9","I","100008"),
            new Employee("10","J","100090"),
            new Employee("11","K","100010"),
            new Employee("12","L","100020"),
            new Employee("13","M","100030"),
            new Employee("14","N","100040"),
            new Employee("15","O","100050")));

    @RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage()
    {
		ModelAndView m= new ModelAndView("index");
        return m;
    }
    
	@RequestMapping(value="f5",method=RequestMethod.GET)
    public ModelAndView view1()
    {
        
        ModelAndView mv=new ModelAndView("showAllEmployee");
        mv.addObject("list",EmployeeList.subList(0,15));
        return mv;
    }
}
