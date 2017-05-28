package Model;

import javax.persistence.*;

/**
 * Created by ankitgupta on 5/27/17.
 */
@Entity
public class Employee {

    @Id
    String empEmail;
    String empName;
    String empPassword;
    String empContact;
    Address address;

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Employee", cascade = CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPassword() {return empPassword;}

    public void setEmpPassword(String password) {this.empPassword = password;}

    public String getEmpContact() {
        return empContact;
    }

    public void setEmpContact(String empContact) {
        this.empContact = empContact;
    }
}

