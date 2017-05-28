package Model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by ankitgupta on 5/27/17.
 */

@Document(collection = "Skills")
public class Skills {

    @Id
    String empEmail;
    ArrayList<String> empSkills;
//    File empResume;
    ArrayList<String> empLocation;
    String empExperience;

    public ArrayList<String> getEmpSkills() {
        return empSkills;
    }

    public void setEmpSkills(ArrayList<String> empSkills) {
        this.empSkills = empSkills;
    }

    public ArrayList<String> getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(ArrayList<String> empLocation) {
        this.empLocation = empLocation;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

//    public File getEmpResume() {
//        return empResume;
//    }
//
//    public void setEmpResume(File empResume) {
//        this.empResume = empResume;
//    }


    public String getEmpExperience() {
        return empExperience;
    }

    public void setEmpExperience(String empExperience) {
        this.empExperience = empExperience;
    }

}

