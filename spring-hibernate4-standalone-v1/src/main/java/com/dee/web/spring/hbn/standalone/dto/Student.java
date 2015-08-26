package com.dee.web.spring.hbn.standalone.dto;

import com.dee.web.spring.hbn.standalone.model.StudentModel;

/**
 * @author dien.nguyen
 **/

public class Student {
    
    private Long id;
    
    private String name;
    
    private String email;
    
    public static Student convert2Dto(StudentModel source) {
        Student dest = new Student();
        dest.setEmail(source.getEmail());
        dest.setId(source.getId());
        dest.setName(source.getName());
        return dest;
    }
    
    public static StudentModel convert2Model(Student source) {
        StudentModel dest = new StudentModel();
        dest.setEmail(source.getEmail());
        dest.setId(source.getId());
        dest.setName(source.getName());
        return dest;
    }

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
