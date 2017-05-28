package Controllers;

import Backend.*;
import Model.*;
import Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ankitgupta on 5/26/17.
 */
@Controller
public class EmployeeController {



    @Autowired
    private EmployeeServices employeeServices;

    private SkillsRepository skillsRepository;


    public EmployeeController(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/signup")
    public String signup(){
        return "signup";
    }

    @RequestMapping("/signin")
    public String signin(){
        return "signin";
    }

    @RequestMapping("/employee_signup")
    public String employee_signup(){
        return "employee_signup";
    }

    @RequestMapping(value= "/employee_signup_submit", method=RequestMethod.POST )
    public String employee_signup_submit(@ModelAttribute("employee") Employee employee, Model model){

        if (employeeServices.addEmployee(employee)){
            System.out.println("Congrats ! added");
            model.addAttribute("employee", employee);
        } else
            System.out.println("Unable to add");

        return "employee_more_details";
    }

    @ResponseBody
    @RequestMapping(value= "/addSkills", method=RequestMethod.POST )
    public List<Skills> addSkills(@ModelAttribute("skills") Skills skills){
        skillsRepository.save(skills);
        return skillsRepository.findAll();
//        return "employee_more_details";
    }
}
