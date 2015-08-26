package com.dee.web.spring.hbn.standalone.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dee.web.spring.hbn.standalone.dao.StudentDao;
import com.dee.web.spring.hbn.standalone.dto.Student;
import com.dee.web.spring.hbn.standalone.model.StudentModel;
import com.dee.web.spring.hbn.standalone.service.StudentService;

/**
 * @author dien.nguyen
 **/

@Service
public class StudentServiceImpl implements StudentService {
    
    @Autowired
    private StudentDao studentDao;
    
    @Override
    public Student getById(Long id) {
        StudentModel studentModel = studentDao.findById(id);
        if(studentModel == null) {
            return null;
        }
        return Student.convert2Dto(studentModel);
    }

    @Override
    public List<Student> getAll() {
        List<StudentModel> studentModels = studentDao.findAll();
        List<Student> students = new ArrayList<Student>();
        for(StudentModel model: studentModels) {
            students.add(Student.convert2Dto(model));
        }
        return students;
    }

    @Override
    public Student save(Student student) {
        if(student == null) {
            return null;
        }
        StudentModel studentModel = Student.convert2Model(student);
        studentDao.save(studentModel);
        Student pStudent = Student.convert2Dto(studentModel);
        return pStudent;
    }

    @Override
    public boolean update(Student student) {
        if(student == null || student.getId() == null) {
            return false;
        }
        StudentModel oldStudentModel = studentDao.findById(student.getId());
        if(oldStudentModel == null) {
            System.out.println(String.format("Student %s cannot be found.", student.getId()));
            return false;
        }
        StudentModel newStudentModel = Student.convert2Model(student);
        studentDao.update(newStudentModel);
        return true;
    }

    @Override
    public boolean delete(Long id) {
        if(id == null) {
            return false;
        }
        return studentDao.delete(id);
    }

}
