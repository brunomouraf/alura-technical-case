package br.com.alura.challenge.Entity;

import br.com.alura.challenge.Enum.StatusEnum;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_COURSE")
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATUS")
    private StatusEnum status;
    @Column(name = "CREATION_DATE")
    private Date creationDate;
    @Column(name = "INACTIVATION_DATE")
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
