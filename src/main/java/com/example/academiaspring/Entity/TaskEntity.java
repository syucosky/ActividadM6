package com.example.academiaspring.Entity;


import jakarta.persistence.*;

/*
* Usamos la anotacion @Entity para decirle a spring que esta clase
* es una tabla de la base de datos con sus columnas*/
@Entity
@Table(name = "tarea")
public class TaskEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nombreTarea;

    private String descripcionTarea;

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public String getDescripcionTarea() {
        return descripcionTarea;
    }

    public void setDescripcionTarea(String descripcionTarea) {
        this.descripcionTarea = descripcionTarea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
