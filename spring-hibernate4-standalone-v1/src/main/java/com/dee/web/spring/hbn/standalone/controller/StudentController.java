package com.dee.web.spring.hbn.standalone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dee.web.spring.hbn.standalone.dto.Student;
import com.dee.web.spring.hbn.standalone.service.StudentService;

/**
 * @author dien.nguyen
 **/

@Controller
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String getAllStudent(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("results", students);
        return "student_list";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getStudentDetail(@PathVariable(value = "id") Long id, Model model) {
        Student student = studentService.getById(id);
        model.addAttribute("student", student);
        return "student_detail";
    }
}
