package com.hackathon.project.issues;

import com.hackathon.project.users.User;

import java.util.UUID;

public class Issue {
    private UUID id = UUID.randomUUID();
    private User user;
    private String subject;
    private String content;

    public Issue() {
    }

    public Issue(User user, String subject, String content) {
        this.user = user;
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
        return user;
    }

    public void setPerson(User user) {
        this.user = user;
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
