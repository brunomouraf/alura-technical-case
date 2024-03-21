package br.com.alura.challenge.Entity;


import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "tb_registration")
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "user")
    private UserEntity user;
    @Column(name = "course")
    private CourseEntity course;
    @Column(name = "registration_date")
    private Date registrationDate;

    public RegistrationEntity() {
    }

    public RegistrationEntity(UserEntity user, CourseEntity course, Date registrationDate) {
        this.user = user;
        this.course = course;
        this.registrationDate = registrationDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public CourseEntity getCourse() {
        return course;
    }

    public void setCourse(CourseEntity course) {
        this.course = course;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
