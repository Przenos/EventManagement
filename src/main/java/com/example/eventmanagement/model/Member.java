package com.example.eventmanagement.model;

public class Member {
private String login;
private String password;
private String nick;
private String mail;

    public Member(String login, String password, String nick, String mail) {
        this.login = login;
        this.password = password;
        this.nick = nick;
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
