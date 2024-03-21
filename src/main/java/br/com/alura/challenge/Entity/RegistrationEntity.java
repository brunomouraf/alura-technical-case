package br.com.alura.challenge.Entity;


import java.util.Date;

public class RegistrationEntity {

    private UserEntity user;
    private CourseEntity course;
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
