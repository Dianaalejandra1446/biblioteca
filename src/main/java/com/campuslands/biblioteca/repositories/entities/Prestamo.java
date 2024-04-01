package com.campuslands.biblioteca.repositories.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "prestamo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_prestamo;
    @OneToOne
    private User infoUsuario;
    private Libro libroSolicitado;
    @Temporal(TemporalType.DATE)
    private Date fecha_prestamo;
    @Temporal(TemporalType.DATE)
    private Date fecha_devolucion;
}
