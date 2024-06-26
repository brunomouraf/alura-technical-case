package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entity.UserEntity;
import br.com.alura.challenge.Enum.RoleEnum;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.Date;

public class UserRegisterRequest {

    private String name;
    public String userName;
    private String email;
    private String password;
    private RoleEnum role;
    private LocalDate creationDate;

    public UserRegisterRequest() {
    }

    public UserRegisterRequest(String name, String userName, String email, String password, RoleEnum role, LocalDate creationDate) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public UserEntity saveRequestObject(){
        UserEntity user = new UserEntity();
        user.setName(this.name);
        user.setUserName(this.userName);
        user.setEmail(this.email);
        user.setPassword(this.password);
        user.setRole(this.role);

        return user;
    }
}
