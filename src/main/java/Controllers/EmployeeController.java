package Controllers;

import Backend.*;
import Model.*;
import Repository.*;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
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

//    @ResponseBody
    @RequestMapping(value= "/addSkills", method=RequestMethod.POST )
    public String addSkills(@ModelAttribute("skills") Skills skills, Model model){
        System.out.println(skills.getEmpEmail());
        skillsRepository.save(skills);

        RestTemplate restTemplate = new RestTemplate();

        String glassdoorResponse = restTemplate.getForObject("http://service.dice.com/api/rest/jobsearch/v1/simple.json?skill=salesforce&city=94566",
                String.class);

        System.out.println(glassdoorResponse);
        JSONObject jsonObj = null;
        JSONArray jsonArray = null;
        ArrayList<Dice> arrDc = new ArrayList<Dice>();

        try {
            jsonObj = new JSONObject(glassdoorResponse);
            jsonArray = new JSONArray(jsonObj.getString( "resultItemList"));

            for (int i =0; i<jsonArray.length(); i++)
            {
                arrDc.add(new Dice(jsonArray.getJSONObject(i).getString("detailUrl"),
                        jsonArray.getJSONObject(i).getString("jobTitle"),
                        jsonArray.getJSONObject(i).getString("company"),
                        jsonArray.getJSONObject(i).getString("date"),
                        jsonArray.getJSONObject(i).getString("location")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        DiceWrapper dw = new DiceWrapper();
        dw.setJobList(arrDc);

        model.addAttribute("DW", dw);

        return "employee_jobs";
    }
}
