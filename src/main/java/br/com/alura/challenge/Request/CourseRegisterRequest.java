package br.com.alura.challenge.Request;

import br.com.alura.challenge.Entity.CourseEntity;
import br.com.alura.challenge.Enum.RoleEnum;
import br.com.alura.challenge.Enum.StatusEnum;

import java.util.Date;

public class CourseRegisterRequest {

    private RoleEnum rolePermission;
    private String name;
    public String code;
    private String instructor;
    private String description;
    private StatusEnum status;
    private Date creationDate;
    private Date inativationDate;

    public CourseRegisterRequest() {
    }


    public CourseRegisterRequest(RoleEnum rolePermission, String name, String code, String instructor, String description, StatusEnum status, Date creationDate, Date inativationDate) {
        this.rolePermission = rolePermission;
        this.name = name;
        this.code = code;
        this.instructor = instructor;
        this.description = description;
        this.status = status;
        this.creationDate = creationDate;
        this.inativationDate = inativationDate;
    }

    public RoleEnum getRolePermission() {
        return rolePermission;
    }

    public void setRolePermission(RoleEnum rolePermission) {
        this.rolePermission = rolePermission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getInativationDate() {
        return inativationDate;
    }

    public void setInativationDate(Date inativationDate) {
        this.inativationDate = inativationDate;
    }

    public CourseEntity saveRequestObject(){
        CourseEntity course = new CourseEntity();
        course.setName(this.name);
        course.setCode(this.code);
        course.setInstructor(this.instructor);
        course.setDescription(this.description);
        course.setStatus(this.status);

        return course;
    }
}
