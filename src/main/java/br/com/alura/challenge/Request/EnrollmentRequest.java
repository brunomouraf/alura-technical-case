package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Entity.EnrollmentEntity;
import jakarta.persistence.Column;

import java.time.LocalDate;

public class EnrollmentRequest {

    private String user;

    private String course;

    private LocalDate registrationDate = LocalDate.now();

    public EnrollmentRequest() {
    }

    public EnrollmentRequest(String user, String course, LocalDate registrationDate) {
        this.user = user;
        this.course = course;
        this.registrationDate = registrationDate;
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

    public EnrollmentEntity saveRequestObject(){
        EnrollmentEntity enrollment = new EnrollmentEntity();
        enrollment.setUser(this.user);
        enrollment.setCourse(this.course);
        enrollment.setRegistrationDate(this.registrationDate);


        return enrollment;
    }
}
