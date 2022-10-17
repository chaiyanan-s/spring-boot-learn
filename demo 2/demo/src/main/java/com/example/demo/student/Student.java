package com.example.demo.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private Integer id;
    private String teamname;
    private String name;
    private String status;

    public Student() {
    }

    public Student(Integer id,
                   String teamname,
                   String name,
                   String status) {
        this.id = id;
        this.teamname = teamname;
        this.name = name;
        this.status = status;
    }

    public Student(String teamname, String name, String status) {
        this.teamname = teamname;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", teamname='" + teamname + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
