package com.ecom;

import java.util.Objects;

public class User {
    private String username;
    private String name;    
    private String city;
    private String gender;
    private String password;
    
    /*
    SQL QUERY
    create table ecomm_user
    (
    username varchar(15) primary key,
    name varchar(20),
    city varchar(10),
    gender varchar(5)
    );
    */
    public User(String username, String name, String city, String gender, String password) {
        this.username = username;
        this.name = name;
        this.city = city;
        this.gender = gender;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", name=" + name + ", city=" + city + ", gender=" + gender + '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}