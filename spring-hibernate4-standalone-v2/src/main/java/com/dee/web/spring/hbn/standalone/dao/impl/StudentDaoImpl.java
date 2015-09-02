package com.dee.web.spring.hbn.standalone.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dee.web.spring.hbn.standalone.dao.StudentDao;
import com.dee.web.spring.hbn.standalone.model.StudentModel;

/**
 * @author dien.nguyen
 **/

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    @Transactional
    public List<StudentModel> findAll() {
        Query query = entityManager.createQuery("from student");
        List<StudentModel> students = query.getResultList();
        return students;
    }

    @Override
    @Transactional
    public StudentModel findById(Long id) {
        StudentModel student = (StudentModel) entityManager.find(StudentModel.class, id);
        return student;
    }

    @Override
    @Transactional
    public void save(StudentModel studentModel) {
        entityManager.persist(studentModel);
    }

    @Override
    @Transactional
    public void update(StudentModel studentModel) {
        entityManager.merge(studentModel);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        StudentModel student = (StudentModel) entityManager.find(StudentModel.class, id);
        if (student != null) {
            entityManager.remove(student);
            return true;
        }
        return false;
    }

}
