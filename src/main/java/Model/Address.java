package Model;

import org.springframework.stereotype.Service;

import javax.persistence.Embeddable;

/**
 * Created by ankitgupta on 5/27/17.
 */

@Embeddable
public class Address {

    String empAddress;
    String empCity;
    String empState;
    String empCountry;
    int empZipcode;

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    public int getEmpZipcode() {
        return empZipcode;
    }

    public void setEmpZipcode(int empZipcode) {
        this.empZipcode = empZipcode;
    }

}
