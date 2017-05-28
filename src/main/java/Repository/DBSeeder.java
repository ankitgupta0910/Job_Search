package Repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner {

    private SkillsRepository skillsRepository;

    public DBSeeder(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
//        Skills skills = new Skills();
//        skills.setEmpEmail("Ank@asd.com");
//        ArrayList<String> empSkills = new ArrayList<>();
//        empSkills.add("Core Java");
//        empSkills.add("Spring");
//        skills.setEmpSkills(empSkills);
//
//        ArrayList<String> empLocation = new ArrayList<>();
//        empLocation.add("Bay Area");
//        empLocation.add("California");
//        skills.setEmpLocation(empLocation);
//
//        skills.setEmpExperience("0-4 years");

//        this.skillsRepository.
//        this.skillsRepository.save();
        this.skillsRepository.deleteAll();
    }
}