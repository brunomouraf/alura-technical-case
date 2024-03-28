package br.com.alura.challenge.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "TB_ENROLLMENT")
public class EnrollmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "USER_ID")
    private String user;
    @Column(name = "COURSE")
    private String course;

    @Column(name = "HATE")
    private double hate;
    @Column(name = "REGISTRATION_DATE")
    private LocalDate registrationDate = LocalDate.now();

    public EnrollmentEntity() {
    }

    public EnrollmentEntity(String user, String course, LocalDate registrationDate) {
        this.user = user;
        this.course = course;
        this.registrationDate = registrationDate;
    }

    public double getHate() {
        return hate;
    }

    public void setHate(double hate) {
        this.hate = hate;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
