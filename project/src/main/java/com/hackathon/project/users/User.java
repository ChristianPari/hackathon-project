package com.hackathon.project.users;

import com.hackathon.project.issues.Issue;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private List<String> roles;
    private List<Issue> issues;
    private Integer issuesHandled;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public Integer getIssuesHandled() {
        return issuesHandled;
    }

    public void setIssuesHandled(Integer issuesHandled) {
        this.issuesHandled = issuesHandled;
    }
}
