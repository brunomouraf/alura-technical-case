package br.com.alura.challenge.Entity;

import br.com.alura.challenge.Enum.StatusEnum;

import java.util.Date;

public class CourseEntity {

    private int id;
    private String name;
    private String code;
    private String description;
    private StatusEnum status;
    private Date creationDate;
    private Date inactivationDate;

    public CourseEntity() {
    }

    public CourseEntity(int id, String name, String code, String description, StatusEnum status, Date creationDate, Date inactivationDate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.status = status;
        this.creationDate = creationDate;
        this.inactivationDate = inactivationDate;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Date getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(Date inactivationDate) {
        this.inactivationDate = inactivationDate;
    }
}
