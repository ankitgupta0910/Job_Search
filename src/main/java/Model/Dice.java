package Model;

import org.springframework.stereotype.Service;

/**
 * Created by ankitgupta on 5/29/17.
 */
public class Dice {

    String detailUrl;
    String jobTitle;
    String company;
    String location;
    String date;

    public Dice(String detailUrl, String jobTitle, String company, String date, String location) {
        this.detailUrl = detailUrl;
        this.jobTitle = jobTitle;
        this.company = company;
        this.date = date;
        this.location = location;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
