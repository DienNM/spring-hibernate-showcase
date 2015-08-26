package com.dee.web.spring.hbn.standalone.model;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author dien.nguyen
 **/

@Entity(name = "student")
public class StudentModel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private String name;
    
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
