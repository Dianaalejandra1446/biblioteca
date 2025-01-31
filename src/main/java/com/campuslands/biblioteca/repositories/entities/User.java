package com.campuslands.biblioteca.repositories.entities;

import java.math.BigInteger;
import java.util.List;

import javax.validation.constraints.Email;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Email(message = "No cumple con el formato de una cuenta de correo")
    @Column(nullable = false,unique = true)
    private String email;
    @Column(name = "pwd")
    private String password;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private List<Roles> roles;
}
