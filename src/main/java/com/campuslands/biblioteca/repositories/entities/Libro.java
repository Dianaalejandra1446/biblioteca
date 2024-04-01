package com.campuslands.biblioteca.repositories.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "libros")
@Data
public class Libro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "El titulo no puede estar vacio")
    private String titulo;
    private String autor;
    private String género;
    private Date anioPublicacion;
    @NotEmpty(message = "El año de publicacion no puede estar vacio")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Integer cantidad;
}
