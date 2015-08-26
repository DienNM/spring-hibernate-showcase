package com.dee.web.spring.hbn.standalone.service;

import java.util.List;

import com.dee.web.spring.hbn.standalone.dto.Student;

/**
 * @author dien.nguyen
 **/

public interface StudentService {
    
    Student getById(Long id);
    
    List<Student> getAll();
    
    Student add(Student student);
    
    boolean update(Student student);
    
    boolean delete(Long id);
}
