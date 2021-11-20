package com.hackathon.userservice.models;

public class Resetpw {
    private String previousPassword;
    private String newPassword;
    private String confirmation;

    public Resetpw(){}

    public Resetpw(String previousPassword, String newPassword, String confirmation) {
        this.previousPassword = previousPassword;
        this.newPassword = newPassword;
        this.confirmation = confirmation;
    }

    public String getPreviousPassword() {
        return previousPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getConfirmation() {
        return confirmation;
    }
}
