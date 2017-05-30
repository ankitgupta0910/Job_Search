package Controllers;

import Backend.RecruiterServices;
import Model.*;
import Repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RecruiterController {



    @Autowired
    private RecruiterServices recruiterServices;



//    @RequestMapping("/")
//    public String home(){
//        return "home";
//    }
//
//    @RequestMapping("/signup")
//    public String signup(){
//        return "signup";
//    }
//
//    @RequestMapping("/signin")
//    public String signin(){
//        return "signin";
//    }

    @RequestMapping("/recruiter_signup")
    public String recruiter_signup(){
        return "recruiter_signup";
    }

    @RequestMapping(value= "/recruiter_signup_submit", method=RequestMethod.POST )
    public String recruiter_signup_submit(@ModelAttribute("recruiter") Recruiter recruiter, Model model){

        if (recruiterServices.addRecruiter(recruiter)){
            System.out.println("Congrats ! added");
            model.addAttribute("recruiter", recruiter);
        } else
            System.out.println("Unable to add");

        return "recruiter_more_details";
    }

//    @ResponseBody
//    @RequestMapping(value= "/addSkills", method=RequestMethod.POST )
//    public List<Skills> addSkills(@ModelAttribute("skills") Skills skills){
//        skillsRepository.save(skills);
//        return skillsRepository.findAll();
////        return "employee_more_details";
//    }
}
