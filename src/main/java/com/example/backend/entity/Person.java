package com.example.backend.entity;

import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="User")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements UserDetails{

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    //for define inside the column
    @Column(name = "Firstname")
    protected String  nom;
    @Column(name = "Lastname")
    protected String prenom;
    @Column(name = "Birthday")
    protected String datedenaissance;
    @Column(name = "Mail")
    protected String adr;
    @Column(name = "Adress")
    protected String ville;

    //constructor
        public Person(Long id,String nom, String prenom, String datedenaissance, String adr, String ville) {
            this.id=id;
            this.nom = nom;
            this.prenom = prenom;
            this.datedenaissance = datedenaissance;
            this.adr = adr;
            this.ville = ville;
    }


    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsername'");
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    
}