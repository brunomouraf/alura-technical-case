package br.com.alura.challenge.Entity;


import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "TB_REGISTRATION")
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "USER_ID")
    private int user;
    @Column(name = "COURSE")
    private String course;
    @Column(name = "REGISTRATION_DATE")
    private Date registrationDate;

    public RegistrationEntity() {
    }

    public RegistrationEntity(int user, String course, Date registrationDate) {
        this.user = user;
        this.course = course;
        this.registrationDate = registrationDate;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
