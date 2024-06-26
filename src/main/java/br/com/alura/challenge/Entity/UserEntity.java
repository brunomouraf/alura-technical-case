package br.com.alura.challenge.Entity;

import br.com.alura.challenge.Enum.RoleEnum;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "TB_USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE")
    private RoleEnum role;
    @Column(name = "CREATION_DATE")
    private LocalDate creationDate = LocalDate.now();

    public UserEntity() {
    }

    public UserEntity(int id, String name, String userName, String email, String password, RoleEnum role, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}


