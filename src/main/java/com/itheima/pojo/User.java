package com.itheima.pojo;

public class User {
    private String namae;
    private String email;

    public String getNamae() {
        return namae;
    }

    public void setNamae(String namae) {
        this.namae = namae;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "namae='" + namae + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
