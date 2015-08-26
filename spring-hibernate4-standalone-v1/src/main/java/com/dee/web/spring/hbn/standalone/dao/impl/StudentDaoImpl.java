package com.dee.web.spring.hbn.standalone.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dee.web.spring.hbn.standalone.dao.StudentDao;
import com.dee.web.spring.hbn.standalone.model.StudentModel;

/**
 * @author dien.nguyen
 **/

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<StudentModel> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from student");
        List<StudentModel> students = query.list();
        return students;
    }

    @Override
    public StudentModel findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        StudentModel student = (StudentModel) session.get(StudentModel.class, id);
        return student;
    }

    @Override
    @Transactional
    public void save(StudentModel studentModel) {
        Session session = sessionFactory.getCurrentSession();
        session.save(studentModel);
    }

    @Override
    @Transactional
    public void update(StudentModel studentModel) {
        Session session = sessionFactory.getCurrentSession();
        session.update(studentModel);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        StudentModel student = (StudentModel) session.get(StudentModel.class, id);
        if (student != null) {
            session.delete(student);
            return true;
        }
        return false;
    }

}
