package com.taskapp.taskapplication;

import javax.persistence.*;

@Entity
@Table(name = "tasky")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String note;

    public Task() {
    }

    public Task(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                ", name='" + name + '\'' +
//                ", note='" + note + '\'' +
//                '}';
//    }
}
