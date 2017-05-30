package Backend;

import Model.*;
import Utility.DataBaseHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ankitgupta on 5/27/17.
 */
@Service
public class RecruiterServices {

    @Autowired
    private DataBaseHandler database;

    public boolean addRecruiter(Recruiter recruiter){

        database.pushObjectInDB(Recruiter.class, recruiter);

        return true;
    }

    public boolean updateEmployee(String empId){

        //Do database
        return true;
    }

    public Employee deleteEmployee(String empId){

        Employee employee = (Employee)database.getObjectbyId(Employee.class, empId);

        database.deleteObjectInDB(Employee.class, employee);

        return employee;
    }

    public ArrayList<Employee> getAllEmployees(){

        //Do database
        return null;
    }

}
