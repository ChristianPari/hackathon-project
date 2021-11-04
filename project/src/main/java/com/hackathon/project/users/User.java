package com.hackathon.project.users;

import com.hackathon.project.issues.Issue;

//import javax.persistence.Entity;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

//@Entity
public class User {
    public static AtomicLong atomicLong = new AtomicLong();
    private Long id = atomicLong.incrementAndGet();
    private String firstName;
    private String lastName;
    private String password;
    private List<String> roles;
    private Integer issuesHandled;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Integer getIssuesHandled() {
        return issuesHandled;
    }

    public void setIssuesHandled(Integer issuesHandled) {
        this.issuesHandled = issuesHandled;
    }
}
