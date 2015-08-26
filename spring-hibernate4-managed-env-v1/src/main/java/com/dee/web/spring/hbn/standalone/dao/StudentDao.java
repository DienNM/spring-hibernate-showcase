package com.dee.web.spring.hbn.standalone.dao;

import java.util.List;

import com.dee.web.spring.hbn.standalone.model.StudentModel;

/**
 * @author dien.nguyen
 **/

public interface StudentDao {
    
    List<StudentModel> findAll();
    
    StudentModel findById(Long id);
    
    void save(StudentModel studentModel);
    
    void update(StudentModel studentModel);
    
    boolean delete(Long id);
    
}
