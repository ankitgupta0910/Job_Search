package Model;

import javax.persistence.*;

/**
 * Created by ankitgupta on 5/27/17.
 */
@Entity
public class Recruiter {

    @Id
    String recruiterEmail;
    String recruiterName;
    String recruiterPassword;
    String recruiterContact;
    Address address;

    public String getrecruiterEmail() {
        return recruiterEmail;
    }

    public void setrecruiterEmail(String recruiterEmail) {
        this.recruiterEmail = recruiterEmail;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "Recruiter", cascade = CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public String getrecruiterName() {
        return recruiterName;
    }

    public void setrecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    public String getrecruiterPassword() {return recruiterPassword;}

    public void setrecruiterPassword(String password) {this.recruiterPassword = password;}

    public String getrecruiterContact() {
        return recruiterContact;
    }

    public void setrecruiterContact(String recruiterContact) {
        this.recruiterContact = recruiterContact;
    }
}

