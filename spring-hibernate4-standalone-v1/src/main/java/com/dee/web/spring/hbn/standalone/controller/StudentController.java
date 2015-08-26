package com.dee.web.spring.hbn.standalone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dee.web.spring.hbn.standalone.service.StudentService;

/**
 * @author dien.nguyen
 **/

@Controller
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentService studentService;
    
}
