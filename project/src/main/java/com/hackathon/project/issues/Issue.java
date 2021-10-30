package com.hackathon.project.issues;

import com.hackathon.project.users.User;

import java.util.UUID;

public class Issue {
    private UUID id;
    private User person;
    private String subject;
    private String content;

    public Issue() {
    }

    public Issue(User person, String subject, String content) {
        this.person = person;
        this.subject = subject;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getPerson() {
        return person;
    }

    public void setPerson(User person) {
        this.person = person;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
