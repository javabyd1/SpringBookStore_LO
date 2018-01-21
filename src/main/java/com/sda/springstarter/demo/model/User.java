package com.sda.springstarter.demo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int id;

    @Email(message = "Podaj prawidlowy adres")
    @NotNull(message = "podaj adres email")
    private String email;

    @Length(min = 8, message = "Hasło powinno mieć minimum 8 znakow")
    @NotEmpty(message = "Podaj haslo")
    private String password;

    @NotEmpty(message = "Podaj imie")
    private String name;
    @NotEmpty(message = "Podaj nazwisko")
    private String lastname;
    private int active;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role",
     joinColumns = @JoinColumn(name="user_id"),
     inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Roles> rolesSet;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Roles> getRolesSet() {
        return rolesSet;
    }

    public void setRolesSet(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
    }
}
